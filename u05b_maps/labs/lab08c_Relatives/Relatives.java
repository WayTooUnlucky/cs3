//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Scanner;

public class Relatives
{
	private Map<String,Set<String>> map;

	public Relatives()
	{
      map = new TreeMap<>();
	}

	public void setPersonRelative(String line)
	{
		String[] relative = line.split(" ");
      if(relative.length < 2)
         return;

      if(!(map.containsKey(relative[0])))
         map.put(relative[0], new TreeSet<String>());
      map.get(relative[0]).add(relative[1]);
      
      if(!(map.containsKey(relative[1])))
         map.put(relative[1], new TreeSet<String>());
      map.get(relative[1]).add(relative[0]);
   }


	public String getRelatives(String person)
	{
		return map.get(person).toString();
	}

   public boolean isRelative(String person, String relative) {
      return map.get(person).contains(relative);
   }
	public String toString()
	{
		String output="";
      for(String person : map.keySet()) {
         String relatives = "";
         for(String rel : map.get(person))
            relatives += rel + " ";
         output += String.format("%s is related to %s\n", person, relatives);
      }
		return output;
	}
}