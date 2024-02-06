/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorador;

/**
 *
 * @author Manuel Francisco Flores Velazquez
 */
public abstract class Condiment extends Beverage {
    public Beverage bebida; 
    
    @Override
    public abstract String getDescripcion();
    
}

