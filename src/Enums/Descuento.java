/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Enums;

/**
 *
 * @author Jafeth
 */
public enum Descuento {
    CLIENTE_FRECUENTE("CLIENTE_FRECUENTE"),
    CIUDADANO_ORO("CIUDADANO_ORO"),;
    
    private String descuento;

    private Descuento(String descuento) {
        this.descuento = descuento;
    }

    public String getDescuento() {
        return descuento;
    }

    public void setDescuento(String descuento) {
        this.descuento = descuento;
    }
    
    
}
