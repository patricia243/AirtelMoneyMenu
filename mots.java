import java.util.Arrays;
import java.util.Scanner;

public class mots {
  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Saisie des deux mots
        System.out.print("Entrez le premier mot : ");
        String mot1 = scanner.nextLine();

        System.out.print("Entrez le deuxième mot : ");
        String mot2 = scanner.nextLine();

        // Vérification si les mots sont formés des mêmes lettres
        boolean sontFormesDesMemesLettres = motIdentique(mot1, mot2);

        // Affichage du résultat
        if (sontFormesDesMemesLettres) {
            System.out.println("Les mots \"" + mot1 + "\" et \"" + mot2 + "\" sont formés des mêmes lettres.");
        } else {
            System.out.println("Les mots \"" + mot1 + "\" et \"" + mot2 + "\" ne sont pas formés des mêmes lettres.");
        }
        
        scanner.close();
    }

    public static boolean motIdentique(String mot1, String mot2) {
        // Convertir les mots en tableaux de caractères
        char[] lettresMot1 = mot1.toCharArray();
        char[] lettresMot2 = mot2.toCharArray();

        // Trier les tableaux de caractères
        Arrays.sort(lettresMot1);
        Arrays.sort(lettresMot2);

        // Comparer les tableaux triés
        return Arrays.equals(lettresMot1, lettresMot2);
    }
}

