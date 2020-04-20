/*  ITC 155 - ASSIGNMENT 1 - GRAPHICS
 * Jessica Sites 
 * 4/20/20
 * 	The window is 220 pixels wide and 150 pixels tall. The background is yellow. 
 * There are two blue ovals of size 40 x 40 pixels. 
 * The left oval's top-left corner is located at position (50, 25), 
 * and the two ovals' top-left corners are 80 pixels apart horizontally. 
 * There is a red square whose top two corners exactly intersect the centers of the two ovals.
 * Lastly, there is a black horizontal line through the center of the square.
 ************************************************************************************/

import java.awt.*;

public class MickeyBox {
	  public static void main(String[] args) {
	        DrawingPanel panel = new DrawingPanel(220, 150);
	        Graphics2D g = panel.getGraphics();
	        g.setColor(Color.YELLOW);
	        g.fillRect(0, 0, 220, 150);
	        g.setColor(Color.BLUE);
	        g.fillOval(50, 25, 40, 40);
	        g.fillOval(130, 25, 40, 40);
	        g.setColor(Color.RED);
	        g.fillRect(70, 45, 80, 80);
	        g.setColor(Color.BLACK);
	        g.drawLine(70, 85, 150, 85);
	    }
	}
