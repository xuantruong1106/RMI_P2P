package rmihibridp2p;
import java.rmi.RemoteException;
public class ClientImp implements IClient { 
    public IClient client;
    @Override
    public void retrieveMessage(String msg) throws RemoteException {
        System.out.println(msg);
    }
    @Override
    public void registerClient(IClient client) throws RemoteException {
        this.client = client;
    }
}