import static java.lang.System.*;
import java.util.Set;

public class Lab09d
{
   public static void main(String args[]) {
      String s0 = "ABC";
      out.println("\nPermutations for " + s0 + " are: \n");
      out.println(displaySet(PermutationSet.permutations(s0)));
      String s1 = "abc";
      out.println("\nPermutations for " + s1 + " are: \n");
      out.println(displaySet(PermutationSet.permutations(s1)));
      
      /** The permutations for these won't fit on the screen.
       *  Fix <code>displaySet</code> set each line of output
       *  is at most 63 characters long.
       */
      String s2 = "boat";
      out.println("\nPermutations for " + s2 + " are: \n");
      out.println(displaySet(PermutationSet.permutations(s2)));
      String s3 = "frown";
      out.println("\nPermutations for " + s3 + " are: \n");
      out.println(displaySet(PermutationSet.permutations(s3)));
      out.println();
      out.println("Test null to make sure you're writing robust programs.");
      out.println("Your program should not crash!");
      out.println(displaySet(PermutationSet.permutations(null)));
   }
   
   public static String displaySet(Set<String> perms) {
      String output = "";
      int max = 63;
      int length = 0;
      for (String word : perms) {
         // Modify the body of this loop to fix the output.
         output += word + " ";
      }
      return output;
   } 
}