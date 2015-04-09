package carismaresepsionis.boundaries;

import carismainterface.server.UserService;
import carismaresepsionis.boundaries.*;
import carismaresepsionis.controller.ClientSocket;

/**
 *
 * @author devan
 */
public class DaftarRawatInap extends javax.swing.JFrame {
    private ClientSocket client;
    private String userName;
    String a, b, c, d, e, f, g, h, i, j, k;
    settergetter simpanan = new settergetter();

    String hitungumur() {
        int umur;
        umur = Integer.parseInt((String) TahunLahir.getSelectedItem());
        int umurini = 2015 - umur;
   // System.out.println(umurini);
        return String.valueOf(umurini);
    }
    public DaftarRawatInap(ClientSocket client, String userName) {
        this.client = client;
        this.userName = userName;
        initComponents();
        this.setExtendedState(this.MAXIMIZED_BOTH);
        Find.requestFocus();
        Tempat_ID.setEditable(false);
        UmurPasien.setEditable(false);
        a = Nama_Pasien.getText();
        b = Tempat_Lahir.getText();
        c = Alamat.getText();
        d = No_Hp.getText();
        e = No_tele.getText();
        f = TinggiPasien.getText();
        g = BeratPasien.getText();
        j = Kamar.getText();
        k = KelasKamar.getText();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Nama_Pasien = new javax.swing.JTextField();
        Tempat_Lahir = new javax.swing.JTextField();
        ID = new javax.swing.JLabel();
        Tempat_ID = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Alamat = new javax.swing.JTextArea();
        No_Hp = new javax.swing.JTextField();
        No_tele = new javax.swing.JTextField();
        TanggalLahir = new javax.swing.JComboBox();
        BulanLahir = new javax.swing.JComboBox();
        TahunLahir = new javax.swing.JComboBox();
        Jenis_Kelamin = new javax.swing.JComboBox();
        goldar = new javax.swing.JComboBox();
        UmurPasien = new javax.swing.JTextField();
        TinggiPasien = new javax.swing.JTextField();
        BeratPasien = new javax.swing.JTextField();
        TambahAntri = new javax.swing.JButton();
        CariPasien = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        TabelPasien = new javax.swing.JTable();
        Find = new javax.swing.JButton();
        Provinsi = new javax.swing.JComboBox();
        Kota = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        Kamar = new javax.swing.JTextField();
        KelasKamar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        Nama_Pasien.setText("Nama_Pasien");
        Nama_Pasien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Nama_PasienMouseClicked(evt);
            }
        });
        Nama_Pasien.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Nama_PasienFocusGained(evt);
            }
        });
        getContentPane().add(Nama_Pasien);
        Nama_Pasien.setBounds(740, 150, 580, 32);

        Tempat_Lahir.setText("Tempat");
        Tempat_Lahir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tempat_LahirMouseClicked(evt);
            }
        });
        Tempat_Lahir.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Tempat_LahirFocusGained(evt);
            }
        });
        getContentPane().add(Tempat_Lahir);
        Tempat_Lahir.setBounds(631, 288, 215, 32);

        ID.setText("ID PASIEN");
        getContentPane().add(ID);
        ID.setBounds(1140, 110, 79, 32);

        Tempat_ID.setText("SD002-BKI-8890");
        getContentPane().add(Tempat_ID);
        Tempat_ID.setBounds(1220, 110, 99, 32);

        Alamat.setColumns(20);
        Alamat.setRows(5);
        Alamat.setText("Alamat");
        Alamat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AlamatMouseClicked(evt);
            }
        });
        Alamat.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                AlamatFocusGained(evt);
            }
        });
        jScrollPane1.setViewportView(Alamat);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(631, 402, 685, 71);

        No_Hp.setText("No_Telp");
        No_Hp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                No_HpMouseClicked(evt);
            }
        });
        No_Hp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                No_HpActionPerformed(evt);
            }
        });
        No_Hp.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                No_HpFocusGained(evt);
            }
        });
        getContentPane().add(No_Hp);
        No_Hp.setBounds(741, 326, 230, 32);

        No_tele.setText("No_Hp");
        No_tele.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                No_teleMouseClicked(evt);
            }
        });
        No_tele.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                No_teleFocusGained(evt);
            }
        });
        getContentPane().add(No_tele);
        No_tele.setBounds(1086, 326, 230, 32);

        TanggalLahir.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Tanggal -", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" }));
        getContentPane().add(TanggalLahir);
        TanggalLahir.setBounds(1087, 288, 115, 32);

        BulanLahir.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-Bulan Lahir-", "Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember" }));
        getContentPane().add(BulanLahir);
        BulanLahir.setBounds(852, 288, 229, 32);

        TahunLahir.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Tahun -", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962", "1961", "1960", "1959", "1958", "1957", "1956", "1955", "1954", "1953", "1952", "1951", "1950", "1949", "1948", "1947", "1946", "1945", "1944", "1943", "1942", "1941", "1940", "1939", "1938", "1937", "1936", "1935", "1934", "1933", "1932", "1931", "1930", "1929", "1928", "1927", "1926", "1925", "1924", "1923", "1922", "1921", "1920", "1919", "1918", "1917", "1916" }));
        TahunLahir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TahunLahirActionPerformed(evt);
            }
        });
        getContentPane().add(TahunLahir);
        TahunLahir.setBounds(1208, 288, 108, 32);

        Jenis_Kelamin.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-Jenis Kelamin-", "Laki-Laki", "Perempuan" }));
        getContentPane().add(Jenis_Kelamin);
        Jenis_Kelamin.setBounds(630, 560, 134, 32);

        goldar.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-Golongan Darah-", "A", "B", "AB", "O" }));
        getContentPane().add(goldar);
        goldar.setBounds(780, 560, 130, 32);

        UmurPasien.setText("Umur");
        UmurPasien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UmurPasienActionPerformed(evt);
            }
        });
        getContentPane().add(UmurPasien);
        UmurPasien.setBounds(1220, 560, 97, 32);

        TinggiPasien.setText("Tinggi Badan");
        TinggiPasien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TinggiPasienMouseClicked(evt);
            }
        });
        TinggiPasien.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TinggiPasienFocusGained(evt);
            }
        });
        getContentPane().add(TinggiPasien);
        TinggiPasien.setBounds(960, 560, 120, 32);

        BeratPasien.setText("Berat Badan");
        BeratPasien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BeratPasienMouseClicked(evt);
            }
        });
        BeratPasien.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                BeratPasienFocusGained(evt);
            }
        });
        getContentPane().add(BeratPasien);
        BeratPasien.setBounds(1090, 560, 120, 32);

        TambahAntri.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        TambahAntri.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/1428227814_checked_checkbox.png"))); // NOI18N
        TambahAntri.setText("Konfirmasi Keluar");
        TambahAntri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TambahAntriActionPerformed(evt);
            }
        });
        getContentPane().add(TambahAntri);
        TambahAntri.setBounds(158, 605, 167, 40);

        CariPasien.setText("- Cari Nama Pasien -");
        getContentPane().add(CariPasien);
        CariPasien.setBounds(45, 105, 457, 32);

        TabelPasien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Nama Pasien"
            }
        ));
        jScrollPane2.setViewportView(TabelPasien);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(45, 155, 558, 444);

        Find.setText("CARI");
        getContentPane().add(Find);
        Find.setBounds(508, 105, 95, 32);

        Provinsi.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Provinsi -", "jatim", "jateng", "jabar", "kaltim", "kalteng", "kalbar" }));
        getContentPane().add(Provinsi);
        Provinsi.setBounds(631, 479, 325, 32);

        Kota.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- KOTA -", "darjo", "boyo" }));
        getContentPane().add(Kota);
        Kota.setBounds(991, 479, 325, 32);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/1426718664_circle_back_arrow_-24.png"))); // NOI18N
        jButton1.setText("Back");
        getContentPane().add(jButton1);
        jButton1.setBounds(45, 605, 95, 40);

        Kamar.setText("Kamar");
        Kamar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                KamarFocusGained(evt);
            }
        });
        getContentPane().add(Kamar);
        Kamar.setBounds(740, 190, 580, 32);

        KelasKamar.setText("Kelas Kamar");
        KelasKamar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                KelasKamarFocusGained(evt);
            }
        });
        getContentPane().add(KelasKamar);
        KelasKamar.setBounds(740, 230, 580, 32);

        jLabel1.setFont(new java.awt.Font("Agency FB", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DAFTAR RAWAT INAP");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 30, 305, 58);

        jLabel3.setText("Nama Pasien");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(630, 160, 90, 20);

        jLabel4.setText("Kamar");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(630, 200, 30, 14);

        jLabel5.setText("Kelas Kamar");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(630, 240, 60, 14);

        jLabel6.setText("Tempat/Tangal Lahir");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(630, 270, 120, 14);

        jLabel7.setText("Nomor HP");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(980, 340, 50, 14);

        jLabel8.setText("Nomor Telepon");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(630, 340, 80, 14);

        jLabel2.setText("Alamat Tinggal");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(630, 380, 100, 14);

        jLabel9.setText("Jenis Kelamin");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(630, 540, 80, 14);

        jLabel10.setText("Golongan Darah");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(780, 540, 90, 14);

        jLabel11.setText("Tinggi");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(960, 540, 28, 14);

        jLabel12.setText("Berat");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(1090, 540, 40, 14);

        jLabel13.setText("Umur");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(1220, 540, 25, 14);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/background2.png"))); // NOI18N
        getContentPane().add(jLabel14);
        jLabel14.setBounds(0, 0, 1360, 690);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Nama_PasienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Nama_PasienMouseClicked

        if (a.equals(Nama_Pasien.getText())) {
            Nama_Pasien.setText("");
        }

    }//GEN-LAST:event_Nama_PasienMouseClicked

    private void Tempat_LahirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tempat_LahirMouseClicked
        if (b.equals(Tempat_Lahir.getText())) {
            Tempat_Lahir.setText("");
        }
    }//GEN-LAST:event_Tempat_LahirMouseClicked

    private void Tempat_LahirFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Tempat_LahirFocusGained
        if ("Tempat".equals(Tempat_Lahir.getText())) {
            Tempat_Lahir.setText("");
        }
    }//GEN-LAST:event_Tempat_LahirFocusGained

    private void Nama_PasienFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Nama_PasienFocusGained
        if (a.equals(Nama_Pasien.getText())) {
            Nama_Pasien.setText("");
        }
    }//GEN-LAST:event_Nama_PasienFocusGained

    private void AlamatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AlamatMouseClicked
        if (c.equals(Alamat.getText())) {
            Alamat.setText("");
        }
    }//GEN-LAST:event_AlamatMouseClicked

    private void AlamatFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AlamatFocusGained
        if (c.equals(Alamat.getText())) {
            Alamat.setText("");
        }
    }//GEN-LAST:event_AlamatFocusGained

    private void UmurPasienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UmurPasienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UmurPasienActionPerformed

    private void No_HpFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_No_HpFocusGained
        if (d.equals(No_Hp.getText())) {
            No_Hp.setText("");
        }
    }//GEN-LAST:event_No_HpFocusGained

    private void No_teleFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_No_teleFocusGained
        if (e.equals(No_tele.getText())) {
            No_tele.setText("");
        }
    }//GEN-LAST:event_No_teleFocusGained

    private void No_HpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_No_HpMouseClicked
        if (d.equals(No_Hp.getText())) {
            No_Hp.setText("");
        }
    }//GEN-LAST:event_No_HpMouseClicked

    private void No_teleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_No_teleMouseClicked
        if (e.equals(No_tele.getText())) {
            No_tele.setText("");
        }
    }//GEN-LAST:event_No_teleMouseClicked

    private void TinggiPasienFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TinggiPasienFocusGained
        if (f.equals(TinggiPasien.getText())) {
            TinggiPasien.setText("");
        }
    }//GEN-LAST:event_TinggiPasienFocusGained

    private void TinggiPasienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TinggiPasienMouseClicked
        if (f.equals(TinggiPasien.getText())) {
            TinggiPasien.setText("");
        }
    }//GEN-LAST:event_TinggiPasienMouseClicked

    private void BeratPasienFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BeratPasienFocusGained
        if (g.equals(BeratPasien.getText())) {
            BeratPasien.setText("");
        }
    }//GEN-LAST:event_BeratPasienFocusGained

    private void BeratPasienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BeratPasienMouseClicked
        if (g.equals(BeratPasien.getText())) {
            BeratPasien.setText("");
        }
    }//GEN-LAST:event_BeratPasienMouseClicked

    private void TahunLahirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TahunLahirActionPerformed
        if (TahunLahir.getSelectedIndex() != 0) {

            UmurPasien.setText(hitungumur());
        }
    }//GEN-LAST:event_TahunLahirActionPerformed

    private void KamarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_KamarFocusGained
        if (j.equals(Kamar.getText())) {
            Kamar.setText("");
        }
    }//GEN-LAST:event_KamarFocusGained

    private void KelasKamarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_KelasKamarFocusGained
        if (j.equals(Kamar.getText())) {
            KelasKamar.setText("");
        }
    }//GEN-LAST:event_KelasKamarFocusGained

    private void TambahAntriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TambahAntriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TambahAntriActionPerformed

    private void No_HpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_No_HpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_No_HpActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Alamat;
    private javax.swing.JTextField BeratPasien;
    private javax.swing.JComboBox BulanLahir;
    private javax.swing.JTextField CariPasien;
    private javax.swing.JButton Find;
    private javax.swing.JLabel ID;
    private javax.swing.JComboBox Jenis_Kelamin;
    private javax.swing.JTextField Kamar;
    private javax.swing.JTextField KelasKamar;
    private javax.swing.JComboBox Kota;
    private javax.swing.JTextField Nama_Pasien;
    private javax.swing.JTextField No_Hp;
    private javax.swing.JTextField No_tele;
    private javax.swing.JComboBox Provinsi;
    private javax.swing.JTable TabelPasien;
    private javax.swing.JComboBox TahunLahir;
    private javax.swing.JButton TambahAntri;
    private javax.swing.JComboBox TanggalLahir;
    private javax.swing.JTextField Tempat_ID;
    private javax.swing.JTextField Tempat_Lahir;
    private javax.swing.JTextField TinggiPasien;
    private javax.swing.JTextField UmurPasien;
    private javax.swing.JComboBox goldar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
