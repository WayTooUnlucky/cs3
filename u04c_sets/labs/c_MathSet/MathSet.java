//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;
import static java.lang.System.*;

public class MathSet
{
	private Set<Integer> one;
	private Set<Integer> two;

	public MathSet()
	{
      this("1","2");
	}

	public MathSet(String o, String t)
	{
      if(o == null || o.length() == 0 || t == null || t.length() == 0)
         throw new IllegalArgumentException();
      String[] oRay = o.split(" ");
      String[] tRay = t.split(" ");
      one = new TreeSet<>();
      two = new TreeSet<>();
      for(String str : oRay)
         one.add(Integer.parseInt(str));
      for(String str : tRay)
         two.add(Integer.parseInt(str));
	}

	public Set<Integer> union()
	{  
      Set<Integer> union = new TreeSet<>();
      union.addAll(one);
      union.addAll(two);
		return union;
	}

	public Set<Integer> intersection()
	{
      Set<Integer> inter = new TreeSet<>();
      inter.addAll(one);
      inter.retainAll(two);
		return inter;
	}

	public Set<Integer> differenceAMinusB()
	{
      Set<Integer> diff = new TreeSet<>();
      diff.addAll(one);
      diff.removeAll(two);
		return diff;
	}

	public Set<Integer> differenceBMinusA()
	{
		Set<Integer> diff = new TreeSet<>();
      diff.addAll(two);
      diff.removeAll(one);
		return diff;
	}
	
	public Set<Integer> symmetricDifference()
	{		
		Set<Integer> sym = new TreeSet<>();
      sym.addAll(union());
      sym.removeAll(intersection());
      return sym;
      
      //or (A-B)U(B-A)
	}	
	
	public String toString()
	{
		return "Set one " + one + "\n" +	"Set two " + two +  "\n";
	}
}