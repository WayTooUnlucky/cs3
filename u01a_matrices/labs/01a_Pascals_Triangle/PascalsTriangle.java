//Â© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Arrays;

public class PascalsTriangle
{
	private int[][] mat;


	public PascalsTriangle(int size)
	{
      mat = new int[size][size];
      createTriangle();
	}

	public void createTriangle()
	{
      for(int row = 0; row < mat.length; row++)
         for(int col = 0; col <= row; col++) {
            if(col == 0)
               mat[row][col] = 1;
            else
               mat[row][col] = mat[row - 1][col] + mat[row - 1][col - 1];
         }
	}

	public String toString()
	{
		String output="";
      for(int r = 0; r < mat.length; r++) {
         for(int c = 0; c <= r; c++) {
            output += String.format("%-4d", mat[r][c]);
         }
         output += "\n";
      }
		return output;
	}
    int[][] mat2 = new int[3][2];
    public String test() {
      out.println(mat2);
      out.println(mat2.toString());
      out.println(Arrays.toString(mat2));
      out.println(Arrays.deepToString(mat2));
      return "";
    }
}

