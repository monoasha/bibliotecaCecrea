/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tablas;

/**
 *
 * @author shofy
 */
public class Cargo {
   
    private String nombre;
    private Long Id;

     public Cargo(Long Id, String nombre) {
        this.nombre = nombre;
        this.Id = Id;}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }
    public String toString() {
        return this.nombre;
}}
