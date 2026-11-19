//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

//ArrayList of ints
//or
//array of ints

import java.util.ArrayList;
import static java.lang.System.*;
import java.util.EmptyStackException;

public class IntStack
{
	//option 2
	private ArrayList<Integer> listOfInts;

	public IntStack()
	{
      listOfInts = new ArrayList<>();
	}

	public void push(int item)
	{
      listOfInts.add(item);
	}

	public int pop()
	{
      if(isEmpty())
         throw new EmptyStackException();
		return listOfInts.remove(listOfInts.size()-1);
	}

	public boolean isEmpty()
	{
		return listOfInts.isEmpty();
	}

	public int peek()
	{
      if(isEmpty())
         throw new EmptyStackException();
		return listOfInts.get(listOfInts.size()-1);
	}

	public String toString()
	{
		return listOfInts.toString();
	}
}