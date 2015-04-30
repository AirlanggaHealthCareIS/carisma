/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package carismaapoteker.controller;

import carismaapoteker.boundaries.TransaksiBeliObat;
import carismainterface.entity.Detailobat;
import carismainterface.entity.Detailtransaksibeliobat;
import carismainterface.entity.Obat;
import carismainterface.entity.Transaksibeliobat;
import carismainterface.server.DetailobatService;
import carismainterface.server.DetailtransaksibeliobatService;
import carismainterface.server.ObatService;
import carismainterface.server.TransaksibeliobatService;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hana Mahrifah
 */
public class TransaksiBeliObatController {
    private TransaksibeliobatService transaksibeliobat;
    private DetailtransaksibeliobatService detailtransaksibeliobat;
    private ObatService obatService;
    private DetailobatService detailobatService;
    
    
    public TransaksiBeliObatController(ClientSocket client) throws RemoteException{
        Transaksibeliobat trans = new Transaksibeliobat();
        Detailtransaksibeliobat trans1 = new Detailtransaksibeliobat();
        Obat obat = new Obat();
        Detailobat detailobat = new Detailobat();
        this.transaksibeliobat = client.getTransaksibeliobatService();
        this.detailtransaksibeliobat = client. getDetailtransaksibeliobatService();
    }
    
    public DefaultTableModel getTransaksiBeliObat(TransaksiBeliObat ui) throws RemoteException {
    List<Transaksibeliobat> list = new ArrayList<Transaksibeliobat>();
    list = transaksibeliobat.getTransaksibeliobat();
    List<Detailtransaksibeliobat> list1 = new ArrayList<Detailtransaksibeliobat>();
    list1 = detailtransaksibeliobat.getDetailtransaksibeliobat();
    List<Obat> list2 = new ArrayList<Obat>();
    list2 = obatService.getObat();
    List<Detailobat> list3 = new ArrayList<Detailobat>();
    list3 = detailobatService.getDetailobat();
    DefaultTableModel model = new DefaultTableModel();
    model.addColumn("Id Transaksi Beli Obat");
    model.addColumn("Tanggal Beli Obat");
    model.addColumn("Nama Obat");
    model.addColumn("Jenis Obat");
    model.addColumn("Harga Beli Obat");
    model.addColumn("Qty");
    model.addColumn("Tanggal Kadaluarsa");
    model.addColumn("Keterangan");
    
    for(int i = 0;i<list.size();i++){
        model.addRow(new Object []{list.get(i).getIdTransaksibeliobat(),list.get(i).getDateTransaksibeli(),list2.get(i).getNamaObat(),list2.get(i).getJenisObat(),list.get(i).getHargabeliObat(),list1.get(i).getQty(),list3.get(i).getTglkadaluarsaDetail(),list.get(i).getKeterangan()});
        System.out.println("get Transaksi beli obat");
    }
    return model;
    }
//    
//    public void insertTransaksiBeliObat(carismaapoteker.boundaries.TransaksiBeliObat ui){
//        
//    }
}
