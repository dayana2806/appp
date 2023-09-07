package com.example.turistiandov2.moldes;

import java.io.Serializable;

public class Moldehotel implements Serializable {

    private String nombre;
    private String precio;
    private String telefono;
    private Integer foto;
    private String descrpcion;


    public Moldehotel() { //constructor vacio

    }

    public Moldehotel(String nombre, String precio, String telefono, Integer foto, String descrpcion) {
        this.nombre = nombre;
        this.precio = precio;
        this.telefono = telefono;
        this.foto = foto;
        this.descrpcion = descrpcion;

    }

    public String getDescrpcion() {
        return descrpcion;
    }

    public void setDescrpcion(String descrpcion) {
        this.descrpcion = descrpcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Integer getFoto() {
        return foto;
    }

    public void setFoto(Integer foto) {
        this.foto = foto;
    }
}
