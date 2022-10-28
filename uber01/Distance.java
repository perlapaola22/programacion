/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uber01;

public class Distance {
    int x;
    int y;
    int x1;
    int y1;
    int x2;
    int y2;
    double distance;
    double distanceCar;
    double distanceMoto;
   
        
    
    public Distance(int x,int y,int x1, int y1,int x2,int y2, double distance,double distanceCar,double distanceMoto){
        this.x = x;
        this.y = y;
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        this.distance = distance;
        this.distanceCar = distanceCar;
    }

    Distance(int i, int i0, int i1, int i2) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    public double getDistance(){
        x1 = 6; y1 = 4;
        x2 = 20; y2 = 10;
        
        x = x1- x2;
        y = y1 - y2;
        
        distance = Math.sqrt(x*x +y*y);
    System.out.println("Distance betwen locations is: " + distance);
        
        
        return distance;
    }
    public double getDistanceCar(){
         x1 = 6; y1 = 4;
        x2 = 20; y2 = 10;
        
        x = x1- x2;
        y = y1 - y2;
        
        distance = Math.sqrt(x*x +y*y);
        System.out.println("Distance betwen locations is: " + distance*1);
        
        
        return distanceCar;
    }
    public double getDistanceMoto(){
         x1 = 6; y1 = 4;
        x2 = 20; y2 = 10;
        
        x = x1- x2;
        y = y1 - y2;
        
        distance = Math.sqrt(x*x +y*y);
        System.out.println("Distance betwen locations is: " + distance*0.7);
        
        
        return distanceMoto;
    }
    
    
}

