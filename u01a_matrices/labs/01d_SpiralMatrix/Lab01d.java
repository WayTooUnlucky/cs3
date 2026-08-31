//Â© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Lab01d
{
	public static void main( String args[] ) throws IOException
	{
		//add code and test cases here
      Scanner scan = new Scanner(new File("lab01d.dat"));
      int numMats = scan.nextInt();
      for(int i = 0; i < numMats; i++) {
         int size = scan.nextInt();
         SpiralMatrix spiral = new SpiralMatrix(size);
         out.println(spiral);
      }
      
	}
}

