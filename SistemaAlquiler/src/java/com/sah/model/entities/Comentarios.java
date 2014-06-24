/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sah.model.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jorge
 */
@Entity
@Table(name = "comentarios")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Comentarios.findAll", query = "SELECT c FROM Comentarios c"),
    @NamedQuery(name = "Comentarios.findByIdhistorial", query = "SELECT c FROM Comentarios c WHERE c.idhistorial = :idhistorial"),
    @NamedQuery(name = "Comentarios.findByCalificacion", query = "SELECT c FROM Comentarios c WHERE c.calificacion = :calificacion"),
    @NamedQuery(name = "Comentarios.findByComentarios", query = "SELECT c FROM Comentarios c WHERE c.comentarios = :comentarios"),
    @NamedQuery(name = "Comentarios.findByRecomendacion", query = "SELECT c FROM Comentarios c WHERE c.recomendacion = :recomendacion")})
public class Comentarios implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idhistorial")
    private Integer idhistorial;
    @Basic(optional = false)
    @Column(name = "calificacion")
    private String calificacion;
    @Basic(optional = false)
    @Column(name = "comentarios")
    private String comentarios;
    @Basic(optional = false)
    @Column(name = "recomendacion")
    private String recomendacion;
    @JoinColumn(name = "id_reserva", referencedColumnName = "idreserva")
    @ManyToOne
    private Reserva idReserva;

    public Comentarios() {
    }

    public Comentarios(Integer idhistorial) {
        this.idhistorial = idhistorial;
    }

    public Comentarios(Integer idhistorial, String calificacion, String comentarios, String recomendacion) {
        this.idhistorial = idhistorial;
        this.calificacion = calificacion;
        this.comentarios = comentarios;
        this.recomendacion = recomendacion;
    }

    public Integer getIdhistorial() {
        return idhistorial;
    }

    public void setIdhistorial(Integer idhistorial) {
        this.idhistorial = idhistorial;
    }

    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public String getRecomendacion() {
        return recomendacion;
    }

    public void setRecomendacion(String recomendacion) {
        this.recomendacion = recomendacion;
    }

    public Reserva getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(Reserva idReserva) {
        this.idReserva = idReserva;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idhistorial != null ? idhistorial.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Comentarios)) {
            return false;
        }
        Comentarios other = (Comentarios) object;
        if ((this.idhistorial == null && other.idhistorial != null) || (this.idhistorial != null && !this.idhistorial.equals(other.idhistorial))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sah.model.entities.Comentarios[ idhistorial=" + idhistorial + " ]";
    }
    
}
