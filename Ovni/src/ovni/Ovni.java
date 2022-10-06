/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ovni;


public class Ovni {

    public static void main(String[] args) {
      Ovni ovni1 = new Ovni();
      System.out.println("Ovni");
    }
    
}


class Ovni1{
        char colorRed;
        char colorGreen;
        char colorBlue;
        int posX, posY;
      
        
        public Ovni1(char r, char g, char b, int x, int y){
            this.colorRed=r; this.colorGreen=g; this.colorBlue=b; this.posX=x; this.posY=y;
            
            
        }
    }

  /*  class Point{
        private int posX;
        private int posY;
        
        public Point(int posX, int posY){
            this.posX=posX; this.posY=posY;
        }
        public int getPosX(){
            return posX;
        }
        public int getPosY(){
            return posY;
        }
        public void setPosX(int posX){
            this.posX=posX;
        }
        public void setPosY(int posY){
            this.posY=posY;
        }
    }*/