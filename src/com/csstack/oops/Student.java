package com.csstack.oops;
/**
 *  A class is a blueprint from which individual objects are created.
 *  Sample Student Class java program
 * How to create objects?
 *  Student student = new Student("My name","Grade1");
 **/

public class Student {

	String grade ;
	String studentName ;

	public Student(String studentName, String grade){            
		this.studentName = studentName ;
		this.grade = grade ;
	}
	public String getGrade()
	{
		return grade;
	}
	public void setGrade(String gradeName)
	{
		this.grade = gradeName;
	}
	public String getStudentName()
	{
		return studentName;
	}
	public void setStudentName(String studentName)
	{
		this.studentName = studentName;
	}
	
	public static void main(String str[]) {
		
		Student student = new Student("Student1", "7th") ;
		
		System.out.println("Student Name " + student.getStudentName());
		System.out.print("Student Grade " + student.getGrade());
		
	}
}