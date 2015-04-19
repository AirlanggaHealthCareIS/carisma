/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
    void insertPoli(Poli poli) throws RemoteException;

    void updatePoli(Poli poli) throws RemoteException;
    
    void deletePoli(String idpoli) throws RemoteException;

    Poli getPoli(String idpoli) throws RemoteException;

    List<Poli> getPoli() throws RemoteException;
}