/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swing03;

import java.awt.Color;
import java.util.ArrayList;


public class Snake {
    private ArrayList<Point>body= new ArrayList<Point>();
    private Color color;
    private int speed;
    
    public Snake(){
        body.add(new Point(6,1));
        body.add(new Point(5,1));
        body.add(new Point(4,1));
        color= Color.BLUE;
        speed=1;
    }
    public ArrayList<Point>getBody(){
        return body;
    }
    public int getSpeed(){
        return speed;
    }
    public Color getColor(){
        return color;
    }
}
