package com.mycompany.rmi_p2p;
import java.rmi.RemoteException;
public class ServerImp implements IServer { 
    public String name1;
    public String name2;
    public IClient client1;
    public IClient client2;
    public ServerImp() throws RemoteException {
    }
    @Override
    public void unicastMessage(String msg) throws RemoteException {
        System.out.println(msg);
    }
    @Override
    public void registerClient(String name, IClient client) throws RemoteException {
        if(this.client1 == null){
            this.client1 = client;
            this.name1 = name;
        }
        else{
            this.client2 = client;
            this.name2 = name;
            client2.registerClient(client1);
            client1.registerClient(client2);
            client2.retrieveMessage("[" + name1 + "] is waiting...");
            client1.retrieveMessage("[" + name2 + "] got connected...");
        }
    } 
}