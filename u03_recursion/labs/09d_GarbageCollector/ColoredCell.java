//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Font;

public class ColoredCell extends Cell
{
	private boolean filled;
	private Color color;
	
	public ColoredCell()
	{
		super(5,5,5,5);
		setFilled(false);
		setColor(Color.BLUE);		
	}

	public ColoredCell(boolean fill)
	{
      this(5, 5, fill);
	}

	public ColoredCell(int x, int y, boolean fill)
	{
      this(x, y, 5, 5, fill);
	}

	public ColoredCell(int x, int y, int w, int h, boolean fill)
	{
      this(x, y, w, h, fill, Color.BLUE);
	}

	public ColoredCell(int x, int y, int w, int h, boolean fill, Color c)
	{
      super(x, y, w, h);
      setFilled(fill);
      setColor(c);
	}

	public void setFilled(boolean fill)
	{
      filled = fill;
	}

	public void setColor(Color c)
	{
      if(c == null)
         c = Color.BLUE;
      color = c;
	}
	
	public boolean getFilled()
	{
		return filled;
	}
	
	public Color getColor()
	{
		return color;
	}
	
	public void draw(Graphics window)
	{
		window.setFont(new Font("TAHOMA",Font.BOLD,28));
      
      if(filled) {
         window.setColor(Color.GREEN);
         window.fillRect(getX()+2,getY()+2,getWidth()*8/10 ,getHeight()*8/10);
      }
		window.setColor(getColor());
		window.drawRect(getX(),getY(),getWidth(),getHeight());
      
  	}
	
	public String toString()
	{
		return super.toString() + " " + getFilled() + " " + getColor();
	}
}