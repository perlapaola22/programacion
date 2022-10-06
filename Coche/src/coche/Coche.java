/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coche;


public class Coche {
    String color;
    String marca;
    int km;
    
    public static void main(String[] args) {
        Coche coche1 = new Coche();
        Coche coche2 = new Coche();
        
        coche1.color = "BLANCO";
        coche1.marca = "AUDI";
        coche1.km = 0;
       
        System.out.println("El color del coche1 es: "+coche1.color);
        System.out.println("La marca del coche1 es: "+coche1.marca);
        System.out.println("El kilometraje del coche1 es: "+coche1.km);
        
        
        coche2.color = "Rosa";
        coche2.marca = "Jeep";
        coche2.km = 100;
        System.out.println("El color del coche2 es: "+coche2.color);
        System.out.println("La marca del coche2 es: "+coche2.marca);
        System.out.println("El kilometraje del coche2 es: "+coche2.km);
    }
    
}
