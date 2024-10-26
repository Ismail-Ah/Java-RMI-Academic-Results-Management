import java.rmi.*;
import java.util.Scanner;

public class client2 {
    public static void main(String[] args) {
        try {
            Promotion promotion = (Promotion) Naming.lookup("rmi://127.0.0.1:2030/Promotion");
            Scanner scanner = new Scanner(System.in);
            String continuerSaisie;

            do {
                System.out.print("Entrez le prénom de l'étudiant : ");
                String prenom = scanner.nextLine();
                System.out.print("Entrez le nom de l'étudiant : ");
                String nom = scanner.nextLine();

                promotion.ajouter_un_etudiant(prenom, nom);
                Etudiant etudiant = promotion.rechercher_un_etudiant(prenom, nom);

                String ajouterEpreuve;
                do {
                    System.out.print("Entrez le nom de l'épreuve (ou tapez 'exit' pour arrêter d'ajouter des épreuves) : ");
                    String nomEpreuve = scanner.nextLine();
                    if (nomEpreuve.equalsIgnoreCase("exit")) {
                        break;
                    }

                    System.out.print("Entrez la note pour " + nomEpreuve + " : ");
                    double note = scanner.nextDouble();
                    System.out.print("Entrez le coefficient pour " + nomEpreuve + " : ");
                    double coefficient = scanner.nextDouble();
                    scanner.nextLine(); 

                    etudiant.ajouter_une_epreuve(nomEpreuve, note, coefficient);

                    System.out.print("Voulez-vous ajouter une autre épreuve pour cet étudiant ? (oui/non) : ");
                    ajouterEpreuve = scanner.nextLine();
                } while (ajouterEpreuve.equalsIgnoreCase("oui"));

                System.out.println(etudiant.afficher_liste_des_epreuves());
                System.out.println("La moyenne de " + prenom + " " + nom + " est : " + etudiant.calculer_la_moyenne());

                System.out.print("Voulez-vous ajouter un autre étudiant ? (oui/non) : ");
                continuerSaisie = scanner.nextLine();
            } while (continuerSaisie.equalsIgnoreCase("oui"));

            // Calcule et affiche la moyenne de la promotion
            System.out.println("La moyenne de la promotion est : " + promotion.calculer_moyenne_de_la_promotion());
            scanner.close();
        } catch (Exception e) {
            System.out.println("Exception dans le client : " + e);
        }
    }
}
