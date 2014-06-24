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
@Table(name = "arrendatario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Arrendatario.findAll", query = "SELECT a FROM Arrendatario a"),
    @NamedQuery(name = "Arrendatario.findByIdArrendatario", query = "SELECT a FROM Arrendatario a WHERE a.idArrendatario = :idArrendatario"),
    @NamedQuery(name = "Arrendatario.findByDni", query = "SELECT a FROM Arrendatario a WHERE a.dni = :dni"),
    @NamedQuery(name = "Arrendatario.findByNombre", query = "SELECT a FROM Arrendatario a WHERE a.nombre = :nombre"),
    @NamedQuery(name = "Arrendatario.findByApellido", query = "SELECT a FROM Arrendatario a WHERE a.apellido = :apellido"),
    @NamedQuery(name = "Arrendatario.findByOcupacion", query = "SELECT a FROM Arrendatario a WHERE a.ocupacion = :ocupacion"),
    @NamedQuery(name = "Arrendatario.findByCorreo", query = "SELECT a FROM Arrendatario a WHERE a.correo = :correo"),
    @NamedQuery(name = "Arrendatario.findByTelefono", query = "SELECT a FROM Arrendatario a WHERE a.telefono = :telefono")})
public class Arrendatario implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_arrendatario")
    private Integer idArrendatario;
    @Column(name = "dni")
    private String dni;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "ocupacion")
    private String ocupacion;
    @Column(name = "correo")
    private String correo;
    @Column(name = "telefono")
    private String telefono;
    @OneToMany(mappedBy = "idArrendatario")
    private Collection<Cuarto> cuartoCollection;

    public Arrendatario() {
    }

    public Arrendatario(Integer idArrendatario) {
        this.idArrendatario = idArrendatario;
    }

    public Integer getIdArrendatario() {
        return idArrendatario;
    }

    public void setIdArrendatario(Integer idArrendatario) {
        this.idArrendatario = idArrendatario;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
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
        hash += (idArrendatario != null ? idArrendatario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Arrendatario)) {
            return false;
        }
        Arrendatario other = (Arrendatario) object;
        if ((this.idArrendatario == null && other.idArrendatario != null) || (this.idArrendatario != null && !this.idArrendatario.equals(other.idArrendatario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sah.model.entities.Arrendatario[ idArrendatario=" + idArrendatario + " ]";
    }
    
}
