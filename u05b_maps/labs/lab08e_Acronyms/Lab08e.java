//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab08e
{
	public static void main( String args[] ) throws IOException
	{
		//add test cases
      Acronyms acr = new Acronyms();
      Scanner scan = new Scanner(new File("lab08e.dat"));
      int in = scan.nextInt();
      scan.nextLine();
      for(int i = 0; i < in; i++)
         acr.putEntry(scan.nextLine());
      while(scan.hasNextLine())
         out.println(acr.convert(scan.nextLine()));
	}
}