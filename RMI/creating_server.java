import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class MyServer {
    public static void main(String[] args) {
        try {
            MyRemoteObject obj = new MyRemoteObject();
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.rebind("MyRemoteObject", obj);
            System.out.println("Server is ready.");
        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
