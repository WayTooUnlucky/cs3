//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;
import java.util.ArrayList;

public class Grid
{
   private String[][] grid;
   private ArrayList<Visited> locs;

   {
      locs = new ArrayList<>();
   }
   
	public Grid()
	{  
      setGrid(12, 12, defaultVals());
	}
	public Grid(int rows, int cols, String[] vals)
	{
      setGrid(rows, cols, vals);
	}
	

   public String[] defaultVals() {
      String[] vals = new String[36];
      for(int i = 0; i < 10; i++) //adds 0-9
         vals[i] = "" + (char)(i + 48);
      for(int i = 0; i < 26; i++) //adds A-Z
         vals[i + 10] = "" + (char)(i + 65);
      return vals;
   }
   
	public void setGrid(int rows, int cols, String[] vals)
	{
      grid = new String[rows][cols];
      for(String[] row : grid)
         for(int i = 0; i < row.length; i++) {
            int index = (int)(Math.random() * vals.length);
            String randomVal = vals[index];
            row[i] = randomVal;
         }
	}

	public int findMax(String val)
	{
		int count=-1;
      for(int r = 0; r < grid.length; r++)
         for(int c = 0; c < grid[r].length; c++) {
            int max = findMax(r, c, val);
            if(max > count)
               count = max;
         }
      for(Visited loc : locs)
         grid[loc.r()][loc.c()] = val;
         
		return count;
	}

	private int findMax(int r, int c, String search)
	{
      if(r >= 0 && r < grid.length && c >= 0 && c < grid[r].length && grid[r][c].equals(search)) {
         locs.add(new Visited(r,c));
         return 1 + findMax(r + 1, c, search) + findMax(r - 1, c, search) + findMax(r, c + 1, search) + findMax(r, c - 1, search);
      }
		else
         return 0;
	}

   private record Visited(int r, int c) {}
	public String toString()
	{
		String output="";
      for(int r = 0; r < grid.length; r++) {
         for(int c = 0; c < grid[r].length; c++)
            output += grid[r][c] + " ";
         output += "\n";
      }
		return output;
	}
}