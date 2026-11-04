//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab08c
{
	public static void main( String args[] ) throws IOException
	{
		//add more test cases	
      Relatives rel = new Relatives();
      Scanner scan = new Scanner(new File("lab08c.dat"));
      while(scan.hasNextLine())
         rel.setPersonRelative(scan.nextLine());
      out.println(rel);
      
      out.printf("Dot is related to %s\n\n", rel.getRelatives("Dot"));
      
      out.printf("Is Dot directly related to Tom?  %s\n", rel.isRelative("Dot", "Tom") ? "Yes" : "No");
      out.printf("Is Dot directly related to Alice?  %s\n", rel.isRelative("Dot", "Alice") ? "Yes" : "No");
	}
}