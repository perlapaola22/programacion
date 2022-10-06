/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herensia;


public class Herensia {

   
    public static void main(String[] args) {
        int ColorMcQueen;
        System.out.println("INICIO");
        System.out.println(carot.getSalud().getVidas());
        Terrestre rayoMcQueen = new Terrestre(4);
        rayoMcQueen.color.setColor(255,0,0);
        colorMcQueen = rayoMcQueen.color.getRed();
        
        
    }
    
}

    //constructor padre
    class Vehiculo{
        private float velocidadMaxima;
        private Salud salud;
        private Posicion posicion;
        private Color color;
        private int numOcupantes;
        
        public Vehiculo(){
            velocidadMaxima = 100;
            salud = new Salud();
            posicion =new Posicion();
            color = new Color();
            numOcupantes = 1;
        }
        
    }
    
    class Salud{
        private int vidas;
        private int porcentajeSalud;
        
        public int getVidas(){
            return vidas;
        }
    }

    class Posicion{
        private int posX;
        private int posY;
        
        public Posicion(){
            posX=240;
            posY=320;
        }
    }

    class Color{
        private int red;
        private int green;
        private int blue;
        
        public Color(){
            red = 255;
            green = 255;
            blue = 255;
        }
        public Color(int red, int green, int blue){
            this.red = red; this.green = green; this.blue = blue;
        }
        
        public int getRed(){
            return red;
        }
        public int getGreen(){
            return green;
        }
        public int getBlue(){
            return blue;
        }
    
    }

    class Submarino extends Vehiculo{
        super.Vehiculo();
        private float profundidadMaxima;
        private int tamano;
        
        public Submarino(){
            profundidadMaxima = (float) 107.87;
            tamano = 30;           
        }       
    }
    
    class Terrestre extends Vehiculo{
        super.Vehiculo();
        private int numRuedas;
        public Terrestre(int numRuedas){
            this.numRuedas = numRuedas;
        }
    }
    
    class Avion extends Vehiculo{
        super.Vehiculo();
        private int numAlas;
        public Avion(){
            numAlas = 2;
        }
        public Avion(int numAlas){
            this.numAlas = numAlas;
        }
    }