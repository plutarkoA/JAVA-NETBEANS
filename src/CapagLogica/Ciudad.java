/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CapagLogica;

import CapaVista.JPnlCiudad;
import Enums.Zona;

/**
 *
 * @author Jafeth
 */
public class Ciudad {
    String nombre;
    Zona zona;

    public Ciudad(String nombre, Zona zona) {
        this.nombre = nombre;
        this.zona = zona;
    }

    @Override
    public String toString() {
        return "Ciudad{" + "nombre=" + nombre + ", zona=" + zona + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Zona getZona() {
        return zona;
    }

    public void setZona(Zona zona) {
        this.zona = zona;
    }
    
    
    
    
}
