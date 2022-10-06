/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package point;

/**
 *
 * @author PERLA
 */
    class Point {

    
    public static void main(String[] args) {
        Point p1 = new Point();
       /* int x=p1.getPosX();*/
        System.out.println("");
       /* p1.setPosX(30);*/
        System.out.println();
    }
    
}


    class Point1{
        private int posX;
        private int posY;
        
        public Point1(int posX, int posY){
            this.posX=posX; this.posY=posY;
        }
        public Point1(){
            this.posX=0; this.posY=0;
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
               
        
    }

