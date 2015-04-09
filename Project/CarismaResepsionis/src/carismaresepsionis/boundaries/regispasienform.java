package carismaresepsionis.boundaries;

import carismaresepsionis.controller.ClientSocket;
import javax.swing.JOptionPane;

/**
 *
 * @author devan
 */
public class regispasienform extends javax.swing.JFrame {
    private ClientSocket client;
    private String userName;
    String a, b, c, d, e, f, g, h, i;
    settergetter simpanan = new settergetter();

    String hitungumur() {
        int umur;
        umur = Integer.parseInt((String) TahunLahir.getSelectedItem());
        int umurini = 2015 - umur;
   // System.out.println(umurini);
        return String.valueOf(umurini);
    }

    /**
     * Creates new form regispasienform
     */
    public regispasienform(ClientSocket client, String userName) {
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
        h = Jenis_Kartu.getText();
        i = No_Kartu.getText();

        //   tanggalkustom();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
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
        Jenis_Kartu = new javax.swing.JTextField();
        No_Kartu = new javax.swing.JTextField();
        CariPasien = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        TabelPasien = new javax.swing.JTable();
        DaftarBaru = new javax.swing.JButton();
        UpdatePasien = new javax.swing.JButton();
        Find = new javax.swing.JButton();
        Provinsi = new javax.swing.JComboBox();
        Kota = new javax.swing.JComboBox();
        Confirm = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Agency FB", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Daftar Pasien Baru");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 0, 320, 58);

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
        Nama_Pasien.setBounds(580, 130, 685, 32);

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
        Tempat_Lahir.setBounds(580, 170, 215, 32);

        ID.setText("ID PASIEN");
        getContentPane().add(ID);
        ID.setBounds(1080, 90, 79, 32);

        Tempat_ID.setText("SD002-BKI-8890");
        getContentPane().add(Tempat_ID);
        Tempat_ID.setBounds(1170, 90, 99, 32);

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
        jScrollPane1.setBounds(580, 300, 685, 71);

        No_Hp.setText("No_HP");
        No_Hp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                No_HpMouseClicked(evt);
            }
        });
        No_Hp.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                No_HpFocusGained(evt);
            }
        });
        getContentPane().add(No_Hp);
        No_Hp.setBounds(580, 210, 340, 32);

        No_tele.setText("No_Telp");
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
        No_tele.setBounds(930, 210, 335, 32);

        TanggalLahir.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Tanggal -", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" }));
        getContentPane().add(TanggalLahir);
        TanggalLahir.setBounds(1040, 170, 115, 32);

        BulanLahir.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-Bulan Lahir-", "Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember" }));
        getContentPane().add(BulanLahir);
        BulanLahir.setBounds(800, 170, 229, 32);

        TahunLahir.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Tahun -", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962", "1961", "1960", "1959", "1958", "1957", "1956", "1955", "1954", "1953", "1952", "1951", "1950", "1949", "1948", "1947", "1946", "1945", "1944", "1943", "1942", "1941", "1940", "1939", "1938", "1937", "1936", "1935", "1934", "1933", "1932", "1931", "1930", "1929", "1928", "1927", "1926", "1925", "1924", "1923", "1922", "1921", "1920", "1919", "1918", "1917", "1916" }));
        TahunLahir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TahunLahirActionPerformed(evt);
            }
        });
        getContentPane().add(TahunLahir);
        TahunLahir.setBounds(1160, 170, 108, 32);

        Jenis_Kelamin.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-Jenis Kelamin-", "Laki-Laki", "Perempuan" }));
        getContentPane().add(Jenis_Kelamin);
        Jenis_Kelamin.setBounds(580, 430, 134, 32);

        goldar.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-Golongan Darah-", "A", "B", "AB", "O" }));
        goldar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goldarActionPerformed(evt);
            }
        });
        getContentPane().add(goldar);
        goldar.setBounds(720, 430, 160, 32);

        UmurPasien.setText("Umur");
        UmurPasien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UmurPasienActionPerformed(evt);
            }
        });
        getContentPane().add(UmurPasien);
        UmurPasien.setBounds(910, 430, 97, 32);

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
        TinggiPasien.setBounds(580, 470, 134, 32);

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
        BeratPasien.setBounds(720, 470, 130, 32);

        TambahAntri.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        TambahAntri.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/1428222513_icon-ios7-plus-outline-32.png"))); // NOI18N
        TambahAntri.setText("Tambah Antrian");
        getContentPane().add(TambahAntri);
        TambahAntri.setBounds(990, 550, 170, 40);

        Jenis_Kartu.setText("Jenis Kartu");
        Jenis_Kartu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Jenis_KartuMouseClicked(evt);
            }
        });
        Jenis_Kartu.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Jenis_KartuFocusGained(evt);
            }
        });
        getContentPane().add(Jenis_Kartu);
        Jenis_Kartu.setBounds(580, 250, 340, 32);

        No_Kartu.setText("Nomor_Kartu");
        No_Kartu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                No_KartuMouseClicked(evt);
            }
        });
        No_Kartu.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                No_KartuFocusGained(evt);
            }
        });
        getContentPane().add(No_Kartu);
        No_Kartu.setBounds(930, 250, 335, 32);

        CariPasien.setText("- Cari Nama Pasien -");
        getContentPane().add(CariPasien);
        CariPasien.setBounds(20, 60, 457, 32);

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
        jScrollPane2.setBounds(20, 110, 530, 428);

        DaftarBaru.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        DaftarBaru.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/1428227100_add_user.png"))); // NOI18N
        DaftarBaru.setText("Daftar Baru");
        getContentPane().add(DaftarBaru);
        DaftarBaru.setBounds(410, 550, 140, 40);

        UpdatePasien.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        UpdatePasien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/1428227236_card_in_use.png"))); // NOI18N
        UpdatePasien.setText("Cetak Bukti Antrian");
        getContentPane().add(UpdatePasien);
        UpdatePasien.setBounds(200, 550, 180, 40);

        Find.setText("FIND");
        getContentPane().add(Find);
        Find.setBounds(480, 60, 95, 32);

        Provinsi.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Provinsi -", "jatim", "jateng", "jabar", "kaltim", "kalteng", "kalbar" }));
        getContentPane().add(Provinsi);
        Provinsi.setBounds(580, 390, 325, 32);

        Kota.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- KOTA -", "darjo", "boyo" }));
        getContentPane().add(Kota);
        Kota.setBounds(940, 390, 325, 32);

        Confirm.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Confirm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/1426717487_save.png"))); // NOI18N
        Confirm.setText("Confirm");
        Confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmActionPerformed(evt);
            }
        });
        getContentPane().add(Confirm);
        Confirm.setBounds(870, 550, 110, 40);

        jButton1.setText("Home");
        getContentPane().add(jButton1);
        jButton1.setBounds(-490, 620, 155, 32);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/1426718664_circle_back_arrow_-24.png"))); // NOI18N
        jButton2.setText("Back");
        jButton2.setPreferredSize(new java.awt.Dimension(89, 23));
        getContentPane().add(jButton2);
        jButton2.setBounds(1170, 550, 90, 40);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/background2.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 1360, 690);

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

    private void ConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmActionPerformed

        //lek default
        if (f.equals(TinggiPasien.getText()) || (g.equals(BeratPasien.getText())) || ("".equals(UmurPasien.getText())) || ("".equals(Tempat_ID.getText())) || (a.equals(Nama_Pasien.getText()))
                || (b.equals(Tempat_Lahir.getText())) || (c.equals(Alamat.getText())) || (BulanLahir.getSelectedIndex() == 0) || (TanggalLahir.getSelectedIndex() == 0) || (TahunLahir.getSelectedIndex() == 0)
                || (Provinsi.getSelectedIndex() == 0) || (Kota.getSelectedIndex() == 0) || (Jenis_Kelamin.getSelectedIndex() == 0) || (goldar.getSelectedIndex() == 0)
                || (d.equals(No_Hp.getText())) && (e.equals(No_tele.getText())) || (h.equals(Jenis_Kartu.getText())) && (i.equals(No_Kartu.getText()))) {
            JOptionPane.showMessageDialog(rootPane, "ada yang belum keisi", "Confirm", WIDTH);

        } //lek kosong
        else if ("".equals(TinggiPasien.getText()) || ("".equals(BeratPasien.getText())) || ("".equals(UmurPasien.getText())) || ("".equals(Tempat_ID.getText())) || ("".equals(Nama_Pasien.getText()))
                || ("".equals(Tempat_Lahir.getText())) || ("".equals(Alamat.getText())) || (BulanLahir.getSelectedIndex() == 0) || (TanggalLahir.getSelectedIndex() == 0) || (TahunLahir.getSelectedIndex() == 0)
                || (Provinsi.getSelectedIndex() == 0) || (Kota.getSelectedIndex() == 0) || (Jenis_Kelamin.getSelectedIndex() == 0) || (goldar.getSelectedIndex() == 0)
                || ("".equals(No_Hp.getText())) && ("".equals(No_tele.getText())) || ("".equals(Jenis_Kartu.getText())) && ("".equals(No_Kartu.getText()))) {
            JOptionPane.showMessageDialog(rootPane, "ada yang belum keisi", "Confirm", WIDTH);
        } //         int tinggi,bert,umur;
        //   String id,nama,tempat,bulanlahir,tanggal,tahun,hp,telp,kk,klain,aamat,provinsi,kota,jeniskelamin,goldar;
        else {
            simpanan.setNama(Nama_Pasien.getText());
            simpanan.setTempat(Tempat_Lahir.getText());
            simpanan.setBulanlahir((String) BulanLahir.getSelectedItem());
            simpanan.setTanggal((String) TanggalLahir.getSelectedItem());
            simpanan.setBulanlahir((String) BulanLahir.getSelectedItem());
            simpanan.setTahun((String) TahunLahir.getSelectedItem());
            simpanan.setProvinsi((String) Provinsi.getSelectedItem());
            simpanan.setKota((String) Kota.getSelectedItem());
            simpanan.setJeniskelamin((String) Jenis_Kelamin.getSelectedItem());
            simpanan.setGoldar((String) goldar.getSelectedItem());
            simpanan.setAamat((String) Alamat.getText());
            simpanan.setTinggi(Integer.parseInt(TinggiPasien.getText()));
            simpanan.setUmur(Integer.parseInt(UmurPasien.getText()));
            simpanan.setBert(Integer.parseInt(BeratPasien.getText()));
            if (h.equals(Jenis_Kartu.getText())) {
                simpanan.setKlain(No_Kartu.getText());
                if (d.equals(No_Hp.getText())) {
                    simpanan.setTelp(No_tele.getText());
                } else {
                    simpanan.setHp(No_Hp.getText());
                }
            } else if (i.equals(No_Kartu.getText())) {
                simpanan.setKk(Jenis_Kartu.getText());
                if (d.equals(No_Hp.getText())) {
                    simpanan.setTelp(No_tele.getText());
                } else {
                    simpanan.setHp(No_Hp.getText());
                }
            } else {
                simpanan.setKlain(No_Kartu.getText());
                simpanan.setKk(Jenis_Kartu.getText());
                simpanan.setTelp(No_tele.getText());
                simpanan.setHp(No_Hp.getText());
            }

            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(null, "\nNama : " + simpanan.getNama() + "\nTempat dan Tanggal Lahir : "
                    + simpanan.getTempat() + " " + simpanan.getTanggal() + " " + simpanan.getBulanlahir() + " " + simpanan.getTahun() + "\nNo HP/Telp : " + simpanan.getHp() + " dan " + simpanan.getTelp()
                    + "\n No Kartu kk / Pengenal lain : " + simpanan.getKk() + " " + simpanan.getKlain() + "\n Alamat : " + simpanan.getAamat() + " " + simpanan.getKota() + " " + simpanan.getProvinsi()
                    + "\n Gender : " + simpanan.getJeniskelamin() + "\n Gol. darah : " + simpanan.getGoldar()
                    + "\n tinggi : " + simpanan.getTinggi() + " Berat : " + simpanan.getBert() + "\n Umur : " + simpanan.getUmur() + "\nApakah Data Tersebut benar?", "Warning", dialogButton);
            if (dialogResult == JOptionPane.YES_OPTION) {

                TinggiPasien.setText(f);
                BeratPasien.setText(g);
                UmurPasien.setText("Umur");
                Tempat_ID.setText("dxdiag-0897-6TUX");
                Nama_Pasien.setText(a);
                Alamat.setText(c);
                Tempat_Lahir.setText(b);

                BulanLahir.setSelectedIndex(0);
                TanggalLahir.setSelectedIndex(0);
                TahunLahir.setSelectedIndex(0);
                Provinsi.setSelectedIndex(0);
                Kota.setSelectedIndex(0);
                Jenis_Kelamin.setSelectedIndex(0);
                goldar.setSelectedIndex(0);
                No_Hp.setText(d);
                No_tele.setText(e);
                Jenis_Kartu.setText(h);
                No_Kartu.setText(i);

            }

        }
    }//GEN-LAST:event_ConfirmActionPerformed

    private void Jenis_KartuFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Jenis_KartuFocusGained
        if (h.equals(Jenis_Kartu.getText())) {
            Jenis_Kartu.setText("");
        }
    }//GEN-LAST:event_Jenis_KartuFocusGained

    private void Jenis_KartuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Jenis_KartuMouseClicked
        if (h.equals(Jenis_Kartu.getText())) {
            Jenis_Kartu.setText("");
        }
    }//GEN-LAST:event_Jenis_KartuMouseClicked

    private void No_KartuFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_No_KartuFocusGained
        if (i.equals(No_Kartu.getText())) {
            No_Kartu.setText("");
        }
    }//GEN-LAST:event_No_KartuFocusGained

    private void No_KartuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_No_KartuMouseClicked
        if (i.equals(No_Kartu.getText())) {
            No_Kartu.setText("");
        }
    }//GEN-LAST:event_No_KartuMouseClicked

    private void goldarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goldarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_goldarActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Alamat;
    private javax.swing.JTextField BeratPasien;
    private javax.swing.JComboBox BulanLahir;
    private javax.swing.JTextField CariPasien;
    private javax.swing.JButton Confirm;
    private javax.swing.JButton DaftarBaru;
    private javax.swing.JButton Find;
    private javax.swing.JLabel ID;
    private javax.swing.JTextField Jenis_Kartu;
    private javax.swing.JComboBox Jenis_Kelamin;
    private javax.swing.JComboBox Kota;
    private javax.swing.JTextField Nama_Pasien;
    private javax.swing.JTextField No_Hp;
    private javax.swing.JTextField No_Kartu;
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
    private javax.swing.JButton UpdatePasien;
    private javax.swing.JComboBox goldar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
