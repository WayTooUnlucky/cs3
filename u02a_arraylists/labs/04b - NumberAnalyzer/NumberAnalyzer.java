//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.*;

public class NumberAnalyzer
{
	private ArrayList<Number> list;

	public NumberAnalyzer()
	{
      setList("0");
	}

	public NumberAnalyzer(String numbers)
	{
      setList(numbers);
	}
	
	public void setList(String numbers)
	{
      Scanner scan = new Scanner(numbers);
      list = new ArrayList<>();
      while(scan.hasNextInt())
         list.add(new Number(scan.nextInt()));
	}

	public int countOdds()
	{
      int oddCount=0;
      for(Number num : list)
         if(num.isOdd())
            oddCount++;
      return oddCount;
	}

	public int countEvens()
	{
      return list.size() - countOdds();
	}

	public int countPerfects()
	{
		int perfectCount=0;
      for(Number num : list)
         if(num.isPerfect())
            perfectCount++;
      return perfectCount;
	}
	
	public String toString( )
	{
		return list.toString();
	}
}
