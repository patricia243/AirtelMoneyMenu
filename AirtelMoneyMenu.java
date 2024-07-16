import java.util.Scanner;

public class AirtelMoneyMenu {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choixPrincipal;
        
        do {
            choixPrincipal = afficherMenuPrincipal();
            switch (choixPrincipal) {
                case 1:
                    afficherMenuUSD();
                    break;
                case 2:
                    afficherMenuCDF();
                    break;
                case 3:
                    afficherMenuBureauDeChange();
                    break;
                case 4:
                    afficherMenuBonus();
                    break;
                case 5:
                    afficherMenuTransactions();
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

    private static int afficherMenuPrincipal() {
        int choix;
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
            scanner.next(); // Consommer l'entrée invalide
        }
        choix = scanner.nextInt();
        return choix;
    }

    private static void afficherMenuUSD() {
        int choixUSD;
        do {
            System.out.println("Menu USD");
            System.out.println("Veuillez sélectionner une option :");
            System.out.println("1. Envoi d'argent");
            System.out.println("2. Retrait");
            System.out.println("3. Achat forfait");
            System.out.println("4. Achat unités");
            System.out.println("5. Paiement");
            System.out.println("6. Mon compte/PIN");
            System.out.println("7. Services financiers");
            System.out.println("8. Surprise Bonus");
            System.out.println("9. Aider");
            System.out.println("#. Retour");

            choixUSD = obtenirChoixSousMenu();
            switch (choixUSD) {
                case 1:
                    envoiArgent();
                    break;
                case 2:
                    System.out.println("Option 2 sélectionnée : Retrait");
                    // Ajouter la logique pour l'option Retrait
                    break;
                case 3:
                    System.out.println("Option 3 sélectionnée : Achat forfait");
                    // Ajouter la logique pour l'option Achat forfait
                    break;
                case 4:
                    System.out.println("Option 4 sélectionnée : Achat unités");
                    // Ajouter la logique pour l'option Achat unités
                    break;
                case 5:
                    System.out.println("Option 5 sélectionnée : Paiement");
                    // Ajouter la logique pour l'option Paiement
                    break;
                case 6:
                    System.out.println("Option 6 sélectionnée : Mon compte/PIN");
                    // Ajouter la logique pour l'option Mon compte/PIN
                    break;
                case 7:
                    System.out.println("Option 7 sélectionnée : Services financiers");
                    // Ajouter la logique pour l'option Services financiers
                    break;
                case 8:
                    System.out.println("Option 8 sélectionnée : Surprise Bonus");
                    // Ajouter la logique pour l'option Surprise Bonus
                    break;
                case 9:
                    System.out.println("Option 9 sélectionnée : Aider");
                    // Ajouter la logique pour l'option Aider
                    break;
                case 10:
                    System.out.println("Retour au menu principal");
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez réessayer.");
                    break;
            }
        } while (choixUSD != 10);
    }

    private static void afficherMenuCDF() {
        int choixCDF;
        do {
            System.out.println("Menu CDF");
            System.out.println("Veuillez sélectionner une option :");
            System.out.println("1. Envoi d'argent");
            System.out.println("2. Retrait");
            System.out.println("3. Achat forfait");
            System.out.println("4. Achat unités");
            System.out.println("5. Paiement");
            System.out.println("6. Mon compte/PIN");
            System.out.println("7. Services financiers");
            System.out.println("8. Surprise Bonus");
            System.out.println("9. Aider");
            System.out.println("#. Retour");

            choixCDF = obtenirChoixSousMenu();
            switch (choixCDF) {
                case 1:
                    envoiArgent();
                    break;
                case 2:
                    System.out.println("Option 2 sélectionnée : Retrait");
                    System.out.println("code d'agent/numero");
                    // Ajouter la logique pour l'option Retrait
                    break;
                case 3:
                    System.out.println("Option 3 sélectionnée : Achat forfait");
                    // Ajouter la logique pour l'option Achat forfait
                    break;
                case 4:
                    System.out.println("Option 4 sélectionnée : Achat unités");
                    // Ajouter la logique pour l'option Achat unités
                    break;
                case 5:
                    System.out.println("Option 5 sélectionnée : Paiement");
                    // Ajouter la logique pour l'option Paiement
                    break;
                case 6:
                    System.out.println("Option 6 sélectionnée : Mon compte/PIN");
                    // Ajouter la logique pour l'option Mon compte/PIN
                    break;
                case 7:
                    System.out.println("Option 7 sélectionnée : Services financiers");
                    // Ajouter la logique pour l'option Services financiers
                    break;
                case 8:
                    System.out.println("Option 8 sélectionnée : Surprise Bonus");
                    // Ajouter la logique pour l'option Surprise Bonus
                    break;
                case 9:
                    System.out.println("Option 9 sélectionnée : Aider");
                    // Ajouter la logique pour l'option Aider
                    break;
                case 10:
                    System.out.println("Retour au menu principal");
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez réessayer.");
                    break;
            }
        } while (choixCDF != 10);
    }

    private static void afficherMenuBureauDeChange() {
        System.out.println("Option 3 sélectionnée : Bureau de change");
        // Ajouter la logique pour l'option Bureau de change
    }

    private static void afficherMenuBonus() {
        System.out.println("Option 4 sélectionnée : 2GB 48h-120 (bonus)");
        // Ajouter la logique pour l'option 2GB 48h-120 (bonus)
    }

    private static void afficherMenuTransactions() {
        int choixTransaction;
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
            
            choixTransaction = obtenirChoixSousMenu();
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
    }
    private static void envoiArgent() {
        int choixTransaction;
        do {
            System.out.println("Choisissez");
            System.out.println("1. Vers Airtel Money");
            System.out.println("2. Vers Autres Reseaux");
            System.out.println("3. Annuler Envoi Airtel Money");
            System.out.println("4. A l'etranger (Afrique)");
        
            
            choixTransaction = obtenirChoixSousMenu();
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
    }

    private static int obtenirChoixSousMenu() {
        while (!scanner.hasNextInt()) {
            System.out.println("Entrée invalide. Veuillez entrer un nombre entre 1 et 9 ou # pour retourner.");
            scanner.next(); // Consommer l'entrée invalide
        }
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        } else {
            String input = scanner.next();
            if (input.equals("#")) {
                return 10; // Retour au menu principal
            } else {
                System.out.println("Choix invalide. Veuillez réessayer.");
                return -1;
            }
        }
    }
}
