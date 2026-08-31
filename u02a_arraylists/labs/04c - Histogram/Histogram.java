//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class Histogram
{
	private ArrayList<Integer> count;
	private ArrayList<Character> letters;
	private String fileName;

   {
      count = new ArrayList<Integer>();
      letters = new ArrayList<Character>();
   }

	public Histogram()
	{
      fileName = "";
	}

	public Histogram(char[] values, String fName) throws IOException
	{
      if(fName == null)
         throw new IOException("file name cant be null");
      fileName = fName;
      
      for(char value : values) {
         letters.add(value);
         count.add(0);
      }
      
		out.println("search letters = "+letters);
	}

	public void loadAndAnalyzeFile() throws IOException
	{
      if(!(new File(fileName)).exists())
         throw new IOException();
      
      Scanner scan = new Scanner(new File(fileName));
      
      while(scan.hasNextLine()) {
         char[] line = scan.nextLine().toCharArray();
         for(char chr : line) {
            int loc = letters.indexOf(chr);
            if(loc != -1)
               count.set(loc, count.get(loc) + 1);
            }
      }
	}
	public char mostFrequent()
	{
      int freq = Integer.MIN_VALUE;
      char let = ' ';
      for(int i = 0; i < letters.size(); i++)
         if(count.get(i) > freq) {
            freq = count.get(i);
            let = letters.get(i);
         }
		return let;
	}

	public char leastFrequent()
	{
      int freq = Integer.MAX_VALUE;
      char let = ' ';
      for(int i = 0; i < letters.size(); i++)
         if(count.get(i) < freq) {
            freq = count.get(i);
            let = letters.get(i);
         }
		return let;
	}

	public String toString()
	{
	   return fileName
	   + "\n" + letters
	   + "\n" + count + "\n\n\n";
	}
}
