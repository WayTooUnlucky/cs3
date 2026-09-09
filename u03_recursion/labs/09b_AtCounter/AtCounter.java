//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.ArrayList;

public class AtCounter
{
   private char[][] atMat;
   private int atCount;
   private ArrayList<MatrixLocation> rayLoc;
   
	public AtCounter() {
      atCount = 0;
      rayLoc = new ArrayList<>();
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
      atCount = countAts1(r, c);
      resetMat();
	}
   
   private int countAts1(int r, int c) {
      if(r >= 0 && r < atMat.length && c >= 0 && c < atMat[r].length && atMat[r][c] == '@') {
         atMat[r][c] = '#';
         rayLoc.add(new MatrixLocation(r,c));
         return 1 + countAts1(r + 1, c) + countAts1(r - 1, c) + countAts1(r, c + 1) + countAts1(r, c - 1);
      }
      else
         return 0;
	}
   
   private record MatrixLocation(int r, int c) {}

   public void resetMat() {
      for(MatrixLocation loc : rayLoc)
         atMat[loc.r()][loc.c()] = '@';
      rayLoc.clear();
   }
	public String toString() {
		String output="";
		output+=atCount+" @s connected.";
		return output;
	}
}

