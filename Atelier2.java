import java.util.Scanner;

public class Atelier2 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Saisie des deux nombres
        System.out.print("Entrez le premier nombre (a) : ");
        int a = scanner.nextInt();

        System.out.print("Entrez le deuxième nombre (b) : ");
        int b = scanner.nextInt();

        // Affichage  les valeurs d'origine
        System.out.println("Valeurs initiales : a = " + a + ", b = " + b);

        // Permutation des valeurs sans  utiliser variable temporaire
        a = a + b;
        b = a - b;
        a = a - b;
        // Affichage des valeurs après permutation
        System.out.println("Valeurs après permutation : a = " + a + ", b = " + b);
        
        scanner.close();
    }
    
}
