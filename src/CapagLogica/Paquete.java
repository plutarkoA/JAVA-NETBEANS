/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CapagLogica;

import Enums.Descuento;
import Enums.TipoContenido;
import java.util.ArrayList;

/**
 *
 * @author Jafeth
 */
public class Paquete {
    ArrayList<Descuento> arrayDescuentos;
    int contPaquetes;
    int codPaquete;
    double peso;
    Ciudad ciudadOrigen;
    Ciudad ciudadDestino;
    TipoContenido tipoContenido;
    int COSTO_TRASLADO1;
    int COSTO_TRASLADO2;

    public Paquete(double peso) {
        this.peso = peso;
    }
    
    public void agregarDescuento(Descuento miDescuento){
        
    }    
    public double costoTraslado(){
        
    }   
    public double costoTipoContenido(){
        
    }    
    public double subTotal(){
        
    }
    public double totalDescuento(){
        
    }
    public double costoTotal(){
        
    }

    @Override
    public String toString() {
        return "Paquete{" + "arrayDescuentos=" + arrayDescuentos + ", contPaquetes=" 
                + contPaquetes + ", codPaquete=" + codPaquete + ", peso=" + peso 
                + ", ciudadOrigen=" + ciudadOrigen + ", ciudadDestino=" + ciudadDestino 
                + ", tipoContenido=" + tipoContenido + ", COSTO_TRASLADO1=" + COSTO_TRASLADO1 
                + ", COSTO_TRASLADO2=" + COSTO_TRASLADO2 + '}';
    }
    
}
