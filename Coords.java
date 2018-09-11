import javax.swing.JApplet;
	import java.awt.*;
	
	public class Coords extends JApplet
{
	public void paint (Graphics page)
	{
	// Declare size constants final 
		int MAX_SIZE = 300; 
		final int PAGE_WIDTH = 600; 
		final int PAGE_HEIGHT = 400;
	// Declare variables
		int x, y;    // x and y coordinates of upper left-corner of each shape
		int width, height; // width and height of each shape
		// Set the background color
		setBackground (Color.yellow);
	// Set the color for the next shape to be drawn 
	page.setColor (Color.pink);
	// Assign the corner point and width and height 
	x = 0; 
	y = 0;
	width = 150; 
	height = 100;
	page.fillRect(x, y, width, height);
	
	page.drawRect(150, 100, 300, 200);
	page.setColor(Color.blue);
	page.fillRect(150, 100, 300, 200);
	
	page.drawRect(450, 0, 150, 100);
	page.setColor(Color.MAGENTA);
	page.fillRect(450, 0, 150, 100);
	
	page.drawRect(0, 300, 150, 100);
	page.setColor(Color.green);
	page.fillRect(0, 300, 150, 100);
	
	page.drawRect(450, 300, 150, 100);
	page.setColor(Color.red);
	page.fillRect(450, 300, 150, 100);
	}
}