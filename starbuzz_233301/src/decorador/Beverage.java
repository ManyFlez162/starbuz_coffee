/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorador;

/**
 *
 * @author Manuel Francisco Flores Velazquez
 */
public abstract class Beverage {
    String descripcion;
    double costo;
    
    public String getDescripcion(){
        return descripcion;
    }
    
    public abstract double getCosto();
    
}

