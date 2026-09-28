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
      for(int i = 0; i < word.length(); i++)
         if(vowels.indexOf(word.substring(i,i+1)) != -1)
            vowelCount++;
		return vowelCount;
	}

	public int compareTo(VowelWord other)
	{
      int comp = numVowels() - other.numVowels();
		if(comp == 0)
         comp = word.compareTo(other.word);
      return comp;
	}

	public String toString()
	{
		return word;
	}
}