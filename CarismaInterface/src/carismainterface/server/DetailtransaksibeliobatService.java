/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package carismainterface.server;

import carismainterface.entity.Detailtransaksibeliobat;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author kepoterz
 */
public interface DetailtransaksibeliobatService {
    void insertDetailtransaksibeliobat(Detailtransaksibeliobat detailtransaksibeliobat) throws RemoteException;

    void updateDetailtransaksibeliobat(Detailtransaksibeliobat detailtransaksibeliobat) throws RemoteException;

    void deleteDetailtransaksibeliobat(String idtransaksibeliobat, int idobat) throws RemoteException;

    Detailtransaksibeliobat getDetailtransaksibeliobat(String idtransaksibeliobat, int idobat) throws RemoteException;

    List<Detailtransaksibeliobat> getDetailtransaksibeliobat() throws RemoteException;
}
