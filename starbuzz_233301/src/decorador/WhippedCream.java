/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorador;

/**
 *
 * @author Manuel Francisco Flores Velazquez
 */
public class WhippedCream extends Condiment {
    
    public WhippedCream(Beverage bebida){
        this.bebida = bebida;
    }
    
    @Override
    public String getDescripcion(){
        return bebida.getDescripcion() + " + Whipped Cream";
    }
    
    @Override
    public double getCosto(){
        return bebida.getCosto() + 10;
    }
    
}

