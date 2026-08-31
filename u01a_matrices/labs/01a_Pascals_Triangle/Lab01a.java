//Â© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;

public class Lab01a
{
   
	public static void main( String args[] ) throws IOException
	{
		//add code and test cases here
      /*
      Scanner scan = new Scanner(new File("lab01a.dat"));
      
      while(scan.hasNextInt()) {
         int size = scan.nextInt();
         PascalsTriangle triangle = new PascalsTriangle(size);
         out.println(triangle.toString());
      }
      */
      PascalsTriangle triangle = new PascalsTriangle(3);
      out.println(triangle.test());
	}
}

