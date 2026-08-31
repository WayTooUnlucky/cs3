import java.io.*;
import java.util.Scanner;
import static java.lang.System.*;

public class MatrixRotation
{
	/* Declare instance fields here */
   char[][] mat;
   String fileName;

	public static void main(String[] args) throws FileNotFoundException
	{
		MatrixRotation lab = new MatrixRotation();
		while (lab.input()) 	// fill the matrix from a data file
		{
        lab.regular( );       // display the matrix
        lab.upsideDown();     // display the matrix upside down
        lab.right90();        // Rotate the matrix right 90Â°
        lab.left90();         // Rotate the matrix left 90Â°
        lab.mirror();         // flip the image as in a mirror
        lab.doubleInverted(); // Upside down and mirrored
		}
	}
	
    private void pause() {
        System.out.print("\nPress ENTER to continue...");
        (new java.util.Scanner(System.in)).nextLine();
    }

	/* Write the input() method here */
   private boolean input() throws FileNotFoundException
   {
      Scanner scan = new Scanner(System.in);
      out.print("Enter STOP to stop. Enter name of data file here :: ");
      String nextFile = "";
      if(scan.hasNextLine())
          nextFile = scan.nextLine();
      
      if(nextFile.equalsIgnoreCase("STOP") || nextFile.equals("")) {
         out.print("Execution stopped.");
         stop();
      }
         
      if((new File(nextFile)).exists() || (new File(nextFile += ".dat")).exists())
         out.printf("File name recieved: %s\n", loadFile(nextFile));
      else {
         out.println("File not found. Stopping program.");
         stop();
      }
      return true;
   }
   
   private void stop() {
      System.exit(0);
   }
   private String loadFile(String newFileName) throws FileNotFoundException
   {
      fileName = newFileName;
      File file = new File(fileName);
      
      Scanner scan = new Scanner(new File(fileName));
      int cols = scan.nextInt();
      int rows = scan.nextInt();
      scan.nextLine();
      
      mat = new char[rows][cols];
      for(int r = 0; r < rows; r++) {
         String nextLine = scan.nextLine();
         for(int c = 0; c < cols; c++)
            mat[r][c] = nextLine.charAt(c);
      }
      
      scan.close();
      return fileName;
         
   }
   private void regular() {
      String output = "";
      for(int r = 0; r < mat.length; r++) {
         for(int c = 0; c < mat[r].length; c++)
            output += mat[r][c];
         output += "\n";
      }
      advance("Regular", output);
   }
   private void upsideDown() {
      String output = "";
      for(int r = mat.length - 1; r > -1; r--) {
         for(int c = 0; c < mat[r].length; c++)
            output += mat[r][c];
         output += "\n";
      }
      advance("Upside Down", output);
   }
   private void right90() {
      String output = "";
      for(int c = 0; c < mat[0].length; c++) {
         for(int r = mat.length - 1; r > -1; r--)
            output += mat[r][c];
         output += "\n";
      }
      advance("Right 90", output);
   }
   private void left90() {
      String output = "";
      for(int c = mat[0].length - 1; c > -1; c--) {
         for(int r = 0; r < mat.length; r++)
            output += mat[r][c];
         output += "\n";
      }
      advance("Left 90", output);
   }
   private void mirror() {
      String output = "";
      for(int r = 0; r < mat.length; r++) {
         for(int c = mat[r].length - 1; c > -1; c--)
            output += mat[r][c];
         output += "\n";
      }
      advance("Mirror", output);
    }
    /* Write the doubleInverted() method here */
    private void doubleInverted() {
      String output = "";
      for(int r = mat.length - 1; r > -1; r--) {
         for(int c = mat[r].length - 1; c > -1; c--)
            output += mat[r][c];
         output += "\n";
      }
      advance("Double Inverted", output);
    }
	
   private void advance(String name, String input) {
      String output = name + ":\n\n" + input;
      printString(output);
      pause();
   }
   private void printString(String output) {System.out.println(output);}
}

