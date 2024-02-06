/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package decorador;

/**
 *
 * @author Manuel Francisco Flores Velazquez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Precios de Café: ");
        Beverage cafe1 = new HouseBlend();
        Beverage cafe2 = new DarkRoast();
        Beverage cafe3 = new Expresso();
        Beverage cafe4 = new Decaf();
        System.out.println(cafe1.getDescripcion() + " - " + "$" + cafe1.getCosto());
        System.out.println(cafe2.getDescripcion() + " - " + "$" + cafe2.getCosto());
        System.out.println(cafe3.getDescripcion() + " - " + "$" + cafe3.getCosto());
        System.out.println(cafe4.getDescripcion() + " - " + "$" + cafe4.getCosto());

        System.out.println();
        System.out.println();
        System.out.println("Cafés con 1 condimento: ");
        Beverage cafe5 = new HouseBlend();
        cafe5 = new Chocolate(cafe5);
        System.out.println(cafe5.getDescripcion() + " - " + "$" + cafe5.getCosto());
        Beverage cafe6 = new Decaf();
        cafe6 = new Soy(cafe6);
        System.out.println(cafe6.getDescripcion() + " - " + "$" + cafe6.getCosto());
        Beverage cafe7 = new DarkRoast();
        cafe7 = new WhippedCream(cafe7);
        System.out.println(cafe7.getDescripcion() + " - " + "$" + cafe7.getCosto());

        System.out.println();
        System.out.println();
        System.out.println("Cafés con 2 condimentos: ");
        Beverage cafe8 = new HouseBlend();
        cafe8 = new Chocolate(cafe8);
        cafe8 = new Milk(cafe8);
        System.out.println(cafe8.getDescripcion() + " - " + "$" + cafe8.getCosto());
        Beverage cafe9 = new Decaf();
        cafe9 = new Soy(cafe9);
        cafe9 = new WhippedCream(cafe9);
        System.out.println(cafe9.getDescripcion() + " - " + "$" + cafe9.getCosto());

        System.out.println();
        System.out.println();
        System.out.println("Cafés con 4 condimentos: ");
        Beverage cafe10 = new Expresso();
        cafe10 = new Chocolate(cafe10);
        cafe10 = new Milk(cafe10);
        cafe10 = new Soy(cafe10);
        cafe10 = new WhippedCream(cafe10);
        System.out.println(cafe10.getDescripcion() + " - " + "$" + cafe10.getCosto());
    }
    
}
