/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorador;

/**
 *
 * @author Manuel Francisco Flores Velazquez
 */
public class Chocolate extends Condiment {
    
    public Chocolate(Beverage bebida){
        this.bebida = bebida;
    }
    
    @Override
    public String getDescripcion(){
        return bebida.getDescripcion() + " + Chocolate";
    }
    
    @Override
    public double getCosto(){
        return bebida.getCosto() + 6;
    }  
}

