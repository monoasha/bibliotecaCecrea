/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tablas;

/**
 *
 * @author Sofia
 */
public class Libro {
    private String nombre;
    private String autor;
    private Boolean disponibilidad;
    private String fechadeingreso;


    public Libro() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getautor() {
        return autor;
    }

    public void setautor(String autor) {
        this.autor = autor;
    }

    public Boolean getdisponibilidad() {
        return disponibilidad;
    }

    public void setdisponibilidad(Boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
public String getfechadeingreso() {
        return fechadeingreso;
    }

    public void setfechadeingreso(String disponibilidad) {
        this.fechadeingreso = disponibilidad;
    }

    
}
