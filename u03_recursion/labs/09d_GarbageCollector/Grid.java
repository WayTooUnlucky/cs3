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
	private Cell[][] grid;
	
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
      if(rows < 1 || cols < 1)
         throw new IllegalArgumentException("rows or cols cannot be less than 1");
		grid = new Cell[rows][cols];
	}

	public void setSpot(int row,int col, Cell val)
	{
	   if(val == null)
         throw new IllegalArgumentException("val cannot be null");
      if(row < 1 || col < 1 || row >= grid.length || col >= grid[0].length)
         throw new IllegalArgumentException("row and col has to be in bounds");
      grid[row][cell] = val;
	}
	
	public Cell getSpot(int row, int col)
	{
      if(row < 1 || col < 1 || row >= grid.length || col >= grid[0].length)
         throw new IllegalArgumentException("row and col has to be in bounds");
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
		for(int r=0;r<grid.length;r++)
		{
			//for loop for col
			for(int c=0;c<grid[r].length;c++)
			{
				Cell spot = grid[r][c];
				
				//if the current spot is not null
            if(grid[r][c] != null)
               
				//else

			}
		}
		return full;
	}
	
	public String toString()
	{
		String output="";
		//for loop for row
	
	
			//for loop for col
	
	
	
	
	
	
		return output;
	}

}