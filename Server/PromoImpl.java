import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class PromoImpl extends UnicastRemoteObject implements Promotion{
    private static ArrayList<EtudImpl> etudiants = new ArrayList<>();

    public PromoImpl() throws RemoteException{
        super();
    }
    @Override
    public void ajouter_un_etudiant(String nom,String prenom) throws RemoteException {
        etudiants.add(new EtudImpl(nom,prenom));
    }

    @Override
    public Etudiant rechercher_un_etudiant(String nom,String prenom) throws RemoteException {
        for (EtudImpl etu : etudiants) {
            if (etu.getNom().equals(nom) && etu.getPrenom().equals(prenom)) return etu;
        }
        return null;
    }

    @Override
    public double calculer_moyenne_de_la_promotion() throws RemoteException {
        double totalMoyenne = 0;
        for (EtudImpl etu : etudiants) {
            totalMoyenne += etu.calculer_la_moyenne();
        }
        return (etudiants.size() != 0) ? (totalMoyenne / etudiants.size()) : 0;
    }
}
