//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;
import java.io.File;

public class GradeBookRunner
{
   public static void main( String args[] ) throws Exception
   {
      //file input
   
		out.println("Welcome to the Class Stats program!\n");
		
		Scanner file = new Scanner(new File("gradebook.dat"));
		
      String className = file.nextLine();
      int numStudents = file.nextInt();
      file.nextLine();
      Class cls = new Class(className, numStudents);
      for(int i = 0; i < numStudents; i++) {
         String stuName = file.nextLine();
         String gradesList = file.nextLine();
         cls.addStudent(i, new Student(stuName, gradesList));
      }
      
      out.println(cls);
      out.printf("""
      Failure List = %s
      Highest Average = %s
      Lowest Average = %s
      Class Average = %.5f
      """ , cls.getFailureList(70), cls.getStudentWithHighestAverage(), 
            cls.getStudentWithLowestAverage(), cls.getClassAverage());
		
      //user input
      //reuses variables from file input
      out.println();
      
      Scanner scan = new Scanner(in);
      out.println("Welcome to the Class Stats program!\n");
      out.print("What is the name of this class? ");
      className = scan.nextLine();
      out.print("\nHow many students are in this class? ");
      numStudents = scan.nextInt();
      scan.nextLine();
      out.println();
      cls = new Class(className, numStudents);
      for(int i = 0; i < numStudents; i++) {
         out.printf("Enter the name of student %d : ", i + 1);
         String stuName = scan.nextLine();
         out.printf("Enter the grades for %s\nUse the format x - grades (2 - 100 100) : ", stuName);
         String gradesList = scan.nextLine();
         out.println();
         cls.addStudent(i, new Student(stuName, gradesList));
      }
		
      out.println(cls);
      out.printf("""
      Failure List = %s
      Highest Average = %s
      Lowest Average = %s
      Class Average = %f
      """ , cls.getFailureList(70), cls.getStudentWithHighestAverage(), 
            cls.getStudentWithLowestAverage(), cls.getClassAverage());
	}		
}