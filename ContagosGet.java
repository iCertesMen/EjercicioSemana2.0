package com.example.sesmzt01.tareasemanados;

/**
 * Created by sesmzt01 on 13/08/2017.
 */

public class ContagosGet {

    private String nombre,fecha,telefono,email,descripcion;

public ContagosGet(String nombre, String fecha, String telefono, String email, String descripcion){

    this.nombre = nombre;
    this.fecha = fecha;
    this.telefono = telefono;
    this.email = email;
    this.descripcion = descripcion;
}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
