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
@Table(name = "reserva")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reserva.findAll", query = "SELECT r FROM Reserva r"),
    @NamedQuery(name = "Reserva.findByIdreserva", query = "SELECT r FROM Reserva r WHERE r.idreserva = :idreserva"),
    @NamedQuery(name = "Reserva.findByFecha", query = "SELECT r FROM Reserva r WHERE r.fecha = :fecha"),
    @NamedQuery(name = "Reserva.findByTiempo", query = "SELECT r FROM Reserva r WHERE r.tiempo = :tiempo"),
    @NamedQuery(name = "Reserva.findByMonto", query = "SELECT r FROM Reserva r WHERE r.monto = :monto"),
    @NamedQuery(name = "Reserva.findByIdArrendatario", query = "SELECT r FROM Reserva r WHERE r.idArrendatario = :idArrendatario")})
public class Reserva implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idreserva")
    private Integer idreserva;
    @Basic(optional = false)
    @Column(name = "fecha")
    private String fecha;
    @Basic(optional = false)
    @Column(name = "tiempo")
    private String tiempo;
    @Basic(optional = false)
    @Column(name = "monto")
    private String monto;
    @Column(name = "id_arrendatario")
    private Integer idArrendatario;
    @OneToMany(mappedBy = "idReserva")
    private Collection<Comentarios> comentariosCollection;
    @JoinColumn(name = "id_cuarto", referencedColumnName = "idcuarto")
    @ManyToOne
    private Cuarto idCuarto;
    @JoinColumn(name = "id_cliente", referencedColumnName = "idcliente")
    @ManyToOne
    private Cliente idCliente;

    public Reserva() {
    }

    public Reserva(Integer idreserva) {
        this.idreserva = idreserva;
    }

    public Reserva(Integer idreserva, String fecha, String tiempo, String monto) {
        this.idreserva = idreserva;
        this.fecha = fecha;
        this.tiempo = tiempo;
        this.monto = monto;
    }

    public Integer getIdreserva() {
        return idreserva;
    }

    public void setIdreserva(Integer idreserva) {
        this.idreserva = idreserva;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    public String getMonto() {
        return monto;
    }

    public void setMonto(String monto) {
        this.monto = monto;
    }

    public Integer getIdArrendatario() {
        return idArrendatario;
    }

    public void setIdArrendatario(Integer idArrendatario) {
        this.idArrendatario = idArrendatario;
    }

    @XmlTransient
    public Collection<Comentarios> getComentariosCollection() {
        return comentariosCollection;
    }

    public void setComentariosCollection(Collection<Comentarios> comentariosCollection) {
        this.comentariosCollection = comentariosCollection;
    }

    public Cuarto getIdCuarto() {
        return idCuarto;
    }

    public void setIdCuarto(Cuarto idCuarto) {
        this.idCuarto = idCuarto;
    }

    public Cliente getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Cliente idCliente) {
        this.idCliente = idCliente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idreserva != null ? idreserva.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Reserva)) {
            return false;
        }
        Reserva other = (Reserva) object;
        if ((this.idreserva == null && other.idreserva != null) || (this.idreserva != null && !this.idreserva.equals(other.idreserva))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sah.model.entities.Reserva[ idreserva=" + idreserva + " ]";
    }
    
}
