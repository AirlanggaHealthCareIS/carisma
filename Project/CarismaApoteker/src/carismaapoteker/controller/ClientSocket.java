package carismaapoteker.controller;

import carismainterface.server.*;
import carismaapoteker.boundaries.*;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author K-MiL Caster
 */
public class ClientSocket {

    private String host = "localhost";
    private int port = 2015;
    public Login login;
    private UserService userService;
    private TransaksibeliobatService transaksibeliobatService;
    private TransaksijualobatService transaksijualobatService;
    private ObatService obatService;
    
    public ClientSocket() throws RemoteException, NotBoundException {
        this.Connect();
    }

    public void Connect() {
        try {
            Registry registry = null;
            try {
                registry = LocateRegistry.getRegistry(host, port);
            } catch (RemoteException ex) {
                Logger.getLogger(ClientSocket.class.getName()).log(Level.SEVERE, null, ex);
            }
            userService = (UserService) registry.lookup("userRequest");
            transaksibeliobatService = (TransaksibeliobatService) registry.lookup("transaksibeliobatRequest");
            obatService = (ObatService) registry.lookup("obatRequest");
            transaksijualobatService = (TransaksijualobatService) registry.lookup("transaksijualobatRequest");
            
        } catch (RemoteException ex) {
            Logger.getLogger(ClientSocket.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NotBoundException ex) {
            Logger.getLogger(ClientSocket.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public UserService getUserService() {
        return this.userService;
    }
    public TransaksibeliobatService getTransaksibeliobatService(){
        return this.transaksibeliobatService;
    }
    public ObatService getObatService(){
        return this.obatService;
    }
}
