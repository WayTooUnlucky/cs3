//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class Lab13c
{
	public static void main ( String[] args ) throws IOException
	{
		//add test cases
      ExpressionSolver solve = new ExpressionSolver();
      out.println("\npostfix:");
      Scanner scan = new Scanner(new File("postfix.dat"));
      while(scan.hasNextLine()) {
         String line = scan.nextLine();
         out.printf("%s = %.3f\n", line, solve.solvePostfix(line));
      }
      scan.close();
      
      out.println("\n\nprefix:");
      scan = new Scanner(new File("prefix.dat"));
      while(scan.hasNextLine()) {
         String line = scan.nextLine();
         out.printf("%s = %.3f\n", line, solve.solvePrefix(line));
      }
      scan.close();
      
	}
}
