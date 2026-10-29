//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Number implements Comparable<Number>
{

	//add in instance variables
   private int base;
   private int number;
   private int numberBase10;
	
	//add in a constructor or two
   public Number(int num, int bse) {
      if(bse < 0)
         throw new IllegalArgumentException();
      numberBase10 = Integer.parseInt(""+num,bse);
      number = num;
      base = bse;
   }
   public Number() {base = 2; numberBase10 = 1;}

	public int compareTo(Number param)
	{
      int comp = 0;
      comp = toBinary().replaceAll("0","").length() - param.toBinary().replaceAll("0","").length();
      if(comp == 0)
         comp = numberBase10 - param.numberBase10;
      if(comp == 0)
         comp = (""+number).compareTo(""+param.number);
		return comp;		
	}
	public String toBinary(){
      return Integer.toString(numberBase10,2);
   }
   
   // Return these four items in this order, separated by a SPACE:
   //  * the original numberBase10
   //  * the base of the original numberBase10
   //  * the base 10 representation
   //  * the binary representation
	public String toString( )
	{
	  return String.format("%d %d %d %s", number, base, numberBase10, toBinary());
	}
}
