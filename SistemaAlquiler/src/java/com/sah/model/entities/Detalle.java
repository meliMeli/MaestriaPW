<<<<<<< HEAD
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
@Table(name = "detalle")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Detalle.findAll", query = "SELECT d FROM Detalle d"),
    @NamedQuery(name = "Detalle.findByIddetalle", query = "SELECT d FROM Detalle d WHERE d.iddetalle = :iddetalle"),
    @NamedQuery(name = "Detalle.findByObjetos", query = "SELECT d FROM Detalle d WHERE d.objetos = :objetos"),
    @NamedQuery(name = "Detalle.findByEstado", query = "SELECT d FROM Detalle d WHERE d.estado = :estado"),
    @NamedQuery(name = "Detalle.findByCantidad", query = "SELECT d FROM Detalle d WHERE d.cantidad = :cantidad")})
public class Detalle implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "iddetalle")
    private Integer iddetalle;
    @Basic(optional = false)
    @Column(name = "objetos")
    private String objetos;
    @Basic(optional = false)
    @Column(name = "estado")
    private String estado;
    @Basic(optional = false)
    @Column(name = "cantidad")
    private String cantidad;
    @JoinColumn(name = "idcuarto", referencedColumnName = "idcuarto")
    @ManyToOne
    private Cuarto idcuarto;

    public Detalle() {
    }

    public Detalle(Integer iddetalle) {
        this.iddetalle = iddetalle;
    }

    public Detalle(Integer iddetalle, String objetos, String estado, String cantidad) {
=======
package com.sah.model.entities;
// Generated 11-jun-2014 0:40:44 by Hibernate Tools 3.2.1.GA



/**
 * Detalle generated by hbm2java
 */
public class Detalle  implements java.io.Serializable {


     private int iddetalle;
     private Cuarto cuarto;
     private String objetos;
     private String estado;
     private String cantidad;

    public Detalle() {
    }

	
    public Detalle(int iddetalle, String objetos, String estado, String cantidad) {
>>>>>>> origin/master
        this.iddetalle = iddetalle;
        this.objetos = objetos;
        this.estado = estado;
        this.cantidad = cantidad;
    }
<<<<<<< HEAD

    public Integer getIddetalle() {
        return iddetalle;
    }

    public void setIddetalle(Integer iddetalle) {
        this.iddetalle = iddetalle;
    }

    public String getObjetos() {
        return objetos;
    }

    public void setObjetos(String objetos) {
        this.objetos = objetos;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCantidad() {
        return cantidad;
    }

=======
    public Detalle(int iddetalle, Cuarto cuarto, String objetos, String estado, String cantidad) {
       this.iddetalle = iddetalle;
       this.cuarto = cuarto;
       this.objetos = objetos;
       this.estado = estado;
       this.cantidad = cantidad;
    }
   
    public int getIddetalle() {
        return this.iddetalle;
    }
    
    public void setIddetalle(int iddetalle) {
        this.iddetalle = iddetalle;
    }
    public Cuarto getCuarto() {
        return this.cuarto;
    }
    
    public void setCuarto(Cuarto cuarto) {
        this.cuarto = cuarto;
    }
    public String getObjetos() {
        return this.objetos;
    }
    
    public void setObjetos(String objetos) {
        this.objetos = objetos;
    }
    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getCantidad() {
        return this.cantidad;
    }
    
>>>>>>> origin/master
    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

<<<<<<< HEAD
    public Cuarto getIdcuarto() {
        return idcuarto;
    }

    public void setIdcuarto(Cuarto idcuarto) {
        this.idcuarto = idcuarto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iddetalle != null ? iddetalle.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Detalle)) {
            return false;
        }
        Detalle other = (Detalle) object;
        if ((this.iddetalle == null && other.iddetalle != null) || (this.iddetalle != null && !this.iddetalle.equals(other.iddetalle))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sah.model.entities.Detalle[ iddetalle=" + iddetalle + " ]";
    }
    
}
=======



}


>>>>>>> origin/master
