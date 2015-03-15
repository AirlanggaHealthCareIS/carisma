/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carismainterface.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author K-MiL Caster
 */
@Entity
@Table(name = "jadwalpegawai")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Jadwalpegawai.findAll", query = "SELECT j FROM Jadwalpegawai j"),
    @NamedQuery(name = "Jadwalpegawai.findByPegawaiIdPegawai", query = "SELECT j FROM Jadwalpegawai j WHERE j.pegawaiIdPegawai = :pegawaiIdPegawai"),
    @NamedQuery(name = "Jadwalpegawai.findByHariJadwalpegawai", query = "SELECT j FROM Jadwalpegawai j WHERE j.hariJadwalpegawai = :hariJadwalpegawai"),
    @NamedQuery(name = "Jadwalpegawai.findByShiftJadwalpegawai", query = "SELECT j FROM Jadwalpegawai j WHERE j.shiftJadwalpegawai = :shiftJadwalpegawai"),
    @NamedQuery(name = "Jadwalpegawai.findByKeterangan", query = "SELECT j FROM Jadwalpegawai j WHERE j.keterangan = :keterangan")})
public class Jadwalpegawai implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "pegawai_id_pegawai")
    private String pegawaiIdPegawai;
    @Basic(optional = false)
    @Column(name = "hari_jadwalpegawai")
    private String hariJadwalpegawai;
    @Basic(optional = false)
    @Column(name = "shift_jadwalpegawai")
    private String shiftJadwalpegawai;
    @Column(name = "keterangan")
    private String keterangan;
    @JoinColumn(name = "pegawai_id_pegawai", referencedColumnName = "id_pegawai", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private String pegawai;

    public Jadwalpegawai() {
    }

    public Jadwalpegawai(String pegawaiIdPegawai) {
        this.pegawaiIdPegawai = pegawaiIdPegawai;
    }

    public Jadwalpegawai(String pegawaiIdPegawai, String hariJadwalpegawai, String shiftJadwalpegawai) {
        this.pegawaiIdPegawai = pegawaiIdPegawai;
        this.hariJadwalpegawai = hariJadwalpegawai;
        this.shiftJadwalpegawai = shiftJadwalpegawai;
    }

    public String getPegawaiIdPegawai() {
        return pegawaiIdPegawai;
    }

    public void setPegawaiIdPegawai(String pegawaiIdPegawai) {
        this.pegawaiIdPegawai = pegawaiIdPegawai;
    }

    public String getHariJadwalpegawai() {
        return hariJadwalpegawai;
    }

    public void setHariJadwalpegawai(String hariJadwalpegawai) {
        this.hariJadwalpegawai = hariJadwalpegawai;
    }

    public String getShiftJadwalpegawai() {
        return shiftJadwalpegawai;
    }

    public void setShiftJadwalpegawai(String shiftJadwalpegawai) {
        this.shiftJadwalpegawai = shiftJadwalpegawai;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public String getPegawai() {
        return pegawai;
    }

    public void setPegawai(String pegawai) {
        this.pegawai = pegawai;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pegawaiIdPegawai != null ? pegawaiIdPegawai.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Jadwalpegawai)) {
            return false;
        }
        Jadwalpegawai other = (Jadwalpegawai) object;
        if ((this.pegawaiIdPegawai == null && other.pegawaiIdPegawai != null) || (this.pegawaiIdPegawai != null && !this.pegawaiIdPegawai.equals(other.pegawaiIdPegawai))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "carismainterface.entity.Jadwalpegawai[ pegawaiIdPegawai=" + pegawaiIdPegawai + " ]";
    }
    
}
