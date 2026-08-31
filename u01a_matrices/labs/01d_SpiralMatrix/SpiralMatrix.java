//Â© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class SpiralMatrix
{
	//define a matrix
   int[][] mat;

	public SpiralMatrix()
	{
      setSize(0);
	}

	public SpiralMatrix(int size)
	{
      setSize(size);
      createSpiral();
	}
	
	public void setSize(int size)
	{
      mat = new int[size][size];
	}

	public void createSpiral()
	{
      int num = 1;
      int r = 0;
      int c = 0;
      int option = 0;
      
      mat[r][c] = num++;
      
      do {
         while(isValid(r + 1, c))
            mat[++r][c] = num++;
         
         while(isValid(r, c + 1))
            mat[r][++c] = num++;
         
         while(isValid(r - 1, c))
            mat[--r][c] = num++;
            
         while(isValid(r, c - 1))
            mat[r][--c] = num++;
      }
      while (num <= mat.length * mat.length);
      
	}
   
   private boolean isValid(int r, int c) {return isInBounds(r,c) && mat[r][c] == 0;}
   private boolean isInBounds(int r, int c) {
      return r > -1 && r < mat.length && c > -1 && c < mat[0].length;
   }

	public String toString( )
	{
		String output="";
      for(int r = 0; r < mat.length; r++) {
         for(int c = 0; c < mat[r].length; c++)
            output += String.format("%-5d", mat[r][c]);
         output += "\n";
      }
		return output;
	}
}

