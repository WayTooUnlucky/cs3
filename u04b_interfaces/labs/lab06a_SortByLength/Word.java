//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Word implements Comparable<Word>
{
	//add an instance variable and a constructor
   private String word;
   public Word(String string) {word = string;}

	//add a compareTo
   public int compareTo(Word other) {
      int comp = word.length() - other.word.length();
      if(comp == 0)
         comp = word.compareTo(other.word);
      return comp;
   }
   
	//add a toString
   public String toString() {
      return word;
   }
}