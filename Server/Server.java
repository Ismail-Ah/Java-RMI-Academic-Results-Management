import java.rmi.*;
import java.rmi.server.*;

public class Server extends UnicastRemoteObject{
	
	public Server() throws RemoteException {
        super();
    }


    public static void main(String[] args) {
        System.setProperty("java.security.policy", "file:./security.policy");
        try {
            java.rmi.registry.LocateRegistry.createRegistry(2030);
			PromoImpl promotion = new PromoImpl();
			Naming.rebind("rmi://localhost:2030/Promotion", promotion);
            System.out.println("Server is ready.");
        } catch (Exception e) {
            System.out.println("Server failed.\n" + e);
        }
    }
}
