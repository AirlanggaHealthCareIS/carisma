/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package carismaserver.controllers;

import carismainterface.entity.Pegawai;
import carismaserver.entity.StaffEntity;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kepoterz
 */
public class PegawaiManagement {
    public void getPegawai(carismaserver.boundaries.StaffManagement ui) throws RemoteException {
        StaffEntity dokterService = new StaffEntity(ui.ui);
        List<Pegawai> list = new ArrayList<Pegawai>();
        list = dokterService.getPegawai();
        DefaultTableModel model = new DefaultTableModel();      
        model.addColumn("No."); 
        model.addColumn("Nama"); 
        model.addColumn("Jabatan");
        model.addColumn("Alamat"); 
        model.addColumn("No Kartu ID"); 
        model.addColumn("Telepon"); 
        model.addColumn("HP1");
        model.addColumn("HP2");
        model.addColumn("Tempat Lahir");
        model.addColumn("Tanggal Lahir");
        model.addColumn("Jenis Kelamin");
        model.addColumn("Gol. Darah");
        model.addColumn("Bank");
        model.addColumn("No Rek");
        model.addColumn("Gaji Fix");
        model.addColumn("Gaji Lembur");
        for (int i = 0; i < list.size(); i++) {
            model.addRow(new Object[]{i, list.get(i).getNamaPegawai(), list.get(i).getJabatanPegawai(), list.get(i).getAlamatPegawai(), list.get(i).getNokartuidPegawai(), list.get(i).getTelpPegawai(), list.get(i).getHp1Pegawai(),
            list.get(i).getHp2Pegawai(), list.get(i).getTempatlahirPegawai(), list.get(i).getTgllahirPegawai(), list.get(i).getKelaminPegawai(), list.get(i).getDarahPegawai(),
            list.get(i).getBankPegawai(), list.get(i).getNorekPegawai(), list.get(i).getGajifixPegawai(), list.get(i).getGajilemburPegawai()});
            System.out.println("lewat");
        }
        ui.tablePegawai.setModel(model);
    }
}
