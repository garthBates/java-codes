// comment
package com.skillstorm.data;
// public - anywhere with the application
// reverse domain name
// org.springframework.Student // fully-qualified class name
// com.skillstorm.Student

public class Student { // top-level class (public/default)

	// access modifier 
	// private - within this class ONLY
	private boolean enrolled;
	private int studentId; // default (no modifier) same package and subclasses in same package
	private String name; // same package and any subclasses 
	private char grade;
	private int age; // -11
	
	// validation belongs inside your beans 
	// JavaBeans - 1/ encapsulated 2/ no-argument constructor 3/ set/get naming convention
	public void setAge(int age) {
		if(age >= 0) {
			this.age = age;
		} // inform user of invalid input
	}
	
	public int getAge() {
		return age;
	}
	
	public boolean isEnrolled() {
		return enrolled;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	public void setEnrolled(boolean enrolled) {
		this.enrolled = enrolled;
	}
	
	
}
