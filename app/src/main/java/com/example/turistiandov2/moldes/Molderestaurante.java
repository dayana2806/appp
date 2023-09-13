package com.example.turistiandov2.moldes;

import java.io.Serializable;

public class Molderestaurante implements Serializable {

    private String nombre;
    private String telefono;
    private String rangoprecio;
    private String platorecomendado;
    private  Integer foto;
    private String puntaje;

    public Molderestaurante() {

    }

    public Molderestaurante(String nombre, String telefono, String rangoprecio, String platorecomendado, Integer foto, String puntaje) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.rangoprecio = rangoprecio;
        this.platorecomendado = platorecomendado;
        this.foto = foto;
        this.puntaje = puntaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getRangoprecio() {
        return rangoprecio;
    }

    public void setRangoprecio(String rangoprecio) {
        this.rangoprecio = rangoprecio;
    }

    public String getPlatorecomendado() {
        return platorecomendado;
    }

    public void setPlatorecomendado(String platorecomendado) {
        this.platorecomendado = platorecomendado;
    }

    public Integer getFoto() {
        return foto;
    }

    public void setFoto(Integer foto) {
        this.foto = foto;
    }

    public String getPuntaje() {
        return puntaje;
    }
    public void setPuntaje(String puntaje){this.puntaje = puntaje;}
}
