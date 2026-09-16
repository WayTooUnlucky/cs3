//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.*;
import static java.lang.System.*;

public class Lab09e
{
   public static void main( String args[] )
   {
	    //add test cases	  
       Permutation perm = new Permutation("ABC");
       perm.permutation();
       out.println(perm);  
       
       perm.setWord("abc");
       perm.permutation();
       out.println(perm);
       
       perm.setWord("boat");
       perm.permutation();
       out.println(perm);
       
       perm.setWord("it");
       perm.permutation();
       out.println(perm);
	}
}