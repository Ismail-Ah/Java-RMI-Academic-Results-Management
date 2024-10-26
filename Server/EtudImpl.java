import java.rmi.*;
import java.rmi.server.*;
import java.util.ArrayList;

public class EtudImpl extends UnicastRemoteObject implements Etudiant {
    private static int id = 0;
    private int idEtu;
    private String nom;
    private String prenom;
    private ArrayList<Epreuve_avec_coeff> epreuves ;
    public EtudImpl(String nom, String prenom) throws RemoteException {
        super();
        this.nom = nom;
        this.prenom = prenom;
        this.idEtu = id++;
        this.epreuves = new ArrayList<>();
    }

    @Override
    public void ajouter_une_epreuve(String nom, double note, double coef) throws RemoteException {
        epreuves.add(new Epreuve_avec_coeff(nom, coef, note));
    }

    @Override
    public String afficher_liste_des_epreuves() throws RemoteException {
        StringBuilder liste = new StringBuilder("Liste des épreuves:\n");
        for (Epreuve_avec_coeff ep : epreuves) {
            liste.append(ep.toString(prenom+" "+nom)).append("\n");
        }
        return liste.toString();
    }

    @Override
    public double calculer_la_moyenne() throws RemoteException {
        double moy = 0;
        for (Epreuve_avec_coeff ep : epreuves) {
            moy += (ep.note * ep.coef);
        }
        return moy;
    }

    public int getIdEtu() {
        return idEtu;
    }

    public void setIdEtu(int idEtu) {
        this.idEtu = idEtu;
    }
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }


}
