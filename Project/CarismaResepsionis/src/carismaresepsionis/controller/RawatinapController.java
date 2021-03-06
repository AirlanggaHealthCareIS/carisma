/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package carismaresepsionis.controller;

import carismainterface.entity.*;
import carismainterface.server.*;
import carismaresepsionis.boundaries.Rawatinap;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Vaio Sony
 */
public class RawatinapController {
    private PasienService pasienService;
    private KamarService kamarService;
    
    public RawatinapController (ClientSocket client) throws RemoteException{
        this.pasienService = client.getPasienService();
        this.kamarService = client.getKamarService();
      
    } 
    
   public String generatetanggal ( ){
        String tanggal;
        String bulan;
        Date date = new Date ();
        if (date.getMonth() > 8) {
            bulan = Integer.toString((date.getMonth()+1));
        }
        else {
            bulan = "0"+ Integer.toString((date.getMonth()+1));
        }
        tanggal = Integer.toString((date.getYear()+1900))+"-"+bulan+"-"+Integer.toString(date.getDate())+" "+Integer.toString(date.getHours())+":"+Integer.toString(date.getMinutes())+";"+Integer.toString(date.getSeconds());
        return tanggal;
    }
   
   
   public DefaultTableModel getNamaPasien() throws RemoteException{
        
        List<Pasien> list = new ArrayList<Pasien>();
        list = pasienService.getPasien();
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID Pasien");
        model.addColumn("Nama Pasien");
        for (int i = 0; i < list.size(); i++) {
            model.addRow(new Object[]{list.get(i).getIdPasien(), list.get(i).getNamaPasien()});
            //System.out.println("lewat");
        }
        
        return model;
    }
  
   
    
    
    public DefaultTableModel getKamar() throws RemoteException{
        
        List<Kamar> list = new ArrayList<Kamar>();
        list = kamarService.getKamar();
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Id Kamar");
        model.addColumn("Nama Kamar");
        model.addColumn("Kelas Kamar");
        model.addColumn("Tarif Kamar");
        for (int i = 0; i < list.size(); i++) {

            

            model.addRow(new Object[]{list.get(i).getIdKamar(), list.get(i).getNamaKamar(), list.get(i).getKelas(), 
                list.get(i).getTarif()});

            //System.out.println("lewat");
        }
        
        return model;
    }
    
     public DefaultTableModel getPasienbyName (String nama) throws RemoteException{
        //System.out.println("lalalala");
        List<Pasien> list = new ArrayList<Pasien>();
        list = pasienService.getPasienByName(nama);
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Id Pasien");
        model.addColumn("Nama Pasien");
        
        for (int i = 0; i < list.size(); i++) {
            model.addRow(new Object[]{list.get(i).getIdPasien(), list.get(i).getNamaPasien()});
            //System.out.println(model);
        }
        return model;
        
    } 

    public int kamarTersedia () throws RemoteException{
       int jumlahKamarTerisi = kamarService.getJumlahKamarTerisi();
       int jumlahKamarKeseluruhan = kamarService.getJumlahKamarKeseluruhan();
       
    
       return jumlahKamarKeseluruhan-jumlahKamarTerisi;
   }
    
    
}
