import java.io.BufferedReader;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World!");

        Lexique myLexique = new Lexique("/Users/alex/Documents/Cours UTC/GI05/LO17/LO17_git/TD3/src/filtreCorpus_P16.txt");

        BufferedReader br=null;
        String chaine;
        try {
            try {
                br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("saisie : ");
                chaine=br.readLine();
                System.out.println("j'ai saisi "+ chaine);

                StringTokenizer st = new StringTokenizer(chaine);
                while (st.hasMoreTokens()) {

                    String word = st.nextToken();

                    String lemme = myLexique.getLemme(word.toLowerCase());

                    if (lemme != null) {

                        chaine = chaine.replaceAll(word, myLexique.getLemme(word.toLowerCase()));

                    } else {

                        String[] possibleLemmes = myLexique.getPossibleLemmes(word.toLowerCase());

                        if (possibleLemmes.length != 0) {
                            System.out.print("\nVoici les lemmes candidats pour le mot " + word + " : \n");

                            for (int i = 1; i <= possibleLemmes.length ; i++) {
                                System.out.print(i + ". " + possibleLemmes[i-1] + "\n");
                            }

                            while (true) {

                                System.out.print("Choix ? : ");
                                String choix = br.readLine();

                                try {
                                    int choice = Integer.parseInt(choix);

                                    if (choice != 0 && choice < possibleLemmes.length) {

                                        chaine = chaine.replaceAll(word, possibleLemmes[choice-1]);

                                        break;
                                    } else {

                                        System.out.print("Choisissez un des nombres proposés svp!");
                                    }

                                } catch (NumberFormatException e) {

                                    System.out.print("Entrez un nombre svp!");
                                }
                            }
                        }
                    }
                }
                System.out.println(chaine);
            }
            catch(EOFException e) {
                br.close();
            }
        }
        catch(IOException e) {
            System.out.println("IO Exception");
        }
    }
}
