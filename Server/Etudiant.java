import java.rmi.*;

public interface Etudiant extends Remote{
    public void ajouter_une_epreuve(String nom,double note,double coef) throws RemoteException;
    public String afficher_liste_des_epreuves() throws RemoteException;
    public double calculer_la_moyenne() throws RemoteException;
}