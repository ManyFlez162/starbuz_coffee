/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorador;

/**
 *
 * @author Manuel Francisco Flores Velazquez
 */
public class Expresso extends Beverage {
    
    public Expresso() {
        descripcion = "Expresso";
    }

    @Override
    public double getCosto() {
        return 36;
    }
    
}

