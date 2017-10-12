import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.StringTokenizer;

public class Lexique {

    private HashMap<String, String> lemmeHash;

    public Lexique(String fileName) {

        lemmeHash = new HashMap<String, String>();
        File inputFile = new File(fileName);
        BufferedReader br=null;
        String chaine;
        Integer i =0;
        String key = "";
        String value = "";
        try {
            try {
                br = new BufferedReader(new FileReader(fileName));
                while ((chaine = br.readLine()) != null) {
                    StringTokenizer st = new StringTokenizer(chaine);
                    while (st.hasMoreTokens()) {
                        if (i%2 == 0) {
                            key = st.nextToken();
                        } else {
                            value = st.nextToken();
                        }
                        i++;
                    }
                    lemmeHash.put(key, value);
                }
            }
            catch(EOFException e) {
                br.close();
            }
        }
        catch(FileNotFoundException e) {
            System.out.println("fichier inconnu : " + fileName);
        }
        catch(IOException e) {
            System.out.println("IO Exception");
        }
    }

    public String getLemme(String word) {

        return this.lemmeHash.get(word.toLowerCase());
    }

    public String[] getPossibleLemmes(String word) {

        String[] lemmeList = new String[];

        int cpt = 0;

        Iterator it = lemmeHash.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            System.out.println(pair.getKey() + " = " + pair.getValue());

            int minProx = 3;

            if (prox(word, pair.getValue().toString(), 3, 10) >= minProx) {

                lemmeList[cpt] = pair.getValue().toString();
                cpt++;
            }

            it.remove(); // avoids a ConcurrentModificationException
        }

        return lemmeList;
    }

    private int prox(String m1, String m2, int seuilMin, int seuilMax) {

        if (m1.length() < seuilMin || m2.length() < seuilMin) {
            return 0;
        } else {
            if (Math.abs(m1.length()-m2.length()) > seuilMax) {
                return 0;
            } else {
                int i = 1;
                while (m1.toCharArray()[i] == m2.toCharArray()[i] && i < Math.min(m1.length(), m2.length())) {
                    i++;
                }
                return (i*100)/Math.max(m1.length(), m2.length());
            }
        }
    }
}