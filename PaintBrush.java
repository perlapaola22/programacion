import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

public class Paintbrush{
        private Graphics g;
        
       
        
        
        public Paintbrush(Graphics g){
            this.g = g;
        }
        public void drawSky(){
            g.setColor(new Color (0,191,230));
            g.fillRect(0, 0, 400, 100);
            g.setColor(Color.YELLOW);
            g.fillOval(40, 40, 20, 20);
            }
        
        public void drawSun(Point p){
            g.setColor(Config.COLOR_SUN);
            g.fillOval(p.getX(), p.getY(), Config.SUN_SIZE, Config.SUN_SIZE);
         
        }
        
        public void drawMountains(int x1, int y1, int x2, int y2, int x3, int y3){
           Polygon triangle = new Polygon();
           triangle.addPoint(x1, y1);
           triangle.addPoint(x2, y2);
           triangle.addPoint(x3, y3);
           g.setColor(Config.COLOR_BROWN);
           g.fillPolygon(triangle);
        }
        public void drawTree(int start, int top){          
            //draw trunk
            g.setColor(Config.COLOR_TRUNK_TREE);
            g.fillRect(start-10,top+110,26,30);
            
            g.setColor(Config.COLOR_TREE);
            
                for(int i=0; i<5; i++){
                    Polygon triangle = new Polygon();
                    int height = 50;
                    int width = 70;
                    int spacing = 15;
                    
                    triangle.addPoint(start, top +(spacing *i));
                    triangle.addPoint(start-(width/2), top+height+(spacing*i));
                    triangle.addPoint(start+(width/2), top+height+(spacing*i));
  
                   g.fillPolygon(triangle);
                   
                }
        }
        
        public void drawCar( int x, int y){
            //car
            Polygon rect = new Polygon();
            g.setColor(Config.COLOR_CARRED);
            g.fillRect(150,230,68,25);
            g.setColor(Config.COLOR_CARRED );
            g.fillRect(178, 215, 40, 22);
            //window
            g.setColor(Config.COLOR_BLUE);
            g.fillRect(180, 217, 35, 20);
            //wheel
            g.setColor(Config.COLOR_WHEEL);
            g.fillOval(200, 250, 20, 20);
            g.fillOval(150,250,20,20);
            //highway
            g.setColor(Config.COLOR_HIGHWAY);
            g.fillRect(1, 270, 400, 30);
            //lake
            g.setColor(Config.COLOR_BLUE);
            g.fillRoundRect(260, 200, 120, 15, 60, 100);
       
            }
             
        }
  
