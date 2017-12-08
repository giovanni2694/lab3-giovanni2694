import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import javax.swing.JPanel;
import java.awt.Polygon;
 
public class MyPanelClass extends JPanel {
            /**
	 * 
	 */
	private static final long serialVersionUID = 7057541440811488699L;

			public void paintComponent(Graphics g) {
                        super.paintComponent(g);
 
                        //Compute interior coordinates
                        Insets myInsets = this.getInsets();
                        int x1 = myInsets.left;
                        int y1 = myInsets.top;
                        int x2 = getWidth() - myInsets.right - 1;
                        int y2 = getHeight() - myInsets.bottom - 1;
                        int width = x2 - x1;
                        int height = y2 - y1;
 
                        //Paint the background
                        g.setColor(Color.WHITE);
                        g.fillRect(x1, y1, width + 1, height + 1);
                        
                        g.setColor(Color.RED);
                        g.fillRect(x1, y1, width + 1, 40);
                        g.setColor(Color.RED);
                        g.fillRect(x1, 80, width + 1, 40);
                        g.setColor(Color.RED);
                        g.fillRect(x1, 160, width + 1, height + 1);
                      
                      
                        Polygon p1 = new Polygon();
                        p1.addPoint(x1, y1);
                        p1.addPoint(x1 + width/2, y1 + height/2);
                        p1.addPoint(x1, y1 +height);
                        g.setColor(Color.BLUE);
                        g.fillPolygon(p1);
                        
                        
                        Polygon p2 = new Polygon();
                        p2.addPoint(x1 + 25+ 20, y1 + 93);
                        p2.addPoint(x1 + 41+ 20, y1 + 93);
                        p2.addPoint(x1 + 47+ 20, y1 + 78);
                        p2.addPoint(x1 + 53+ 20, y1 + 93);
                        p2.addPoint(x1 + 69+ 20, y1 + 93);
                        p2.addPoint(x1 + 56+ 20, y1 + 103);
                        p2.addPoint(x1 + 61+ 20, y1 + 118);
                        p2.addPoint(x1 + 47+ 20, y1 + 108);
                        p2.addPoint(x1 + 34+ 20, y1 + 118);
                        p2.addPoint(x1 + 38+ 20, y1 + 103);
                        g.setColor(Color.WHITE);
                        g.fillPolygon(p2);
                        
			}
			
}