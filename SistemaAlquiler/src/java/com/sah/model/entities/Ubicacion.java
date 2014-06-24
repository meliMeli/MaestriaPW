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
@Table(name = "ubicacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ubicacion.findAll", query = "SELECT u FROM Ubicacion u"),
    @NamedQuery(name = "Ubicacion.findByIdubicacion", query = "SELECT u FROM Ubicacion u WHERE u.idubicacion = :idubicacion"),
    @NamedQuery(name = "Ubicacion.findByDepartamento", query = "SELECT u FROM Ubicacion u WHERE u.departamento = :departamento"),
    @NamedQuery(name = "Ubicacion.findByProvincia", query = "SELECT u FROM Ubicacion u WHERE u.provincia = :provincia"),
    @NamedQuery(name = "Ubicacion.findByDistrito", query = "SELECT u FROM Ubicacion u WHERE u.distrito = :distrito")})
public class Ubicacion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idubicacion")
    private Integer idubicacion;
    @Basic(optional = false)
    @Column(name = "departamento")
    private String departamento;
    @Basic(optional = false)
    @Column(name = "provincia")
    private String provincia;
    @Basic(optional = false)
    @Column(name = "distrito")
    private String distrito;
    @OneToMany(mappedBy = "idUbicacion")
    private Collection<Cuarto> cuartoCollection;

    public Ubicacion() {
    }

    public Ubicacion(Integer idubicacion) {
        this.idubicacion = idubicacion;
    }

    public Ubicacion(Integer idubicacion, String departamento, String provincia, String distrito) {
        this.idubicacion = idubicacion;
        this.departamento = departamento;
        this.provincia = provincia;
        this.distrito = distrito;
    }

    public Integer getIdubicacion() {
        return idubicacion;
    }

    public void setIdubicacion(Integer idubicacion) {
        this.idubicacion = idubicacion;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    @XmlTransient
    public Collection<Cuarto> getCuartoCollection() {
        return cuartoCollection;
    }

    public void setCuartoCollection(Collection<Cuarto> cuartoCollection) {
        this.cuartoCollection = cuartoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idubicacion != null ? idubicacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ubicacion)) {
            return false;
        }
        Ubicacion other = (Ubicacion) object;
        if ((this.idubicacion == null && other.idubicacion != null) || (this.idubicacion != null && !this.idubicacion.equals(other.idubicacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sah.model.entities.Ubicacion[ idubicacion=" + idubicacion + " ]";
    }
    
}
