import java.util.Scanner;

public class AirtelMoneyMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choixPrincipal = 0;
        int choixTransaction = 0;

        do {
            // Affichage du menu principal
            System.out.println("Bienvenue dans le menu Airtel Money");
            System.out.println("Veuillez sélectionner une option :");
            System.out.println("1. USD");
            System.out.println("2. CDF");
            System.out.println("3. Bureau de change");
            System.out.println("4. 2GB 48h-120 (bonus)");
            System.out.println("5. Transactions");
            System.out.println("6. Quitter");
            
            while (!scanner.hasNextInt()) {
                System.out.println("Entrée invalide. Veuillez entrer un nombre entre 1 et 6.");
                scanner.next(); // consommer l'entrée invalide
            }
            choixPrincipal = scanner.nextInt();

            switch (choixPrincipal) {
                case 1:
                    System.out.println("Option 1 sélectionnée : USD");
                    // Ajouter la logique pour l'option USD
                    break;
                case 2:
                    System.out.println("Option 2 sélectionnée : CDF");
                    // Ajouter la logique pour l'option CDF
                    break;
                case 3:
                    System.out.println("Option 3 sélectionnée : Bureau de change");
                    // Ajouter la logique pour l'option Bureau de change
                    break;
                case 4:
                    System.out.println("Option 4 sélectionnée : 2GB 48h-120 (bonus)");
                    // Ajouter la logique pour l'option 2GB 48h-120 (bonus)
                    break;
                case 5:
                    // Affichage du sous-menu Transactions
                    do {
                        System.out.println("Menu Transactions");
                        System.out.println("Veuillez sélectionner une option :");
                        System.out.println("1. Achat unités/forfait");
                        System.out.println("2. Balance");
                        System.out.println("3. Envoyer de l'argent");
                        System.out.println("4. Recevoir de l'argent");
                        System.out.println("5. Consulter le solde");
                        System.out.println("6. Recharger le compte");
                        System.out.println("7. Payer des factures");
                        System.out.println("8. Transférer vers un compte bancaire");
                        System.out.println("9. Retour au menu principal");
                        
                        while (!scanner.hasNextInt()) {
                            System.out.println("Entrée invalide. Veuillez entrer un nombre entre 1 et 9.");
                            scanner.next(); // consommer l'entrée invalide
                        }
                        choixTransaction = scanner.nextInt();

                        switch (choixTransaction) {
                            case 1:
                                System.out.println("Option 1 sélectionnée : Achat unités/forfait");
                                // Ajouter la logique pour l'option Achat unités/forfait
                                break;
                            case 2:
                                System.out.println("Option 2 sélectionnée : Balance");
                                // Ajouter la logique pour l'option Balance
                                break;
                            case 3:
                                System.out.println("Option 3 sélectionnée : Envoyer de l'argent");
                                // Ajouter la logique pour envoyer de l'argent
                                break;
                            case 4:
                                System.out.println("Option 4 sélectionnée : Recevoir de l'argent");
                                // Ajouter la logique pour recevoir de l'argent
                                break;
                            case 5:
                                System.out.println("Option 5 sélectionnée : Consulter le solde");
                                // Ajouter la logique pour consulter le solde
                                break;
                            case 6:
                                System.out.println("Option 6 sélectionnée : Recharger le compte");
                                // Ajouter la logique pour recharger le compte
                                break;
                            case 7:
                                System.out.println("Option 7 sélectionnée : Payer des factures");
                                // Ajouter la logique pour payer des factures
                                break;
                            case 8:
                                System.out.println("Option 8 sélectionnée : Transférer vers un compte bancaire");
                                // Ajouter la logique pour transférer vers un compte bancaire
                                break;
                            case 9:
                                System.out.println("Retour au menu principal");
                                break;
                            default:
                                System.out.println("Choix invalide. Veuillez réessayer.");
                                break;
                        }
                    } while (choixTransaction != 9);
                    break;
                case 6:
                    System.out.println("Option 6 sélectionnée : Quitter");
                    System.out.println("Au revoir !");
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez réessayer.");
                    break;
            }
        } while (choixPrincipal != 6);

        scanner.close();
    }
}

    