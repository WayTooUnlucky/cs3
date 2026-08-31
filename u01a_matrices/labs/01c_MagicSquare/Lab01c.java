//Â© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;
import java.io.IOException;
import java.io.File;

public class Lab01c
{
	public static void main( String args[] ) throws IOException
	{
		//add code and test cases here
      Scanner scan = new Scanner(new File("lab01c.dat"));
      
      while(scan.hasNextInt()) {
         int size = scan.nextInt();
         MagicSquare magic = new MagicSquare(size);
         out.println(magic);
      }
	}
}

