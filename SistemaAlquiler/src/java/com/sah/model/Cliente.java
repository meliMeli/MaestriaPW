package com.sah.model;
// Generated 03-jun-2014 21:09:45 by Hibernate Tools 3.2.1.GA



/**
 * Cliente generated by hbm2java
 */
public class Cliente  implements java.io.Serializable {


     private int idcliente;
     private String nombre;
     private String apellido;
     private String ocupacion;
     private String correo;
     private String telefono;

    public Cliente() {
    }

    public Cliente(int idcliente, String nombre, String apellido, String ocupacion, String correo, String telefono) {
       this.idcliente = idcliente;
       this.nombre = nombre;
       this.apellido = apellido;
       this.ocupacion = ocupacion;
       this.correo = correo;
       this.telefono = telefono;
    }
   
    public int getIdcliente() {
        return this.idcliente;
    }
    
    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
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




}


