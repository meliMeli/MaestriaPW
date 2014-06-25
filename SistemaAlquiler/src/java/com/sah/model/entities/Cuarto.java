/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sah.model.entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author jorge
 */
@Entity
@Table(name = "cuarto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cuarto.findAll", query = "SELECT c FROM Cuarto c"),
    @NamedQuery(name = "Cuarto.findByIdcuarto", query = "SELECT c FROM Cuarto c WHERE c.idcuarto = :idcuarto"),
    @NamedQuery(name = "Cuarto.findByCaracteristicas", query = "SELECT c FROM Cuarto c WHERE c.caracteristicas = :caracteristicas"),
    @NamedQuery(name = "Cuarto.findByBanio", query = "SELECT c FROM Cuarto c WHERE c.banio = :banio"),
    @NamedQuery(name = "Cuarto.findByRestricciones", query = "SELECT c FROM Cuarto c WHERE c.restricciones = :restricciones"),
    @NamedQuery(name = "Cuarto.findByEstado", query = "SELECT c FROM Cuarto c WHERE c.estado = :estado"),
    @NamedQuery(name = "Cuarto.findByDetalleUbi", query = "SELECT c FROM Cuarto c WHERE c.detalleUbi = :detalleUbi"),
    @NamedQuery(name = "Cuarto.findByDireccion", query = "SELECT c FROM Cuarto c WHERE c.direccion = :direccion"),
    @NamedQuery(name = "Cuarto.findByTelefonoContacto", query = "SELECT c FROM Cuarto c WHERE c.telefonoContacto = :telefonoContacto")})
public class Cuarto implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcuarto")
    private Integer idcuarto;
    @Column(name = "caracteristicas")
    private String caracteristicas;
    @Column(name = "banio")
    private String banio;
    @Column(name = "restricciones")
    private String restricciones;
    @Column(name = "estado")
    private String estado;
    @Column(name = "detalle_ubi")
    private String detalleUbi;
    @Column(name = "direccion")
    private String direccion;
    @Column(name = "telefono_contacto")
    private String telefonoContacto;
    @JoinColumn(name = "id_ubicacion", referencedColumnName = "idubicacion")
    @ManyToOne
    private Ubicacion idUbicacion;
    @JoinColumn(name = "id_arrendatario", referencedColumnName = "id_arrendatario")
    @ManyToOne
    private Arrendatario idArrendatario;
    @OneToMany(mappedBy = "idcuarto")
    private Collection<Detalle> detalleCollection;
    @OneToMany(mappedBy = "idCuarto")
    private Collection<Reserva> reservaCollection;

    public Cuarto() {
    }

    public Cuarto(Integer idcuarto) {
        this.idcuarto = idcuarto;
    }

    public Integer getIdcuarto() {
        return idcuarto;
    }

    public void setIdcuarto(Integer idcuarto) {
        this.idcuarto = idcuarto;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public String getBanio() {
        return banio;
    }

    public void setBanio(String banio) {
        this.banio = banio;
    }

    public String getRestricciones() {
        return restricciones;
    }

    public void setRestricciones(String restricciones) {
        this.restricciones = restricciones;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDetalleUbi() {
        return detalleUbi;
    }

    public void setDetalleUbi(String detalleUbi) {
        this.detalleUbi = detalleUbi;
    }
   
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefonoContacto() {
        return telefonoContacto;
    }

    public void setTelefonoContacto(String telefonoContacto) {
        this.telefonoContacto = telefonoContacto;
    }

    public Ubicacion getIdUbicacion() {
        return idUbicacion;
    }

    public void setIdUbicacion(Ubicacion idUbicacion) {
        this.idUbicacion = idUbicacion;
    }

    public Arrendatario getIdArrendatario() {
        return idArrendatario;
    }

    public void setIdArrendatario(Arrendatario idArrendatario) {
        this.idArrendatario = idArrendatario;
    }

    @XmlTransient
    public Collection<Detalle> getDetalleCollection() {
        return detalleCollection;
    }

    public void setDetalleCollection(Collection<Detalle> detalleCollection) {
        this.detalleCollection = detalleCollection;
    }

    @XmlTransient
    public Collection<Reserva> getReservaCollection() {
        return reservaCollection;
    }

    public void setReservaCollection(Collection<Reserva> reservaCollection) {
        this.reservaCollection = reservaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcuarto != null ? idcuarto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cuarto)) {
            return false;
        }
        Cuarto other = (Cuarto) object;
        if ((this.idcuarto == null && other.idcuarto != null) || (this.idcuarto != null && !this.idcuarto.equals(other.idcuarto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sah.model.entities.Cuarto[ idcuarto=" + idcuarto + " ]";
    }

    public void setArrendatario(Arrendatario arrendatario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setDetalleUbicacion(String detalleUbicacion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
