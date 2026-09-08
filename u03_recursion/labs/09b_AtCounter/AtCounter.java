//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class AtCounter
{
   private char[][] atMat;
   private int atCount;
	public AtCounter() {
      atCount = 0;
		atMat = new char[][]{{'@','-','@','-','-','@','-','@','@','@'},
									{'@','@','@','-','@','@','-','@','-','@'},
									{'-','-','-','-','-','-','-','@','@','@'},
									{'-','@','@','@','@','@','-','@','-','@'},
									{'-','@','-','@','-','@','-','@','-','@'},
									{'@','@','@','@','@','@','-','@','@','@'},
									{'-','@','-','@','-','@','-','-','-','@'},
									{'-','@','@','@','-','@','-','-','-','-'},
									{'-','@','-','@','-','@','-','@','@','@'},
									{'-','@','@','@','@','@','-','@','@','@'}};
	}

	public void countAts(int r, int c) {

		//add in recursive code to count up the # of @s connected
		//start checking at spot [r,c]
      if(r >= 0 && r < atMat.length && c >= 0 && c < atMat[r].length && atMat[r][c] == '@') {
         atMat[r][c] = '#';
         atCount++;
         countAts(r + 1, c);
         countAts(r - 1, c);
         countAts(r, c + 1);
         countAts(r, c - 1);
      }

	}

   public void resetMat() {
      for(char[] charRay : atMat)
         for(int i = 0; i < charRay.length; i++)
            if(charRay[i] == '#')
               charRay[i] = '@';
      atCount = 0;
   }
	public String toString() {
		String output="";
		output+=atCount+" @s connected.";
		return output;
	}
}
