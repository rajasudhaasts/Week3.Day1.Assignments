package org.student;

import org.department.Department;

public class Student extends Department {
	public void studentName()
	{
		System.out.println("Sudha");
	}


	public static void main(String[] args) {
		
	Student stud = new Student ();
	stud.collegeName();
	stud.collegeCode();
	stud.collegeRank();
	stud.deptName();
	stud.studentName();
	
	
}
}