/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Enums;

/**
 *
 * @author Jafeth
 */
public enum Zona {
    AREA_METROPOLITANA("AREA_METROPOLITANA"),
    ZONA_NORTE("ZONA_NORTE"),
    PACIFICO_NORTE("PACIFICO_NORTE"),
    PACIFICO_SUR("PACIFICO_SUR"),
    ZONA_ATLANTICO("ZONA_ATLANTICO"),
    PACIFICO_CENTRAL("PACIFICO_CENTRAL"),;
    
    private String zona;

    private Zona(String zona) {
        this.zona = zona;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }
    
}
