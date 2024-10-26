import java.rmi.*;

public class client {
	public static void main(String[] args) {
		// System.setProperty("java.security.policy","file./security.policy");

		try {
			Promotion promotion = (Promotion) Naming.lookup("rmi://127.0.0.1:2030/Promotion");
			promotion.ajouter_un_etudiant("AHAKAY","ISMAIL");
			promotion.ajouter_un_etudiant("ANNA","AYMAN");
			promotion.ajouter_un_etudiant("EL","ALI");
			Etudiant etu1 = promotion.rechercher_un_etudiant("AHAKAY", "ISMAIL");
			Etudiant etu2 = promotion.rechercher_un_etudiant("ANNA", "AYMAN");
			Etudiant etu3 = promotion.rechercher_un_etudiant("EL", "ALI");
			etu1.ajouter_une_epreuve("MATH", 10, 0.3);
			etu1.ajouter_une_epreuve("INFO", 15, 0.7);
			etu2.ajouter_une_epreuve("MATH", 14, 0.3);
			etu2.ajouter_une_epreuve("INFO", 16, 0.7);
			etu3.ajouter_une_epreuve("MATH", 12, 0.3);
			etu3.ajouter_une_epreuve("INFO", 17, 0.7);
			System.out.println(etu1.afficher_liste_des_epreuves());
			System.out.println("Moyenne est : "+etu1.calculer_la_moyenne());
			System.out.println(etu2.afficher_liste_des_epreuves());
			System.out.println("Moyenne est : "+etu2.calculer_la_moyenne());
			System.out.println(etu3.afficher_liste_des_epreuves());
			System.out.println("Moyenne est : "+etu3.calculer_la_moyenne());


			System.out.println("Moyenne de la promotion est : " +promotion.calculer_moyenne_de_la_promotion());
		} catch (Exception e) {
			System.out.println("HelloClient exception: " + e);
		}
	}
}