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
                    if (!lemmeHash.values().contains(value)) {
                        lemmeHash.put(key, value);
                    }
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

        return this.lemmeHash.get(word);
    }

    public String[] getPossibleLemmes(String word) {

        String[] lemmeList = new String[1000];

        int cpt = 0;

        Iterator it = lemmeHash.entrySet().iterator();



        while (it.hasNext()) {

            Map.Entry pair = (Map.Entry)it.next();

            int minProx = 60;

            int p = prox(word, pair.getValue().toString(), 3, 10);

            if (p >= minProx) {

                lemmeList[cpt] = pair.getValue().toString();
                cpt++;

            } else {

                //LEVENSTEIN

                int l = levenstein(word, pair.getValue().toString());

                if (l <= 2) {

                    lemmeList[cpt] = pair.getValue().toString();
                    cpt++;
                }
            }
        }

        String[] finalLemmeList = new String[cpt];

        for (int j=0 ; j<cpt ; j++) {
            finalLemmeList[j] = lemmeList[j];
        }

        return finalLemmeList;
    }

    private int prox(String m1, String m2, int seuilMin, int seuilMax) {

        if (m1.length() < seuilMin || m2.length() < seuilMin) {
            return 0;
        } else {
            if (Math.abs(m1.length()-m2.length()) > seuilMax) {
                return 0;
            } else {
                int i = 0;
                while (i < Math.min(m1.length(), m2.length()) && m1.toCharArray()[i] == m2.toCharArray()[i]) {
                    i++;
                }
                return (i*100)/Math.max(m1.length(), m2.length());
            }
        }
    }

    private int levenstein(String m1, String m2) {

        int cout_substitution = 1;
        int cout_insertion = 1;
        int cout_suppression = 1;
        int d1, d2, d3 = 0;

        int[][] dist = new int[m1.length()][m2.length()];

        for (int i=0 ; i< m1.length() ; i++) {

            if (i == 0) {

                dist[i][0] = 0;
            } else {
                dist[i][0] = dist[i-1][0];
            }

            dist[i][0] += cout_suppression;
        }
        for (int j=0 ; j< m2.length() ; j++) {

            if (j == 0) {

                dist[0][j] = 0;
            } else {
                dist[0][j] = dist[0][j-1];
            }

            dist[0][j] += cout_insertion;
        }
        for (int i=1 ; i< m1.length() ; i++) {

            for (int j=1 ; j< m2.length() ; j++) {

                d1 = dist[i-1][j-1];

                if (m1.toCharArray()[i-1] != m2.toCharArray()[j-1]) {
                    d1 += cout_substitution;

                }

                d2 = dist[i-1][j] + cout_suppression;
                d3 = dist[i][j-1] + cout_insertion;
                dist[i][j] = Math.min(d1, Math.min(d2, d3));
            }
        }

        return dist[m1.length()-1][m2.length()-1];
    }
}