//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;
import java.util.ArrayList;

public class Grades
{
	private ArrayList<Double> grades;
	
	public Grades()
	{
		setGrades("");
	}
	
	public Grades(String gradeList)
	{
		setGrades(gradeList);		
	}
	
	public void setGrades(String gradeList)
	{
      if(gradeList == null)
         throw new IllegalArgumentException("gradeList has to exist");
      if(gradeList.length() == 0)
         gradeList = "1 - " + Double.MIN_VALUE;
      Scanner scan = new Scanner(gradeList);
      grades = new ArrayList<>();
      int length = scan.nextInt();
      scan.next();
      for(int i = 0; i < length; i++)
         if(scan.hasNextDouble())
            grades.add(scan.nextDouble());
         else
            grades.add(0.0);
	}
	
	public void setGrade(int spot, double grade)
	{
      if(spot < 0 || spot >= grades.size())
         throw new IllegalArgumentException("spot must be in bounds");
      grades.set(spot, grade);
	}
	
	public double getSum()
	{
		double sum=0.0;
      for(double grade : grades)
         sum += grade;
		return sum;
	}
	
	public double getLowGrade()
	{
		double low = Double.MAX_VALUE;
      for(double grade : grades)
         if(grade < low)
            low = grade;
		return low;
	}
	
	public double getHighGrade()
	{
		double high = Double.MIN_VALUE;
      for(double grade : grades)
         if(grade > high)
            high = grade;
		return high;
	}
	
	public int getNumGrades()
	{
		return grades.size();
	}
	
	public String toString()
	{
		String output="";
      for(double grade : grades)
         output += grade + " ";
		return output;
	}	
}