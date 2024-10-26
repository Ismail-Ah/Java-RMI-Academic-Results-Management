import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Promotion extends Remote{
    void ajouter_un_etudiant(String nom,String prenom) throws RemoteException;
    Etudiant rechercher_un_etudiant(String nom,String prenom) throws RemoteException;
    double calculer_moyenne_de_la_promotion() throws RemoteException;
}