import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;
import static java.lang.System.*;

class IteratorTest {
   public static void populateListFromString(ArrayList<String> list, 
                                                        String strList){   
      list.clear();
      addToListFromString(list, strList);
      
   }

   public static void addToListFromString(ArrayList<String> list, 
                                                        String strList)   {   
      Scanner scan = new Scanner(strList);
      while(scan.hasNext())
         list.add(scan.next());
   }
   
   /*** REMOVE ***/
   public static void remove(ArrayList<String> list, String toRemove) {
      Iterator iter = list.iterator();
      while(iter.hasNext()) {
         if(iter.next().equals(toRemove))
            iter.remove();
      }
   }

   /*** REPLACE ***/
   public static void replace(ArrayList<String> list, String toRemove, String replaceWith) {
      ListIterator<String> iter = list.listIterator();
      while(iter.hasNext())
         if(iter.next().equals(toRemove))
            iter.set(replaceWith);
   }
}