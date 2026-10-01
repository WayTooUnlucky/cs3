//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class MathSetRunner
{
	public static void main(String args[]) throws IOException
	{
		//add test cases
      Scanner scan = new Scanner(new File("lab_c.dat"));
      while(scan.hasNextLine()) {
         MathSet set = new MathSet(scan.nextLine(), scan.nextLine());
         out.println(set);
         out.printf("union - %s\n", set.union());
         out.printf("intersection - %s\n", set.intersection());
         out.printf("difference A-B - %s\n", set.differenceAMinusB());
         out.printf("difference B-A - %s\n", set.differenceBMinusA());
         out.printf("symmetric difference %s\n", set.symmetricDifference());
         out.println();
      }
	}
}
