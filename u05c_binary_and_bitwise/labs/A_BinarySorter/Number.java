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
   private final int number; //stored in base 10
	
   public Number() {base = 2; number = 1;}
   public Number(String num, int bse) {
      if(bse < 0)
         throw new IllegalArgumentException();
      number = Integer.parseInt(num,bse);
      base = bse;
   }

	public int compareTo(Number param)
	{
      int comp = 0;
      comp = binaryOnes() - param.binaryOnes();
      if(comp == 0)
         comp = number - param.number;
      if(comp == 0)
         comp = originalNumber().compareTo(param.originalNumber());
		return comp;		
	}
	public String toBinary(){
      return Integer.toBinaryString(number);
   }
   public String originalNumber() {
      return Integer.toString(number, base);
   }
   private int binaryOnes() {
      return toBinary().replaceAll("0","").length();
   }
   
   // Return these four items in this order, separated by a SPACE:
   //  * the original number
   //  * the base of the original number
   //  * the base 10 representation
   //  * the binary representation
	public String toString( )
	{
	  return String.format("%s %d %d %s", Integer.toString(number, base), base, number, toBinary());
	}
}
