package com.example.turistiandov2.moldes;

import java.io.Serializable;

public class Moldeturismo implements Serializable {

    private String nombre;
    private String nombreContacto;
    private String telefono;
    private String precio;
    private Integer foto;
    private String puntaje;
    private String lorem;

    public Moldeturismo() {

    }//construtor vasio

    public Moldeturismo(String nombre, String nombreContacto, String telefono, String precio, Integer foto, String puntaje, String lorem) {
        this.nombre = nombre;
        this.nombreContacto = nombreContacto;
        this.telefono = telefono;
        this.precio = precio;
        this.foto = foto;
        this.puntaje = puntaje;
        this.lorem = lorem;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreContacto() {
        return nombreContacto;
    }

    public void setNombreContacto(String nombreContacto) {
        this.nombreContacto = nombreContacto;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public Integer getFoto() {
        return foto;
    }

    public void setFoto(Integer foto) {
        this.foto = foto;
    }

    public String getPuntaje() {return puntaje;}

    public void  setPuntaje(String puntaje) {this.puntaje = puntaje;}

    public String getLorem() {return lorem;}

    public void setLorem() {this.lorem = puntaje;}
}
