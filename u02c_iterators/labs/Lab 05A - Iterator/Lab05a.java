import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import static java.lang.System.*;

public class Lab05a
{
   public static void main( String[] args )
   {
      ArrayList<String> myList = new ArrayList<String>();
      testRemove(myList);
      testReplace(myList);
   }
      
   public static void testRemove(ArrayList<String> myList) {
      IteratorTest.populateListFromString(myList, "a b c a b c");
      String toRemove = "a";
      out.println("list before removing " + toRemove + ":  " + myList);
      IteratorTest.remove(myList, toRemove);
      out.println("    list after removal:  " + myList + "\n\n");
      
      IteratorTest.populateListFromString(myList, "a b c d e f g h i j x x x x");
      toRemove = "x";
      out.println("list before removing " + toRemove + ":  " + myList);
      IteratorTest.remove(myList, toRemove);
      out.println("    list after removal:  " + myList + "\n\n");      
   
      IteratorTest.populateListFromString(myList, "1 2 3 4 5 6 a b c a b c");
      toRemove = "b";
      out.println("list before removing " + toRemove + ":  " + myList);
      IteratorTest.remove(myList, toRemove);
      out.println("    list after removal:  " + myList + "\n\n");
   }
   
   public static void testReplace(ArrayList<String> myList)
   {
      IteratorTest.populateListFromString(myList, "a b c a b c");
      String toRemove = "a", toReplace = "+";
      out.println("list before replacing " + toRemove + " with " + toReplace + ": " + myList);
      IteratorTest.replace(myList, toRemove, toReplace);
      out.println("        list after replacement: " + myList + "\n\n");
            
      IteratorTest.populateListFromString(myList, "a b c d e f g h i j x x x x");
      toRemove = "x"; toReplace = "7";
      out.println("list before replacing " + toRemove + " with " + toReplace + ": " + myList);
      IteratorTest.replace(myList, toRemove, toReplace);
      out.println("        list after replacement: " + myList + "\n\n");   

      IteratorTest.populateListFromString(myList, "1 2 3 4 5 6 a b c a b c");
      toRemove = "b"; toReplace = "#";
      out.println("list before replacing " + toRemove + " with " + toReplace + ": " + myList);
      IteratorTest.replace(myList, toRemove, toReplace);
      out.println("        list after replacement: " + myList + "\n\n");  
   }
}