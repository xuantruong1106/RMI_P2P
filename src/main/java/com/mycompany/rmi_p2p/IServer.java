package com.mycompany.rmi_p2p;
import java.rmi.Remote;
import java.rmi.RemoteException;
public interface IServer extends Remote {
    public void unicastMessage(String msg) throws RemoteException;
    public void registerClient(String name, IClient client) throws RemoteException;
}