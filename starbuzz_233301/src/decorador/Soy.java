/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorador;

/**
 *
 * @author Manuel Francisco Flores Velazquez
 */
public class Soy extends Condiment {
    
    public Soy(Beverage bebida){
        this.bebida = bebida;
    }
    
    @Override
    public String getDescripcion(){
        return bebida.getDescripcion() + " + Soy";
    }
    
    @Override
    public double getCosto(){
        return bebida.getCosto() + 8;
    }
    
}

