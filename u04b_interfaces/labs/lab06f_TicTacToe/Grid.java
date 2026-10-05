//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;

public class Grid
{
	private Drawable[][] grid;
	
	public Grid()
	{
		setSize(0,0);
	}

	public Grid(int rows, int cols)
	{
      setSize(rows, cols);
	}

	public void setSize(int rows, int cols)
	{
      grid = new Drawable[rows][cols];
	}

	public void setSpot(int row,int col, Drawable val)
	{
      if(row < 0 || row >= grid.length || col < 0 || col >= grid[row].length)
         throw new IllegalArgumentException("spot must be in bounds");
      if(val == null)
         throw new NullPointerException("val cannot be null");
      grid[row][col] = val;
	}
	
	public Drawable getSpot(int row, int col)
	{
		return grid[row][col];
	}
	
	public int getNumRows()
	{
		return grid.length;
	}
	
	public int getNumCols()
	{
		return grid[0].length;
	}

	public boolean drawGrid(Graphics window)
	{
		boolean full=true;
		
		//for loop for row
      for(int r = 0; r < grid.length; r++) 
			//for loop for col
         for(int c = 0; c < grid[r].length; c++) {
				//get current Drawable
            Drawable curr = getSpot(r,c);
					//if it is null
					if(curr == null)
					   full = false;
					//else
               else
                  curr.draw(window);
         }
		return full;
	}
	
	public String toString()
	{
		String output="";
      for(Drawable[] row : grid) {
         for(Drawable draw : row)
            output += draw + " ";
         output += "\n";
      }
		return output;
	}
}