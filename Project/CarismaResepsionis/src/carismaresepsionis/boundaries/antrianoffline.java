/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package carismaresepsionis.boundaries;

import carismainterface.server.DokterService;
import carismaresepsionis.controller.ClientSocket;
import carismaresepsionis.controller.DataDokterController;
import carismaresepsionis.controller.regispasiencontroller;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Fiqhi Darmawan
 */
public class antrianoffline extends javax.swing.JFrame {
    private ClientSocket client;
    private String userName;
    private regispasiencontroller registrasicontrol;
    private DokterService ds;
    private DefaultTableModel tabeldokter = new DefaultTableModel();
    private DataDokterController DataDokterController;
    /**
     * Creates new form antrianoffline
     */
//    public antrianoffline() {
//        initComponents();
//    }
     public antrianoffline(ClientSocket client, String username, String idPasien, String namaPasien) throws RemoteException {
         initComponents();
         this.client = client;
         registrasicontrol = new regispasiencontroller(this.client);
         
         registrasicontrol.setComboBoxPoli(this);
         idpasien.setText(idPasien);
         namapasien.setText(namaPasien);
         this.userName=username;
         this.setExtendedState(this.MAXIMIZED_BOTH);
         
         
//          this.client = client;
        DataDokterController control = new DataDokterController(this.client);
//        ds = client.getDokterService();
//        this.userName = userName; 
        tabeldokter_.setModel(control.getDokterList());
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        namapasien = new javax.swing.JTextField();
        namadokter = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        polidokter = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        idpasien = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabeldokter_ = new javax.swing.JTable();
        tambahantrian = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Nama Dokter");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 60, 70, 14);

        jLabel4.setText("Nama Pasien");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 210, 70, 20);
        getContentPane().add(namapasien);
        namapasien.setBounds(150, 210, 140, 30);
        getContentPane().add(namadokter);
        namadokter.setBounds(150, 60, 140, 30);

        jLabel2.setText("Poli");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 110, 16, 14);

        getContentPane().add(polidokter);
        polidokter.setBounds(150, 110, 140, 30);

        jLabel3.setText("Id Pasien");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 160, 70, 20);
        getContentPane().add(idpasien);
        idpasien.setBounds(150, 160, 140, 30);

        tabeldokter_.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Id Dokter", "Nama Dokter", "Jam/Hari Kerja"
            }
        ));
        tabeldokter_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabeldokter_MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabeldokter_);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 270, 452, 130);

        tambahantrian.setText("Tambah Antrian");
        tambahantrian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahantrianActionPerformed(evt);
            }
        });
        getContentPane().add(tambahantrian);
        tambahantrian.setBounds(370, 420, 110, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabeldokter_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabeldokter_MouseClicked
        namadokter.setText(tabeldokter_.getValueAt(tabeldokter_.getSelectedRow(), 1).toString());
    }//GEN-LAST:event_tabeldokter_MouseClicked

    private void tambahantrianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahantrianActionPerformed
        try {
            new Menursepsionis(this.client, this.userName, idpasien.getText().toString(), namapasien.getText().toString()).show();
        } catch (RemoteException ex) {
            Logger.getLogger(antrianoffline.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tambahantrianActionPerformed

    /**
     * @param args the command line arguments
     */
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField idpasien;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField namadokter;
    private javax.swing.JTextField namapasien;
    public javax.swing.JComboBox polidokter;
    private javax.swing.JTable tabeldokter_;
    private javax.swing.JButton tambahantrian;
    // End of variables declaration//GEN-END:variables
}
