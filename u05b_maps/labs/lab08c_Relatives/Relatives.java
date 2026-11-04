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
		String[] personRelative = line.split(" ");
      if(personRelative.length < 2)
         return;
      if(!(map.containsKey(personRelative[0])))
         map.put(personRelative[0], new TreeSet<String>());
      map.get(personRelative[0]).add(personRelative[1]);
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