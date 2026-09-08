//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.*;
import static java.lang.System.*;

public class Lab09a
{
	public static void main( String args[] )
	{
		//add test cases
      out.println(String.format("GCF(%d,%d)\t\t\t----- %d\n", 16, 256, GCF.gcf(16,256)));
      out.println(String.format("GCF(%d,%d)\t\t----- %d\n", 1000, 2000, GCF.gcf(1000,2000)));
      out.println(String.format("GCF(%d,%d)\t\t----- %d\n", 1254, 2546, GCF.gcf(1254,2546)));
      out.println(String.format("GCF(%d,%d)\t\t----- %d\n", 214, 356, GCF.gcf(214,356)));
      out.println(String.format("GCF(%d,%d)\t\t\t----- %d\n", 90, 99, GCF.gcf(90,99)));
      out.println(String.format("GCF(%d,%d)\t\t\t----- %d\n", 21, 28, GCF.gcf(21,28)));
      out.println(String.format("GCF(%d,%d)\t\t\t----- %d\n", 55, 5, GCF.gcf(55,5)));
      out.println(String.format("GCF(%d,%d)\t\t----- %d\n", 315, 211, GCF.gcf(315,211)));
	}
}