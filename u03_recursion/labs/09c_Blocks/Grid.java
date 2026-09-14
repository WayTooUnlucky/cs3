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
   
	public void setGrid(int rows, int cols, String vals)
	{
      try{
         grid = new String[rows][cols];
         for(String[] row : grid)
            for(int i = 0; i < row.length; i++) {
               int index = (int)(Math.random() * vals.length());
               String randomVal = "" + vals.charAt(index);
               row[i] = randomVal;
            }
            
      } catch (NullPointerException e) {
         Scanner scan = new Scanner(System.in);
         out.print("vals can not equal null. input another string here :: ");
         setGrid(rows, cols, scan.next());
      } catch (NegativeArraySizeException e) {
         Scanner scan = new Scanner(System.in);
         out.print("array dimensions can not be negative. input new dimensions \nrows :: ");
         int rows1 = scan.nextInt();
         out.print("cols :: ");
         int cols1 = scan.nextInt();
         setGrid(rows1, cols1, vals);
      } catch (Exception e) {
         out.print("something went wrong.");
         System.exit(1);
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