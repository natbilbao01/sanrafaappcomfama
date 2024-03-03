package com.example.sanrafa.moldes;

import java.io.Serializable;

public class Sitios implements Serializable {
    private String nombre;
    private String descripcion;

    private String telefono;

    private String direccion;

    private String horario;

    private String tarifa;

    private String recomendaciones;
    private Integer calificacion;
    private Integer fotoGrafia;

    public Sitios() {
    }

    public Sitios(String nombre, String descripcion, String telefono, String direccion, String horario, String tarifa, String recomendaciones, Integer calificacion, Integer fotoGrafia) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.telefono = telefono;
        this.direccion = direccion;
        this.horario = horario;
        this.tarifa = tarifa;
        this.recomendaciones = recomendaciones;
        this.calificacion = calificacion;
        this.fotoGrafia = fotoGrafia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getTarifa() {
        return tarifa;
    }

    public void setTarifa(String tarifa) {
        this.tarifa = tarifa;
    }

    public String getRecomendaciones() {
        return recomendaciones;
    }

    public void setRecomendaciones(String recomendaciones) {
        this.recomendaciones = recomendaciones;
    }

    public Integer getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Integer calificacion) {
        this.calificacion = calificacion;
    }

    public Integer getFotoGrafia() {
        return fotoGrafia;
    }

    public void setFotoGrafia(Integer fotoGrafia) {
        this.fotoGrafia = fotoGrafia;
    }
}
