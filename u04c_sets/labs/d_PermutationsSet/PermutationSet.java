import java.util.HashSet;
import java.util.Set;

public class PermutationSet
{
   public static Set<String> permutations(String word) {
      // Make a HashSet to store the permutations of <code>word</code>
      Set<String> set = new HashSet<>();
      // Throw a NPE
      if (word == null)
         throw new NullPointerException("word = null");
      // If `word` is the empty string, add it to your set before returning the set.
      if (word.length() == 0) {
         set.add("");
         return set;
      }
      
      String addThis = word.substring(0,1);
      String leftover = word.substring(1);
      Set<String> subPermutations = permutations(leftover);
      for(String str : subPermutations) {
         for(int i = 0; i <= str.length(); i++) {
            set.add(str.substring(0,i) + addThis + str.substring(i));
         }
      }
      return set;
      
      /*
      // Store the first character
      String fist = word.substring(0,1);
      // Store the rest of the string
      String rem = word.substring(1);
      // Call permutations() on rem and store the set it gives you
      Set<String> words = permutations(rem);
      // Loop through each permutation of rem
      for(String str : words) {
         System.out.printf("word = %s, words = %s\n", word, words);
      
         // Loop through each spot of the current word from rem 
         for(int i = 0; i <= str.length(); i++) {
            System.out.printf("adding to words %s with fist %s\n", words, fist);
            // Insert <code>init</code> at the current spot
            String toadd = rem.substring(0,i) + fist + rem.substring(i);
            // Add this permutation to our set of permutations.
            set.add(toadd);
         }
      }
      System.out.printf("word = %s, words = %s\n", word, words);
      return set;
      */
   }
}