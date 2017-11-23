import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World!");

        Lexique myLexique = new Lexique("/Users/alex/Documents/Cours UTC/GI05/LO17/LO17_git/TD4/src/filtreCorpus_P16.txt");

        Scanner sc = null;
        try {
            sc = new Scanner(new File("/Users/alex/Documents/Cours UTC/GI05/LO17/LO17_git/TD4/src/stoplist_P16.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        List<String> lines = new ArrayList<String>();
        while (sc.hasNextLine()) {
            lines.add(sc.nextLine());
        }

        String[] stopListArr = lines.toArray(new String[0]);

        BufferedReader br = null;
        String chaine;
        while (true) {
            try {
                try {
                    br = new BufferedReader(new InputStreamReader(System.in));
                    System.out.print("saisie : ");
                    chaine = br.readLine();
                    System.out.println("j'ai saisi " + chaine);

                    String[] words = chaine.split("\\s|[.!?\\-’”]");

                    for (int i=0 ; i< words.length ; i++) {

                        if (Arrays.asList(stopListArr).contains(words[i].toLowerCase())) {
                            words[i] = "";
                        }
                    }

                    chaine = String.join(" ", words);

                    StringTokenizer st = new StringTokenizer(chaine);
                    while (st.hasMoreTokens()) {

                        String word = st.nextToken();

                        if (word.matches("\\d+")) {
                            continue;
                        }

                        String lemme = myLexique.getLemme(word.toLowerCase());

                        if (lemme != null) {

                            chaine = chaine.replaceAll(word, myLexique.getLemme(word.toLowerCase()));

                        } else {

                            String[] possibleLemmes = myLexique.getPossibleLemmes(word.toLowerCase());

                            if (possibleLemmes.length > 1) {
                                System.out.print("\nVoici les lemmes candidats pour le mot " + word + " : \n");

                                System.out.print("1. " + word + "\n");

                                for (int i = 2; i <= possibleLemmes.length + 1; i++) {
                                    System.out.print(i + ". " + possibleLemmes[i - 2] + "\n");
                                }

                                while (true) {

                                    System.out.print("Choix ? : ");
                                    String choix = br.readLine();

                                    try {
                                        int choice = Integer.parseInt(choix);

                                        if (choice != 0 && choice < possibleLemmes.length + 1) {

                                            if (choice != 1) {

                                                chaine = chaine.replaceAll(word, possibleLemmes[choice - 2]);
                                            }

                                            break;
                                        } else {

                                            System.out.print("Choisissez un des nombres proposés svp!");
                                        }

                                    } catch (NumberFormatException e) {

                                        System.out.print("Entrez un nombre svp!");
                                    }
                                }
                            } else if (possibleLemmes.length == 1) {
                                chaine = chaine.replaceAll(word, possibleLemmes[0]);
                            }
                        }
                    }
                    chaine = chaine + ".";
                    System.out.println(chaine);
                    Scanner scanner = new Scanner(chaine);
                    String s = scanner.nextLine();
                    try {
                        tal_sqlLexer lexer = new tal_sqlLexer(new ANTLRReaderStream(new StringReader(s)));
                        CommonTokenStream tokens = new CommonTokenStream(lexer);
                        tal_sqlParser parser = new tal_sqlParser(tokens);
                        String arbre = parser.listerequetes();
                        //arbre = arbre.replaceAll("\\(|\\)","");
                        arbre = arbre.replaceAll("\\s{2,}"," ");
                        System.out.println(arbre);

                        interrogPostgresql sqlInterrog = new interrogPostgresql();
                        sqlInterrog.requestDatabase(arbre);

                    } catch (Exception e) {
                    }
                } catch (EOFException e) {
                    br.close();
                }
            } catch (IOException e) {
                System.out.println("IO Exception");
            }
        }
    }
}
