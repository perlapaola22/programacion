/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swing03;

import java.awt.Color;
import java.util.ArrayList;

class Snake {
    private Color color;
    private Color colorHead;
    private Color colorTail;
    private int speed;
    int lives = 3;
    int points = 0;
    private ArrayList<Point> body = new ArrayList<Point>();
    enum Direction {UP, DOWN, LEFT, RIGHT}
    private Direction dir;
    
    public Snake() {
        color = Color.ORANGE;
        colorHead = Color.BLUE;
        colorTail = Color.BLUE;
        speed = 1;
        body.add(new Point(5,2));
        body.add(new Point(4,2));
        body.add(new Point(3,2));
        dir = Direction.DOWN;
    }
    
    public ArrayList<Point> getBody() {
        return body;
    }
    
    public Color getColor() {
        return color;
    }
    
    //public void setColor(Color color) {
        //this.color = color;
    //}
    
    public int getSpeed() {
        return speed;
    }
    
    public void setDir(Direction dir) {
        this.dir = dir;
    }
    
    public Direction getDir() {
        return dir;
    }
    
    public Color getColorHead() {
        return colorHead;
    }
    
    public Color getColorTail() {
        return colorTail;
    }
    
}