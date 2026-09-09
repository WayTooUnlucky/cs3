//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Lab09b
{
	public static void main(String args[])
	{
		//add test cases	
      AtCounter at = new AtCounter();
      at.countAts(0,0);
      out.printf("%d %d has %s\n", 0, 0, at);
      at.countAts(2,5);
      out.printf("%d %d has %s\n", 2, 5, at);
      at.countAts(5,0);
      out.printf("%d %d has %s\n", 5, 0, at);
      at.countAts(9,9);
      out.printf("%d %d has %s\n", 9, 9, at);
      at.countAts(3,9);
      out.printf("%d %d has %s\n", 3, 9, at);
      
	}
}