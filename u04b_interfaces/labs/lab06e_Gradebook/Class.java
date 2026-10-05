//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;
import java.util.Collections;
import java.util.ArrayList;

public class Class
{
	private String name;
	private ArrayList<Student> studentList;
	
	public Class()
	{
		name="";
		studentList = new ArrayList<>();
	}
	
	public Class(String name, int stuCount)
	{
      this.name = name;
      studentList = new ArrayList<>();
      for(int i = 0; i < stuCount; i++)
         studentList.add(new Student());
	}
	
	public void addStudent(int stuNum, Student s)
	{
      studentList.set(stuNum, s);
	}
	
	public void sort()
	{
		Collections.sort(studentList);
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
		return classAverage/studentList.size();
	}
	
	public double getStudentAverage(int stuNum)
	{
		return studentList.get(stuNum).getAverage();
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
		return studentList.get(stuNum).getName();
	}

	public String getStudentWithHighestAverage()
	{
      Student highestStu = new Student("none", "1 - " + Double.MIN_VALUE);
      for(Student stu : studentList)
         if(highestStu.compareTo(stu) == 1)
            highestStu = stu;
		return highestStu.getName();
	}

	public String getStudentWithLowestAverage()
	{
      Student lowestStu = new Student("none", "1 - " + Double.MAX_VALUE);
      for(Student stu : studentList)
         if(lowestStu.compareTo(stu) == -1)
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
         output += stu + "\t" + String.format("%.2f", stu.getAverage()) + "\n";
		return output;
	}  	
}