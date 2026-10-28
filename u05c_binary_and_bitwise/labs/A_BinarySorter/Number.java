//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Number implements Comparable<Number>
{

	//add in instance variables
   private String number;
   private int base;
	
	//add in a constructor or two
   public Number(String num, int bse) {
      if(bse < 0)
         throw new IllegalArgumentException();
      number = ""+Integer.parseInt(num,bse);
      base = bse;
   }
   public Number() {base = 2; number = "1";}

	public int compareTo(Number param)
	{
      int comp = 0;
      comp = toBinary().replaceAll("0","").length() - param.toBinary().replaceAll("0","").length();
      if(comp == 0)
         comp = Integer.parseInt(number, base) - Integer.parseInt(param.number, param.base);
      if(comp == 0)
         comp = number.compareTo(param.number);
		return comp;		
	}
	public String toBinary(){
      return Integer.toString(Integer.parseInt(number,base),2);
   }
   
   // Return these four items in this order, separated by a SPACE:
   //  * the original number
   //  * the base of the original number
   //  * the base 10 representation
   //  * the binary representation
	public String toString( )
	{
	  return String.format("%d %d %d %s", );
	}
}
