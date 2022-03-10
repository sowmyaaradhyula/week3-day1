package org.student;

import org.department.Department;

public class Student extends Department {
	
	public void studentName()
	{
		System.out.println("this is student's name");
	}
	
	public void studentDept()
	{
		System.out.println("this is student's department");
	}
	
	public void studentId()
	{
		System.out.println("this is student's Id");
	}
	
	public static void main(String[] args) 
	
	{
		Student s1 = new Student();
		
		s1.collegeCode();
		s1.collegeName();
		s1.collegeRank();
		
		s1.deptName();
		
		s1.studentName();
		s1.studentId();
		s1.studentDept();
		
	}

}
