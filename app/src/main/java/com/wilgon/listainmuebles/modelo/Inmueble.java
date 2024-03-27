package com.wilgon.listainmuebles.modelo;

public class Inmueble {
    private int foto;
    private String direccion;
    private double precio;

    public Inmueble(int foto, String direccion, double precio) {
        this.foto = foto;
        this.direccion = direccion;
        this.precio = precio;
    }

    public int getFoto() {
        return foto;
    }
    public void setFoto(int foto) {
        this.foto = foto;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double preciop) {
        this.precio = precio;
    }
}
