//Â© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Lab01b
{
	public static void main( String args[] ) throws IOException
	{
		//add code and test cases here
      Scanner scan = new Scanner(new File("lab01b.dat"));
      int num = scan.nextInt();
      scan.nextLine();
      for(int i = 0; i < num; i++) {
         String word = scan.nextLine();
         FancyWord fancy = new FancyWord(word);
         out.println(fancy.toString());
      }
	}
}

