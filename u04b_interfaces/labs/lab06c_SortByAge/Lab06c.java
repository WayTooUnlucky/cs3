//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import static java.lang.System.*;

public class Lab06c
{
	public static void main ( String[] args ) throws IOException
	{
	   //add test cases
      ArrayList<Person> list = new ArrayList<>();
      
      Scanner scan = new Scanner(new File("lab06c.dat"));
      int count = scan.nextInt();
      scan.nextLine();
      for(int i = 0; i < count; i++) {
         int year = scan.nextInt();
         int month = scan.nextInt();
         int day = scan.nextInt();
         String name = scan.next();
         list.add(new Person(year, month, day, name));
      }
         
      Collections.sort(list);
      
      for(Person person : list)
         out.println(person);
	}
}