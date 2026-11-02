//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab08a
{
	public static void main( String args[] ) throws IOException
	{
		//add test cases
      Histogram hist = new Histogram("a b c d e f g h i a c d e g h i h k");
      out.print(hist);
      hist = new Histogram("1 2 3 4 5 6 1 2 3 4 5 1 3 1 2 3 4");
      out.print(hist);
      hist = new Histogram("Y U I O Q W E R T Y");
      out.print(hist);
      hist = new Histogram("4 T # @ ^ # # #");
      out.print(hist);
		
		
		
		
		
		
		
	}
}