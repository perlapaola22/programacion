/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uber01;

/**
 *
 * @author PERLA
 */
public class Uber01 {

    
    public static void main(String args[]) {
        System.out.println("WELCOME TO UBER");
        User user1 = new User("Perla Paola Pantaleon Bedolla", "La Paz s/n, Zona Sin Asignación de Nombre de Colonia, 58040 Morelia, Mich.",1200,"Av Francisco I. Madero Pte, Nueva Valladolid, 58190 Morelia, Mich.");
        Driver driver1 = new Driver("Mariano Torres","Plan de Ayala 156, Centro histórico de Morelia, 58000 Morelia, Mich.","ZUZUKI 2008");
        
        //Distance distance1 = new Distance(6,4,20,10);
        System.out.println("\nUSER'S NAME: ");
        System.out.println(user1.getNme());
        System.out.println("\nUSER'S UBICATION: ");
        System.out.println(user1.getUbication());
        System.out.println("\nDESTINATION PLACE: ");
        System.out.println(user1.destinationPlace);
        System.out.println("\nDRIVER'S NAME: ");
        System.out.println(driver1.name);
        System.out.println("\nDRIVERS' UBICATION:  ");
        System.out.println(driver1.ubication);
        System.out.println("\nDRVER'S VEHICLE:  ");
        System.out.println(driver1.vehicle);
        System.out.println("\nDISTANCE BETWEN LOCATIONS: ");
        //System.out.println(distance1.distanceCar);
        
        
        
       
    }
    
}



    

