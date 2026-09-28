//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Person implements Comparable<Person>
{
  private int myYear;
  private int myMonth;
  private int myDay;
  private String myName;

  public Person( int y, int m, int d, String n)
  {
      if(n == null)
         throw new IllegalArgumentException("name cannot be null");
      myYear = y;
      myMonth = m;
      myDay = d;
      myName = n;
  }

  public int compareTo( Person other )
  {
    int comp = 0;
      comp = other.myYear - myYear;
    
    if(comp == 0)
      comp = other.myMonth - myMonth;
    if(comp == 0)
      comp = other.myDay - myDay;
    if(comp == 0)
      comp = myName.compareTo(other.myName);
    
  	 return comp;
  }

  public String toString( )
  {
     return String.format("%7s   DOB:%d-%02d-%02d", myName, myYear, myMonth, myDay);
  }
}