/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Enums;

/**
 *
 * @author Jafeth
 */
public enum TipoContenido {
    PERECEDEROS("PERECEDEROS"),
    NO_PERECEDEROS("NO_PERECEDEROS"),;
    
    private String tipoContenido;

    private TipoContenido(String tipoContenido) {
        this.tipoContenido = tipoContenido;
    }

    public String getTipoContenido() {
        return tipoContenido;
    }

    public void setTipoContenido(String tipoContenido) {
        this.tipoContenido = tipoContenido;
    }
    
    
}
