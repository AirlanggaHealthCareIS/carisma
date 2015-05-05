package carismainterface.server;

import carismainterface.entity.Poli;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author kepoterz
 */
public interface PoliService extends Remote{
    boolean insertPoli(Poli poli) throws RemoteException;

    boolean updatePoli(Poli poli) throws RemoteException;
    
    boolean deletePoli(String idpoli) throws RemoteException;

    Poli getPoli(String idpoli) throws RemoteException;

    List<Poli> getPoli() throws RemoteException;
}
