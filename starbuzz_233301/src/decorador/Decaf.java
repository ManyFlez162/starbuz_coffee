/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorador;

/**
 *
 * @author Manuel Francisco Flores Velazquez
 */
public class Decaf extends Beverage {
    
    public Decaf() {
        descripcion = "Decaf";
    }

    @Override
    public double getCosto() {
        return 30;
    }
    
}

