package carismaserver.entity;

import carismainterface.entity.Pasien;
import carismainterface.server.PasienService;
import carismaserver.boundaries.Main;
import carismaserver.controllers.DatabaseConnection;
import java.rmi.RemoteException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author K-MiL Caster
 */
public class PasienEntity implements PasienService {

    public Main ui;

    public PasienEntity() {

    }

    public PasienEntity(Main ui) {
        this.ui = ui;
    }

    @Override
    public void insertPasien(Pasien pasien) throws RemoteException {
        ui.act.append("Client Execute insertPasien " + pasien + "\n");

        PreparedStatement statement = null;
        try {
            statement = DatabaseConnection.getConnection().prepareStatement(
                    "INSERT INTO pasien (id_pasien, kota_id_kota, user_id_user, nama_pasien, alamat_pasien, kartuid_pasien, nokartuid_pasien, telp_pasien, hp_pasien, tempatlahir_pasien, tgllahir_pasien, kelamin_pasien, darah_pasien, regdate_pasien) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)"
            );
            statement.setString(1, pasien.getIdPasien());
            statement.setString(2, pasien.getKotaIdKota());
            statement.setString(3, pasien.getUserIdUser());
            statement.setString(4, pasien.getNamaPasien());
            statement.setString(5, pasien.getAlamatPasien());
            statement.setString(6, pasien.getKartuidPasien());
            statement.setString(7, pasien.getNokartuidPasien());
            statement.setString(8, pasien.getTelpPasien());
            statement.setString(9, pasien.getHpPasien());
            statement.setString(10, pasien.getTempatlahirPasien());
            statement.setString(11, pasien.getTgllahirPasien());
            statement.setString(12, pasien.getKelaminPasien());
            statement.setString(13, pasien.getDarahPasien());
            statement.setString(14, pasien.getRegdatePasien());
            statement.executeUpdate();
        } catch (SQLException exception) {
            ui.act.append("InsertPasien Error \n");
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException exception) {

                }
            }
        }
    }

    @Override
    public void updatePasien(Pasien pasien) throws RemoteException {
        ui.act.append("Client Execute updatePasien " + pasien + "\n");

        PreparedStatement statement = null;
        try {
            statement = DatabaseConnection.getConnection().prepareStatement(
                    "UPDATE pasien SET kota_id_kota = ?, user_id_user = ?, nama_pasien = ?, alamat_pasien = ?, kartuid_pasien = ?, nokartuid_pasien = ?, telp_pasien = ?, hp_pasien = ?, tempatlahir_pasien = ?, tgllahir_pasien = ?, kelamin_pasien = ?, darah_pasien = ?, regdate_pasien = ? WHERE id_pasien = ?"
            );
            statement.setString(1, pasien.getKotaIdKota());
            statement.setString(2, pasien.getUserIdUser());
            statement.setString(3, pasien.getNamaPasien());
            statement.setString(4, pasien.getAlamatPasien());
            statement.setString(5, pasien.getKartuidPasien());
            statement.setString(6, pasien.getNokartuidPasien());
            statement.setString(7, pasien.getTelpPasien());
            statement.setString(8, pasien.getHpPasien());
            statement.setString(9, pasien.getTempatlahirPasien());
            statement.setString(10, pasien.getTgllahirPasien());
            statement.setString(11, pasien.getKelaminPasien());
            statement.setString(12, pasien.getDarahPasien());
            statement.setString(13, pasien.getRegdatePasien());
            statement.setString(14, pasien.getIdPasien());
            statement.executeUpdate();
        } catch (SQLException exception) {
            ui.act.append("UpdatePasien Error \n");
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException exception) {

                }
            }
        }
    }

    @Override
    public void deletePasien(String pasien) throws RemoteException {
        ui.act.append("Client Execute deletePasien (" + pasien + ") \n");
        PreparedStatement statement = null;
        try {
            statement = DatabaseConnection.getConnection().prepareStatement(
                    "DELETE FROM pasien WHERE id_pasien = ?");
            statement.setString(1, pasien);
            statement.executeUpdate();
        } catch (SQLException e) {
            ui.act.append("deletePasien Error \n");
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException exception) {
                }
            }
        }
    }

    @Override
    public Pasien getPasien(String pasien) throws RemoteException {
        ui.act.append("Client Execute getPasien (" + pasien + ") \n");

        PreparedStatement statement = null;
        try {
            statement = DatabaseConnection.getConnection().prepareStatement(
                    "SELECT * FROM pasien WHERE id_pasien = ?");
            statement.setString(1, pasien);
            ResultSet result = statement.executeQuery();
            Pasien pasi = null;
            if (result.next()) {
                pasi = new Pasien();
                pasi.setIdPasien(result.getString("id_pasien"));
                pasi.setKotaIdKota(result.getString("kota_id_kota"));
                pasi.setUserIdUser(result.getString("user_id_user"));
                pasi.setNamaPasien((result.getString("nama_pasien")));
                pasi.setAlamatPasien(result.getString("alamat_pasien"));
                pasi.setKartuidPasien(result.getString("kartuid_pasien"));
                pasi.setNokartuidPasien(result.getString("nokartuid_pasien"));
                pasi.setTelpPasien(result.getString("telp_pasien"));
                pasi.setHpPasien(result.getString("hp_pasien"));
                pasi.setTempatlahirPasien(result.getString("tempatlahir_pasien"));
                pasi.setTgllahirPasien(result.getString("tgllahir_pasien"));
                pasi.setKelaminPasien(result.getString("kelamin_pasien"));
                pasi.setDarahPasien(result.getString("darah_pasien"));
                pasi.setRegdatePasien(result.getString("regdate_pasien"));
            }
            return pasi;
        } catch (SQLException exception) {
            ui.act.append("getPasien Error \n");
            return null;
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException exception) {
                }
            }
        }
    }

    @Override
    public List<Pasien> getPasien() throws RemoteException {
        ui.act.append("Client Execute getPasienList  \n");

        PreparedStatement statement = null;
        try {
            statement = DatabaseConnection.getConnection().prepareStatement(
                    "SELECT * FROM pasien");
            ResultSet result = statement.executeQuery();
            List<Pasien> list = new ArrayList<Pasien>();
            Pasien pasi = null;
            if (result.next()) {
                pasi = new Pasien();
                pasi.setIdPasien(result.getString("id_pasien"));
                pasi.setKotaIdKota(result.getString("kota_id_kota"));
                pasi.setUserIdUser(result.getString("user_id_user"));
                pasi.setNamaPasien((result.getString("nama_pasien")));
                pasi.setAlamatPasien(result.getString("alamat_pasien"));
                pasi.setKartuidPasien(result.getString("kartuid_pasien"));
                pasi.setNokartuidPasien(result.getString("nokartuid_pasien"));
                pasi.setTelpPasien(result.getString("telp_pasien"));
                pasi.setHpPasien(result.getString("hp_pasien"));
                pasi.setTempatlahirPasien(result.getString("tempatlahir_pasien"));
                pasi.setTgllahirPasien(result.getString("tgllahir_pasien"));
                pasi.setKelaminPasien(result.getString("kelamin_pasien"));
                pasi.setDarahPasien(result.getString("darah_pasien"));
                pasi.setRegdatePasien(result.getString("regdate_pasien"));
                list.add(pasi);
            }
            return list;
        } catch (SQLException exception) {
            ui.act.append("getPasienList Error \n");
            return null;
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException exception) {
                }
            }
        }
    }

    @Override
    public List<Pasien> getPasienByName(String pasien) throws RemoteException {
        ui.act.append("Client Execute getPasienListByName  \n");

        PreparedStatement statement = null;
        try {
            statement = DatabaseConnection.getConnection().prepareStatement(
                    "SELECT * FROM pasien WHERE nama_pasien LIKE('%"+pasien+"%')");
            ResultSet result = statement.executeQuery();
            List<Pasien> list = new ArrayList<Pasien>();
            Pasien pasi = null;
            if (result.next()) {
                pasi = new Pasien();
                pasi.setIdPasien(result.getString("id_pasien"));
                pasi.setKotaIdKota(result.getString("kota_id_kota"));
                pasi.setUserIdUser(result.getString("user_id_user"));
                pasi.setNamaPasien((result.getString("nama_pasien")));
                pasi.setAlamatPasien(result.getString("alamat_pasien"));
                pasi.setKartuidPasien(result.getString("kartuid_pasien"));
                pasi.setNokartuidPasien(result.getString("nokartuid_pasien"));
                pasi.setTelpPasien(result.getString("telp_pasien"));
                pasi.setHpPasien(result.getString("hp_pasien"));
                pasi.setTempatlahirPasien(result.getString("tempatlahir_pasien"));
                pasi.setTgllahirPasien(result.getString("tgllahir_pasien"));
                pasi.setKelaminPasien(result.getString("kelamin_pasien"));
                pasi.setDarahPasien(result.getString("darah_pasien"));
                pasi.setRegdatePasien(result.getString("regdate_pasien"));
                list.add(pasi);
            }
            return list;
        } catch (SQLException exception) {
            ui.act.append("getPasienListByName Error \n");
            return null;
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException exception) {
                }
            }
        }
    }

}
