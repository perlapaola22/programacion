import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.*;


    

public class Swing01 {

    
    public static void main(String args[]) {
      JFrame window = new JFrame("Swing");
      MyCanvas canvas = new MyCanvas();
      
      window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
      window.setSize(420,400);
      window.add(canvas);
      window.pack();
      window.setResizable(true);
      window.setLocationRelativeTo(null);
      window.setVisible(true);
      
     
      
        
    }
    
}
