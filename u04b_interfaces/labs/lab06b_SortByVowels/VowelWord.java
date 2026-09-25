//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

class VowelWord implements Comparable<VowelWord>
{
	//add a string instance variable
   private String word;
	
	//add a constructor
   public VowelWord(String word) {
      this.word = word;
   }

	private int numVowels()
	{
		String vowels = "AEIOUaeiou";
		int vowelCount=0;
		return vowelCount;
	}

	public int compareTo(VowelWord other)
	{
      int comp = other.numVowels() - this.numVowels();
		if(comp == 0)
         comp = word.compareTo(other.word);
      return -1;
	}

	public String toString()
	{
		return "";
	}
}