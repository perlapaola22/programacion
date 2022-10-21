/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swing03;


public class Point {
    private int x, y;
    
    public Point(int x, int y){
        this.x = x;
        this.y = y;    
    }
    public void setX(int x){
        this.x=x;
    }
    public void setY(int y){
        this.y = y;
    }
    /*public void setPoint(Point p){
        this=p;
    }*/
    
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
}
