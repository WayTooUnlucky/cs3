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

public class PartList
{
	private TreeMap<Part, Integer> partsMap;
	
	public PartList()
	{
      partsMap = new TreeMap<>();
	}
	
	public PartList(String fileName)
	{
		this();
      
		try
		{
			Scanner file = new Scanner(new File(fileName));
			//add code here to read from the file 
         while(file.hasNextLine()) {
            Part p = new Part(file.nextLine());
            if(partsMap.containsKey(p))
               partsMap.put(p, partsMap.get(p) + 1);
            else
               partsMap.put(p, 1);
         }
		}
		catch( IOException e )  //Most specific exceptions must be listed 1st
		{
			out.println(e);
		}
		catch( RuntimeException e )
		{
			out.println(e);
		}
		catch( Exception e )
		{
			out.println(e);
		}
		finally
		{
			//no code needed here
		}
      
	}
	
	public String toString()
	{
		String output="";
      for(Part p : partsMap.keySet())
         output += String.format("%s - %d\n", p, partsMap.get(p));
		return output;
	}
}