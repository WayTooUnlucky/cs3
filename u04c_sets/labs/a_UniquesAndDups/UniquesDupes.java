//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;
import java.util.ArrayList;
import static java.lang.System.*;

public class UniquesDupes
{
	public static Set<String> getUniques(String input)
	{
		Set<String> uniques = new TreeSet<String>();

		//add code
      String[] list = input.split(" ");
      for(String str : list)
         uniques.add(str);
		return uniques;
	}

	public static Set<String> getDupes(String input)
	{
		//add code
		Set<String> uniques = new TreeSet<String>();
      Set<String> dups = new TreeSet<String>();
      
      String[] list = input.split(" ");
      for(String str : list)
         if(uniques.add(str) == false)
            dups.add(str);
		return dups;
	}
}