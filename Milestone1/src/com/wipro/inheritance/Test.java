package com.wipro.inheritance;

public class Test {
public static void main(String[] args) {
CollegeStudent c=new CollegeStudent();
Teacher t=new Teacher();
System.out.println("Name of the Student: "+t.name);
System.out.println("Student Idno : "+c.Student_id);
System.out.println("College name of the Student : "+c.college_name);
System.out.println("Joining year of a Student : "+c.year);
System.out.println("Name of the Teacher : "+t.name1);
System.out.println("Teacher DOB : "+t.dob1);
System.out.println("Teacher Salary: "+t.salary);
System.out.println("Subject taught by the Teacher: "+t.subject);
}
}
class Person
{
String name="Hema Palvadi";
}
class Teacher extends Person
{
	String name1="Anitha";
	String dob1="September 11th 1989";
	double salary=40000;
	String subject="Telugu";
}
class Student extends Person
{
	String Student_id="170040654";
}
class CollegeStudent extends Student
{
	String college_name="Klu";
	String year="Fourth";
}