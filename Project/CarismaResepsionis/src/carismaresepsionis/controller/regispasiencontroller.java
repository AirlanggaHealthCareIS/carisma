package carismaresepsionis.controller;

import carismainterface.entity.Kota;
import carismainterface.entity.Pasien;
import carismainterface.server.KotaService;
import carismainterface.server.PasienService;
import carismaresepsionis.boundaries.regispasienform;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Fiqhi Darmawan
 */
public class regispasiencontroller {

    private PasienService pasienService;
    private KotaService kotaService;

    public regispasiencontroller(ClientSocket client) throws RemoteException {
        this.pasienService = client.getPasienService();
        this.kotaService = client.getKotaService();
    }

    public void InsertNamaPasien(String id_pasien, String kota_id_kota,  String nama_pasien, String alamat_pasien, String kartuid_pasien, String nokartuid_pasien, String telp_pasien, String hp_pasien, String tempatlahirpasien, String tgllahir_pasien, String kelamin_pasien, String darah_pasien, int berat_pasien, int tinggi_Pasien, String regdate_pasien, String username) throws RemoteException {
        Pasien pasien = new Pasien();
        User user = new User();
        System.out.println(generatePasienId(nama_pasien, tgllahir_pasien, nokartuid_pasien));
<<<<<<< HEAD
//        pasien.setIdPasien(id_pasien);
//        pasien.setKotaIdKota(kota_id_kota);
//        pasien.setUserIdUser(user_id_user);
//        pasien.setNamaPasien(nama_pasien);
//        pasien.setAlamatPasien(alamat_pasien);
//        pasien.setKartuidPasien(kartuid_pasien);
//        pasien.setNokartuidPasien(nokartuid_pasien);
//        pasien.setTelpPasien(telp_pasien);
//        pasien.setHpPasien(hp_pasien);
//        pasien.setTempatlahirPasien(tempatlahirpasien);
//        pasien.setTgllahirPasien(tgllahir_pasien);
//        pasien.setKelaminPasien(kelamin_pasien);
//        pasien.setDarahPasien(darah_pasien);
//        pasien.setBeratPasien(berat_pasien);
//        pasien.setTinggiPasien(tinggi_Pasien);
//        pasien.setRegdatePasien(regdate_pasien);
//        pasienService.insertPasien(pasien);
    }

    public String generateUserName(String nama, String tgl) {
        return null;
=======
        pasien.setIdPasien(generatePasienId(nama_pasien, tgllahir_pasien, nokartuid_pasien));
        pasien.setKotaIdKota(kota_id_kota);
        pasien.setNamaPasien(nama_pasien);
        pasien.setAlamatPasien(alamat_pasien);
        pasien.setKartuidPasien(kartuid_pasien);
        pasien.setNokartuidPasien(nokartuid_pasien);
        pasien.setTelpPasien(telp_pasien);
        pasien.setHpPasien(hp_pasien);
        pasien.setTempatlahirPasien(tempatlahirpasien);  
        pasien.setTgllahirPasien(tgllahir_pasien);
        pasien.setKelaminPasien(kelamin_pasien);
        pasien.setDarahPasien(darah_pasien);
        pasien.setBeratPasien(berat_pasien);
        pasien.setTinggiPasien(tinggi_Pasien);
        pasien.setRegdatePasien(regdate_pasien);
        user = userService.getUser(username);
        pasien.setUserIdUser(Integer.toString(user.getIdUser()));
        pasienService.insertPasien(pasien);
    }

    public void InsertUser (  String username , String Password, String role) throws RemoteException {
       
        User user = new User ();
        user.setUsername(username);
        user.setPassword(Password);
        user.setRegistered(generatetanggal());
        System.out.println("hasil generate password=" +Password);
        user.setRole(role);
        System.out.println("hasil role=" +role);
        userService.insertUser(user);
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
    
    public String generateUserName(String nama, String tgl) {
        
        String[] firstName = nama.split(" ");
        char[] tglLahir = tgl.toCharArray();
        char[] dateOnly = new char[2];
        //2015-01-01
        for (int i = 0; i < 2; i++) {
            dateOnly[i] = tglLahir[i+8];
        }
        String userName = firstName[0].concat(String.valueOf(dateOnly));
        System.out.println("hasil generate username = "+userName);
        
       //String NamaUser = Character.toString(nama.split(tgl)
        return userName;
        
>>>>>>> origin/develop
    }

    public String generatePasienId(String Nama, String tgl, String end) {
        String pasienId = Character.toString(Nama.charAt(0)).toUpperCase() + Character.toString(Nama.charAt(Nama.length() - 1)).toUpperCase() + Character.toString(tgl.charAt(2)) + Character.toString(tgl.charAt(3)) + Character.toString(tgl.charAt(5)) + Character.toString(tgl.charAt(6)) + Character.toString(tgl.charAt(8)) + Character.toString(tgl.charAt(9)) + Character.toString(end.charAt(end.length() - 1)) + Character.toString(end.charAt(end.length() - 2));
        return pasienId;
    }

    public void setComboBoxKota(regispasienform ui) {
        ArrayList<Kota> list = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            ui.Kota.addItem(list.get(i).getNamaKota());
        }        
    }
    
   
}
