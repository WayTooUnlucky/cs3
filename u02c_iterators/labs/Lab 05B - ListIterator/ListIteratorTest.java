//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

package myarraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;
import static java.lang.System.*;

public class ListIteratorTest
{
	private ArrayList<String> list;

	public ListIteratorTest(String line) {
      setTest(line);
	}

	public void setTest(String line) {
      list = new ArrayList<>();
      String[] words = line.split(" ");
      String toRemove = words[words.length - 2];
      String replaceWith = words[words.length - 1];
      for(int i = 0; i < words.length; i++)
         if(i < words.length - 2)
            list.add(words[i]);
      replace(toRemove, replaceWith);
	}

	public void replace(String toRemove, String replaceWith) {
      ListIterator<String> lsit = list.listIterator();
      while(lsit.hasNext())
         if(lsit.next().equals(toRemove))
            lsit.set(replaceWith);
      
	}

	public String toString() {
		return list.toString();
	}
}
