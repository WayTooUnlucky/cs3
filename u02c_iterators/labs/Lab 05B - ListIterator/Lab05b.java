//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;
import static java.lang.System.*;

public class Lab05b
{
	public static void main ( String[] args )
	{
		//add test cases		
      ListIteratorTest lsit = new ListIteratorTest("a b c a b c a +");
      out.println(lsit);
      
      lsit.setTest("a b c d e f g h i j x x x x x 7");
      out.println(lsit);
      
      lsit.setTest("1 2 3 4 5 6 a b c a b c b #");
      out.println(lsit);
	}
}
