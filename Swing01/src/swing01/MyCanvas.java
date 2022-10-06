/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swing01;


import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.event.*;

public class MyCanvas extends JPanel implements keyListener, ActionListener{
    Point pSun = new Point(Config.WINDOW_W/2, Config.WINDOW_H/2);
    public MyCanvas(){
            setPreferredSize(new Dimension(Config.WINDOW_W, Config.WINDOW_H));
            setBackground(Config.COLOR_BG);
            
        }
    @Override
        protected void paintComponent(Graphics g){
            super.paintComponent(g); 
            Paintbrush paintBrush = new Paintbrush(g);
            paintBrush.drawSky();
            //paintBrush.drawSun(pSun);
            paintBrush.drawMountains(15,120,100,40,180,120);
            paintBrush.drawMountains(180, 120, 250, 40, 350, 120);
            paintBrush.drawMountains(100,120,175,40,250,100);
            paintBrush.drawMountains(200,175,350,50,400,175);
            paintBrush.drawTree(200, 50);
            paintBrush.drawTree(129, 50);
            paintBrush.drawTree(60, 50);
            paintBrush.drawTree(280, 50);
            paintBrush.drawTree(350, 50);
            
            //car
            paintBrush.drawCar(200, 200);
            
          
        }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
  
    
}

