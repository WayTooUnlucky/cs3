//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import java.awt.Canvas;

public class Triangle extends Canvas implements Runnable
{
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;
   private int smallness = 5;
		
	public Triangle()
	{
		setBackground(Color.WHITE);
	}
   
   public Triangle(int size) {
      if(size == 0)
         return;
      else
         smallness = size;
      setBackground(Color.WHITE);
   }

	public void paint( Graphics window )
	{
		window.setColor(Color.BLUE);
		window.setFont(new Font("ARIAL",Font.BOLD,24));		
		window.drawString("Serpinski's Gasket", 25, 50);

		triangle(window, (WIDTH-10)/2, 20, WIDTH-40, HEIGHT-20, 40, HEIGHT-20);
	}
	
	public void triangle(Graphics window, int x1, int y1, int x2, int y2, int x3, int y3)
	{
      if(x1-x3<smallness) //stop when triangle is less than smallness pixels wide
         return;
      
		int midXRight = (x1 + x2)/2;
      int midXLeft = (x1 + x3)/2;
      int midXBottom = (x3 + x2)/2;
      int midY = (y1 + y2)/2;
      int yBottom = (y3);
      
      window.setColor(Color.WHITE);
      window.fillPolygon(new int[]{midXLeft, midXRight, midXBottom}, new int[]{midY, midY, yBottom}, 3);
    
      //random color
      int r = (int)(Math.random() * 255);
      int g = (int)(Math.random() * 255);
      int b = (int)(Math.random() * 255);
      
      
      /* //gradient color (green -> purple)
      int r = (int)(x3/800.0*255);
      int g = (int)(y3/600.0*255);
      int b = (int)(x2/800.0*255);
      */
      
      window.setColor(new Color(r,g,b));
      
      //top triangle
      window.fillPolygon(new int[]{x1, midXRight, midXLeft}, new int[]{y1, midY, midY}, 3);
      triangle(window, x1, y1, midXRight, midY, midXLeft, midY);
      
      //left triangle
      window.fillPolygon(new int[]{midXLeft, x1, x3}, new int[]{midY, yBottom, yBottom}, 3);
      triangle(window, midXLeft, midY, x1, yBottom, x3, yBottom);
      
      //right triangle
      window.fillPolygon(new int[]{midXRight, x2, midXBottom}, new int[]{midY, yBottom, yBottom}, 3);
		triangle(window, midXRight, midY, x2, yBottom, midXBottom, yBottom); 
	}
	
	public void run()
	{
		try{
		  	Thread.currentThread().sleep(3);	
		}
		catch(Exception e)
		{
		}
	}
}