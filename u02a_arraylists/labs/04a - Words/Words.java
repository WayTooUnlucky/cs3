//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;
import java.util.List;

class Words
{
	private ArrayList<Word> words;

	public Words()
	{
		setWords("");
	}

	public Words(String wordList)
	{
      setWords(wordList);
	}

   public List<Word> getWords() {
      return (List<Word>)Collections.unmodifiableList(words);
   }
	public void setWords(String wordList)
	{
      if(wordList == null)
         throw new NullPointerException("wordList can not be null");
      
      String[] strings = wordList.split(", |,| ");
      words = new ArrayList<>(strings.length);
      for(String word: strings)
         words.add(new Word(word));
	}
	
	public int countWordsWithXChars(int size)
	{
		int count=0;
      for(Word word : words)
         if(word.getLength() == size)
            count++; 
		return count;
	}
	
	public void removeWordsWithXChars(int size)
	{
      for(int i = 0; i < words.size(); )
         if(words.get(i).getLength() == size)
            words.remove(i);
         else
            i++;
	}

	public int countWordsWithXVowels(int numVowels)
	{
		int count=0;
      for(Word word: words)
         if(word.getNumVowels() == numVowels)
            count++;
		return count;
	}
	
	public String toString()
	{
      String output = "" + words;
	   return output;
	}
}
