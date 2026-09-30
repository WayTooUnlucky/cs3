//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class OddEvenSets
{
	private Set<Integer> odds;
	private Set<Integer> evens;

   {
      odds = new TreeSet<>();
      evens = new TreeSet<>();
   }
	public OddEvenSets()
	{
      
	}

	public OddEvenSets(String line)
	{
       String[] nums = line.split(" ");
       for(String number : nums) {
         Integer num = Integer.parseInt(number);
         if(num % 2 == 0)
            evens.add(num);
         else
            odds.add(num);
       }
	}

	public String toString()
	{
		return "ODDS : " + odds + "\nEVENS : " + evens + "\n\n";
	}
}