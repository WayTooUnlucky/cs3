//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;
import static java.lang.System.*;

public class Acronyms
{
	private Map<String,String> acronymTable;

	public Acronyms()
	{
      acronymTable = new TreeMap<>();
	}

	public void putEntry(String entry)
	{
      String[] splitty = entry.split(" - ");
      acronymTable.put(splitty[0], splitty[1]);
	}

	public String convert(String sent)
	{
		Scanner chop = new Scanner(sent);
		String output ="";
      while(chop.hasNext()) {
         String str = chop.next();
         String strNoPunct = str.substring(0,str.length()-1);
         if(acronymTable.containsKey(str))
            output += acronymTable.get(str) + " ";
         else if (acronymTable.containsKey(strNoPunct))
            output += acronymTable.get(strNoPunct) + str.charAt(str.length()-1) + " ";
         else
            output += str + " ";
      }
		return output;
	}

	public String toString()
	{
		return acronymTable.toString();
      
	}
}