import java.util.Scanner;

public class Exercices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Saisie des informations de l'utilisateur
        System.out.print("Entrez votre nom : ");
        String nom = scanner.nextLine();

        System.out.print("Entrez votre âge : ");
        int age = scanner.nextInt();

        System.out.print("Entrez la première note : ");
        double note1 = scanner.nextDouble();

        System.out.print("Entrez la deuxième note : ");
        double note2 = scanner.nextDouble();

        System.out.print("Entrez la troisième note : ");
        double note3 = scanner.nextDouble();

        // Calcul de la moyenne des notes
        double moyenne = (note1 + note2 + note3) / 3.0;

        // Détermination de la majorité
        String statut = (age >= 18) ? "majeur" : "mineur";

        // Attribution de la mention
        String mention;
        if (moyenne >= 90) {
            mention = "Excellent";
        } else if (moyenne >= 80) {
            mention = "Très bien";
        } else if (moyenne >= 70) {
            mention = "Bien";
        } else if (moyenne >= 60) {
            mention = "Passable";
        } else {
            mention = "Insuffisant";
        }

        // Affichage des résultats
        System.out.println("\nRésultats :");
        System.out.println("Nom : " + nom);
        System.out.println("Âge : " + age + " ans (" + statut + ")");
        System.out.printf("Moyenne des notes : %.2f\n", moyenne);
        System.out.println("Mention : " + mention);
        
        scanner.close();
    }
    
}
