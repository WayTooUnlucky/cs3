//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab09c
{
	public static void main( String args[] ) throws IOException
	{
      Grid grid = new Grid(Grid.vowels);
      out.println(grid);
      out.println("A count == " + grid.findMax("A"));
      out.println("E count == " + grid.findMax("E"));
      
      out.println(grid.findMax(""));
	}
}