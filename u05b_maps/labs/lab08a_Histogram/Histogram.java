//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;

public class Histogram
{
	private Map<String,Integer> histogram;

	public Histogram()
	{
      histogram = new TreeMap<>();
	}

	public Histogram(String sent)
	{
      histogram = new TreeMap<>();
      for(String s : sent.split(" "))
         if(histogram.containsKey(s))
            histogram.put(s, histogram.get(s)+1);
         else
            histogram.put(s, 1);
	}
	
	public void setSentence()
	{
	}

	public String toString()
	{
		String allStars="************************";
		String output="";
      output += "                 111111\n";
      output += "char    123456789012345\n";
      for(String str : histogram.keySet()) {
         output += String.format("%-8s", str);
         //output += allStars.substring(0,histogram.get(str)) + "\n";
         for(int i = 0; i < histogram.get(str); i++)
            output += "*";
         output += "\n";
      }
		return output+"\n\n";
	}
}