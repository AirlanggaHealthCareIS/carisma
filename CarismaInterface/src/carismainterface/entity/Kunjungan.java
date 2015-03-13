/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carismainterface.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author K-MiL Caster
 */
@Entity
@Table(name = "kunjungan")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Kunjungan.findAll", query = "SELECT k FROM Kunjungan k"),
    @NamedQuery(name = "Kunjungan.findByIdKunjungan", query = "SELECT k FROM Kunjungan k WHERE k.idKunjungan = :idKunjungan"),
    @NamedQuery(name = "Kunjungan.findByTanggaljamKunjungan", query = "SELECT k FROM Kunjungan k WHERE k.tanggaljamKunjungan = :tanggaljamKunjungan"),
    @NamedQuery(name = "Kunjungan.findByBiayaKunjungan", query = "SELECT k FROM Kunjungan k WHERE k.biayaKunjungan = :biayaKunjungan")})
public class Kunjungan implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_kunjungan")
    private String idKunjungan;
    @Basic(optional = false)
    @Column(name = "tanggaljam_kunjungan")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tanggaljamKunjungan;
    @Column(name = "biaya_kunjungan")
    private Integer biayaKunjungan;
    @JoinColumn(name = "pasien_kamar_id_peminjaman", referencedColumnName = "id_peminjaman")
    @ManyToOne
    private PasienKamar pasienKamarIdPeminjaman;
    @JoinColumn(name = "transaksijualobat_id_transaksijual", referencedColumnName = "id_transaksijual")
    @ManyToOne
    private Transaksijualobat transaksijualobatIdTransaksijual;
    @JoinColumn(name = "rekammedis_id_rekammedis", referencedColumnName = "id_rekammedis")
    @ManyToOne(optional = false)
    private Rekammedik rekammedisIdRekammedis;
    @JoinColumn(name = "pasien_id_pasien", referencedColumnName = "id_pasien")
    @ManyToOne(optional = false)
    private Pasien pasienIdPasien;

    public Kunjungan() {
    }

    public Kunjungan(String idKunjungan) {
        this.idKunjungan = idKunjungan;
    }

    public Kunjungan(String idKunjungan, Date tanggaljamKunjungan) {
        this.idKunjungan = idKunjungan;
        this.tanggaljamKunjungan = tanggaljamKunjungan;
    }

    public String getIdKunjungan() {
        return idKunjungan;
    }

    public void setIdKunjungan(String idKunjungan) {
        this.idKunjungan = idKunjungan;
    }

    public Date getTanggaljamKunjungan() {
        return tanggaljamKunjungan;
    }

    public void setTanggaljamKunjungan(Date tanggaljamKunjungan) {
        this.tanggaljamKunjungan = tanggaljamKunjungan;
    }

    public Integer getBiayaKunjungan() {
        return biayaKunjungan;
    }

    public void setBiayaKunjungan(Integer biayaKunjungan) {
        this.biayaKunjungan = biayaKunjungan;
    }

    public PasienKamar getPasienKamarIdPeminjaman() {
        return pasienKamarIdPeminjaman;
    }

    public void setPasienKamarIdPeminjaman(PasienKamar pasienKamarIdPeminjaman) {
        this.pasienKamarIdPeminjaman = pasienKamarIdPeminjaman;
    }

    public Transaksijualobat getTransaksijualobatIdTransaksijual() {
        return transaksijualobatIdTransaksijual;
    }

    public void setTransaksijualobatIdTransaksijual(Transaksijualobat transaksijualobatIdTransaksijual) {
        this.transaksijualobatIdTransaksijual = transaksijualobatIdTransaksijual;
    }

    public Rekammedik getRekammedisIdRekammedis() {
        return rekammedisIdRekammedis;
    }

    public void setRekammedisIdRekammedis(Rekammedik rekammedisIdRekammedis) {
        this.rekammedisIdRekammedis = rekammedisIdRekammedis;
    }

    public Pasien getPasienIdPasien() {
        return pasienIdPasien;
    }

    public void setPasienIdPasien(Pasien pasienIdPasien) {
        this.pasienIdPasien = pasienIdPasien;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idKunjungan != null ? idKunjungan.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Kunjungan)) {
            return false;
        }
        Kunjungan other = (Kunjungan) object;
        if ((this.idKunjungan == null && other.idKunjungan != null) || (this.idKunjungan != null && !this.idKunjungan.equals(other.idKunjungan))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "carismainterface.entity.Kunjungan[ idKunjungan=" + idKunjungan + " ]";
    }
    
}
