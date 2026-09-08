//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.*;
import static java.lang.System.*;

public class GCF
{
	//instance variables, constructors, and other methods not shown 
	private GCF() {}
   
	public static int gcf(int n1, int n2)
	{
		if(n1 <= 0 || n2 <= 0)
         throw new IllegalArgumentException("n1 and n2 both have to be positive! >:(");
		
      int rem = n1 % n2;
      if(rem == 0)
         return n2;
      else
         return gcf(n2, rem);
	}
}