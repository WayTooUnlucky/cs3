//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

class SiteName implements Comparable<SiteName>
{
	//add instance variables
	String name;
	
	//add a constructor
   public SiteName(String siteName) {
      name = siteName;
   }

   private String getTLD() {
      String TLD = "";
      for(int i = name.length() - 1; i > -1; i--)
         if(name.substring(i,i+1).equals(".")) {
            TLD = name.substring(i+1);
            return TLD;
         }
      return TLD;
   }
	//add a compareTo
   public int compareTo(SiteName other) {
      int comp = getTLD().compareTo(other.getTLD());
      if(comp != 0)
         return comp;
      return name.compareTo(other.name);
   }

	//add a toString
   public String toString() {
      return name;
   }
}