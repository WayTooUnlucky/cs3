//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.Integer.*;
import static java.lang.System.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Lab04e
{
	public static void main( String args[] ) throws FileNotFoundException
	{
      Scanner scan = new Scanner(new File("lab04e.dat"));
      while(scan.hasNextLine()) {
         String expression = scan.nextLine();
         ExpressionSolver solve = new ExpressionSolver(expression);
         solve.solveExpression();
         out.println(solve);
      }
	}
}