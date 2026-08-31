//Â© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class MagicSquare
{
	private int[][] magicSquare;

	public MagicSquare()
	{
		setSize(0);
	}

	public MagicSquare(int size)
	{
      setSize(size);
	}
	
	public void setSize(int size)
	{
      magicSquare = new int[size][size];
      createMagic();
	}

	public void createMagic()
	{
		int num = 1;
		magicSquare[0][magicSquare.length/2]= num;
      int size = magicSquare.length;
      
      int r = 0;
      int c = magicSquare.length / 2;
      while(num < size * size) {
         r--;
         c++;
         num++;
         
         if(r < 0)
            r = size - 1;
         if(c > size - 1)
            c = 0;
            
         if(magicSquare[r][c] != 0) {
            r++;
            if(r > size - 1)
               r = 0;
            c--;
            if(c < 0)
               c = size - 1;
            r++;
         }
         magicSquare[r][c] = num;
      }
         
	}
   

	public String toString( )
	{
		String output="";
      for(int r = 0; r < magicSquare.length; r++) {
         for(int c = 0; c < magicSquare[r].length; c++)
            output += magicSquare[r][c] + "\t";
         output += "\n";
      }
		return output;
	}
}

