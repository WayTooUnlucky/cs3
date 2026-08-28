import java.util.HashSet;
import java.util.Set;

public class PermutationSet
{
   public static Set<String> permutations(String word) {
      // Make a HashSet to store the permutations of <code>word</code>
      
      // Throw a NPE
      if (word == null)
         ;
      // If `word` is the empty string, add it to your set before returning the set.
      if (word.length() == 0) {
         ;
      }
      // Store the first character
      // Store the rest of the string
      // Call permutations() on rem and store the set it gives you
      // Loop through each permutation of rem
         // Loop through each spot of the current word from rem 
            // Insert <code>init</code> at the current spot
            // Add this permutation to our set of permutations.
      return null;
   }
}