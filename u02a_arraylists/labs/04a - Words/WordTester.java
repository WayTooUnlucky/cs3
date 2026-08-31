//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class WordTester
{
	public static void main(String[] args)
	{
		//add test cases
		Word word = new Word("chicken");
      out.println(word.lengthyToString());
		word.setWord("alligator");
      out.println(word.lengthyToString());
      word.setWord("elephant");
      out.println(word.lengthyToString());
		word.setWord("aksdhfjkhkLAfjdhaseuifhsj ah FKHE IADs hkasdjh");
      out.println(word.lengthyToString());
	}
}
