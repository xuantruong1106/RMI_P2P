package com.mycompany.rmi_p2p;
import java.rmi.Remote;
import java.rmi.RemoteException;
public interface IClient extends Remote {
    public void retrieveMessage(String msg) throws RemoteException;
    public void registerClient(IClient client) throws RemoteException;
}
