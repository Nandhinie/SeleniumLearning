package org.student;

import org.department.Department;

public class Student extends Department{
	public void studentName() {
		// TODO Auto-generated method stub
		System.out.println("Student Name : Nandhini");
	}
	public void studentDept() {
		// TODO Auto-generated method stub
		System.out.println("Student Department : CS");
	}
	public void studentId() {
		// TODO Auto-generated method stub
		System.out.println("Student Id : CS0054");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std=new Student();
		std.collegeName();
		std.collegeCode();
		std.collegeRank();
		std.deptName();
		std.studentName();
		std.studentDept();
		std.studentId();
	}

}
