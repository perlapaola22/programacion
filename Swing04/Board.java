/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swing03;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.WindowConstants;
import javax.swing.*;

public class Board extends JPanel implements ActionListener, KeyListener {
    
    Snake snake;
    Food food;
    
    public static void main(String args[]) {
        Board b = new Board();
    }
    
    public Board() {
        setPreferredSize(new Dimension(Config.SIZE_WINDOW_W,Config.SIZE_WINDOW_H));
        setBackground(Color.WHITE);

        JFrame window = new JFrame("SNAKE");
        
        window.addKeyListener(this);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setSize(Config.SIZE_WINDOW_W, Config.SIZE_WINDOW_H);
        window.add(this);
        window.pack();
        window.setResizable(false);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
        window.add(this);
        Timer t = new Timer(200,this);
        t.start();
        snake = new Snake();
        food = new Food(Config.SIZE_SEG, Color.RED, new Point(5, 6));
    }
       
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString("PERLA PAOLA", 20, 20);
        g.drawString("Score: ", 500, 20);
        g.setColor(snake.getColor());
        ArrayList<Point> body = new ArrayList<Point>();
        body = snake.getBody();
        int HEAD = 0;
        
        
        //Color de la cola
        for(int i = 1; i < body.size(); i++) {
            Point p = body.get(i);
            g.setColor(snake.getColorTail());
            g.fillOval(p.getX()*Config.SIZE_SEG, p.getY()*Config.SIZE_SEG, Config.SIZE_SEG, Config.SIZE_SEG);
        } 
        
        //Color del cuerpo
        for(int i = 1; i < body.size(); i++) {
            Point p = body.get(i-1);
            g.setColor(snake.getColor());
            g.fillOval(p.getX()*Config.SIZE_SEG, p.getY()*Config.SIZE_SEG, Config.SIZE_SEG, Config.SIZE_SEG);
        }
        
        Point p = body.get(HEAD);
        g.setColor(snake.getColorHead());
        g.fillOval(p.getX()*Config.SIZE_SEG, p.getY()*Config.SIZE_SEG, Config.SIZE_SEG, Config.SIZE_SEG);
        
        
        food.draw(g);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        ArrayList<Point> body = new ArrayList<Point>();
        body = snake.getBody();
        int HEAD = 0;
        int BODY = 1 + 1;
        int TAIL = 0 + 1;
        int points = 0;
        
        for(int i = body.size()-1; i > 0; i--) {
            int x = body.get(i-1).getX();
            body.get(i).setX(x);
            int y = body.get(i-1).getY();
            body.get(i).setY(y);
        }
        int x = body.get(HEAD).getX();
        int y = body.get(HEAD).getY();
        /*if( x > Config.SIZE_WINDOW_W/Config.SIZE_SEG-1){
            body.get(HEAD).setX(HEAD);
        }*/
        
        body = snake.getBody();
       
        
        switch(snake.getDir()){
            case UP:
                y--;
                break;
            case DOWN:
                y++;
                break;
            case LEFT:
                x--;    
                break;
            case RIGHT:
                x++;
                break;
        }
        
        body.get(HEAD).setY(y);
        body.get(HEAD).setX(x);
        
        
        if(body.get(HEAD).compare(food.getPoint()) == true) {
            body.add(new Point(food.getPoint().getX(),food.getPoint().getY()));
            points += 10;
            System.out.println("Score = ");
            System.out.println(points); 
            System.out.println("");            
            food.randomNewFood();
        }        
       
        repaint();
        
         //EFECTO TUNEL
        if(body.get(HEAD).getX() > Config.SIZE_WINDOW_W/Config.SIZE_SEG){
            body.get(HEAD).setX(HEAD);
        }
        if(body.get(HEAD).getY() > Config.SIZE_WINDOW_H/Config.SIZE_SEG){
            body.get(HEAD).setY(HEAD);
        }
        if(body.get(HEAD).getX() < 0){
            body.get(HEAD).setX(Config.SIZE_WINDOW_W/Config.SIZE_SEG);
        }
        if(body.get(HEAD).getY() < 0){
        body.get(HEAD).setY(Config.SIZE_WINDOW_H/Config.SIZE_SEG);
        }
        
        
        
        //JUEGO TERMINADO
        if(body.get(HEAD).compare(body.get(BODY)) == true) {
            System.out.println("JUEGO TERMINADO!!!");
            System.exit(0);
        }
        
        if(body.get(HEAD).compare(body.get(TAIL)) == true) {
            System.out.println("JUEGO TERMINADO!!!");
            System.exit(0);
        }
        //serpiente muere al tocarse a si misma
        if(body.get(HEAD) == body.get(BODY)){
            System.out.println("JUEGO TERMINADO!!!");
            System.exit(0);
        }
       
       
        
    }
    
    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void keyPressed(KeyEvent e) {
        int codeKey = e.getKeyCode();
        switch (codeKey){
            case KeyEvent.VK_ESCAPE:
            System.exit(0);
            break;
            case KeyEvent.VK_UP:
            snake.setDir(Snake.Direction.UP);
            break;
            case KeyEvent.VK_DOWN:
            snake.setDir(Snake.Direction.DOWN);
            break;
            case KeyEvent.VK_LEFT:
            snake.setDir(Snake.Direction.LEFT);
            break;
            case KeyEvent.VK_RIGHT:
            snake.setDir(Snake.Direction.RIGHT);
            break;
        }
        
        
    }
    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
        
    }
    
}