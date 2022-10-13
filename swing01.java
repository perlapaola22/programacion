import javax.swing.JFrame;
import javax.swing.WindowConstants;


public class Swing02 {

    public static void main(String args[]) {
        JFrame window = new JFrame("SWING");
        MyCanvas canvas = new MyCanvas();
        
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setSize(400,300);
        window.add(canvas);
        window.pack();
        window.setResizable(false);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
        
    }
    
}
