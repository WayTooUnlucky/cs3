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
   public static String allVals = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
   public static String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
   public static String numbers = "0123456789";
   public static String vowels = "AEIOU";

   {
      locs = new ArrayList<>();
   }
   
	public Grid()
	{  
      this(allVals);
	}
   
   public Grid(String vals)
   {
      this(12, 12, vals);
   }
	public Grid(int rows, int cols, String vals)
	{
      setGrid(rows, cols, vals);
	}
   public Grid(String[][] mat) {
      setGrid(mat);
   }
   
   public void setGrid(String[][] mat) {
      if(mat == null)
         throw new IllegalArgumentException("String[][] mat has to exist");

      grid = new String[mat.length][mat[0].length];
      for(int r = 0; r < mat.length; r++)
         for(int c = 0; c < mat[r].length; c++)
            if(mat[r][c] == null || mat[r][c].length() == 0)
               throw new IllegalArgumentException("String at " + r + " " + c + "needs to have letters/exist");
            else
               grid[r][c] = mat[r][c];
   }
   
	public void setGrid(int rows, int cols, String vals)
	{  
      if(rows < 1 || cols < 1)
         throw new IllegalArgumentException("rows and cols must be positive!");
      else if(vals == null || vals.length() == 0)
         throw new IllegalArgumentException("String vals has to exist and have something!");

      grid = new String[rows][cols];
      for(String[] row : grid)
         for(int i = 0; i < row.length; i++) {
            int index = (int)(Math.random() * vals.length());
            String randomVal = "" + vals.charAt(index);
            row[i] = randomVal;
         }
	}

	public int findMax(String val)
	{
      while(val == null || val.length() != 1) {
         Scanner scan = new Scanner(System.in);
         out.print("search term can not be null or more / less than one character.\nnew search term :: ");
         val = scan.next();
      }
      
      int max = 0;
      for(int r = 0; r < grid.length; r++)
         for(int c = 0; c < grid[r].length; c++) {
            if(locs.contains(new Visited(r, c)))
               continue;
            int count = findMax(r, c, val);
            if(max < count)
               max = count;
         }
      for(Visited loc : locs)
         grid[loc.r()][loc.c()] = val;
      
      return max;
	}

	private int findMax(int r, int c, String search)
	{
      if(r >= 0 && r < grid.length && c >= 0 && c < grid[r].length && grid[r][c].equals(search)) {
         locs.add(new Visited(r,c));
         grid[r][c] = " ";
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