package com.sah.model.entities;
// Generated 11-jun-2014 0:40:44 by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Arrendatario generated by hbm2java
 */
public class Arrendatario  implements java.io.Serializable {


     private int idArrendatario;
     private String dni;
     private String nombre;
     private String apellido;
     private String ocupacion;
     private String correo;
     private String telefono;
     private Set cuartos = new HashSet(0);

    public Arrendatario() {
    }

	
    public Arrendatario(int idArrendatario) {
        this.idArrendatario = idArrendatario;
    }
    public Arrendatario(int idArrendatario, String dni, String nombre, String apellido, String ocupacion, String correo, String telefono, Set cuartos) {
       this.idArrendatario = idArrendatario;
       this.dni = dni;
       this.nombre = nombre;
       this.apellido = apellido;
       this.ocupacion = ocupacion;
       this.correo = correo;
       this.telefono = telefono;
       this.cuartos = cuartos;
    }
   
    public int getIdArrendatario() {
        return this.idArrendatario;
    }
    
    public void setIdArrendatario(int idArrendatario) {
        this.idArrendatario = idArrendatario;
    }
    public String getDni() {
        return this.dni;
    }
    
    public void setDni(String dni) {
        this.dni = dni;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return this.apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getOcupacion() {
        return this.ocupacion;
    }
    
    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }
    public String getCorreo() {
        return this.correo;
    }
    
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public Set getCuartos() {
        return this.cuartos;
    }
    
    public void setCuartos(Set cuartos) {
        this.cuartos = cuartos;
    }




}


