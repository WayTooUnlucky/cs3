//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class Class
{
	private String name;
	private Student[] studentList;
	
	public Class()
	{
		name="";
		studentList=new Student[0];
	}
	
	public Class(String name, int stuCount)
	{
      this.name = name;
      studentList = new Student[stuCount];
	}
	
	public void addStudent(int stuNum, Student s)
	{
      studentList[stuNum] = s;
	}
	
	public void sort()
	{
		Arrays.sort(studentList);
	}
	
	public String getClassName()
	{
	   return name;	
	}
	
	public double getClassAverage()
	{
		double classAverage=0.0;
      for(Student student : studentList) {
        if(student == null)
          continue;
        classAverage += student.getAverage();
      }
		return classAverage/studentList.length;
	}
	
	public double getStudentAverage(int stuNum)
	{
		return studentList[stuNum].getAverage();
	}

	public double getStudentAverage(String stuName)
	{
      for(Student student : studentList)
         if(student == null)
            continue;
         else if(student.getName().equals(stuName))
            return student.getAverage();
		return 0.0;
	}
	
	public String getStudentName(int stuNum)
	{
		return studentList[stuNum].getName();
	}

	public String getStudentWithHighestAverage()
	{
      Student highestStu = new Student("none", "1 - " + Double.MIN_VALUE);
      for(Student stu : studentList)
         if(stu.getAverage() > highestStu.getAverage())
            highestStu = stu;
		return highestStu.getName();
	}

	public String getStudentWithLowestAverage()
	{
      Student lowestStu = new Student("none", "1 - " + Double.MAX_VALUE);
      for(Student stu : studentList)
         if(stu.getAverage() < lowestStu.getAverage())
            lowestStu = stu;
		return lowestStu.getName();
	}
	
	public String getFailureList(double failingGrade)
	{
		String output="";
      for(Student stu : studentList)
         if(stu.getAverage() < failingGrade)
            output += stu.getName() + " ";
		return output;
	}
	
	public String toString()
	{
		String output=""+getClassName()+"\n";
      for(Student stu : studentList)
         output += stu + "\t" + stu.getAverage() + "\n";
		return output;
	}  	
}