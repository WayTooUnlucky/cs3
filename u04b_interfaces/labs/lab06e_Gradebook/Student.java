//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class Student implements Comparable<Student>
{
	private String myName;
	private Grades myGrades;
	
	public Student()
	{
		setName("");
		setGrades("");
	}
	
	public Student(String name, String gradeList)
	{
      setName(name);
      setGrades(gradeList);
	}
	
	public void setName(String name)
	{
      if(name == null)
         throw new IllegalArgumentException("name cant be null");
      myName = name;
	}	
	
	public void setGrades(String gradeList)
	{
      myGrades = new Grades(gradeList);
	}
	
	public void setGrade(int spot, double grade)
	{
      myGrades.setGrade(spot, grade);
	}

	public String getName()
	{
		return myName;
	}
	
	public int getNumGrades()
	{
		return myGrades.getNumGrades();
	}

	public double getSum()
	{
		return myGrades.getSum();
	}
	
	public double getAverage()
	{
		return getSum()/getNumGrades();
	}

	public double getAverageMinusLow()
	{
		return (getSum() - getLowGrade());
	}
	
	public double getHighGrade()
	{
		return getHighGrade();		
	}
	
	public double getLowGrade()
	{
		return getLowGrade();	
	}

	public int compareTo(Student param)
	{
      int comp = (int)(getAverage() - param.getAverage());
      if(comp > 0)
         return 1;
      if(comp < 0)
         return -1;
		return comp;
	}
	
	public boolean equals(Object obj)
	{
		return false;
	}
	
	public String toString()
	{
		return "";
	}	
}