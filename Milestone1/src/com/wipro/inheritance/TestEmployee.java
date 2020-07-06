package com.wipro.inheritance;

public class TestEmployee {
public static void main(String[] args) {
	Employee e=new Employee(2020,"QQ123456C");
			e.setAnnual();
			System.out.println("Name of the Employee :"+e.name);
			System.out.println("Employee Annual income :"+e.getAnnual());
			System.out.println("Employee joined in the year :"+e.getYear());
			System.out.println("Employee National insurance number :"+e.getInsurance_number());			
}
}
class Person
{
	String name="Hema Palvadi";
}
class Employee extends Person
{
	double annual;
    int year;
	String insurance_number;
	Employee(int yr,String in)
	{
		year=yr;
		insurance_number=in;
	}
	public void setAnnual()
	{
		annual=900000;
	}
	public double getAnnual()
	{
		return annual;
	}
	public int getYear()
	{
		return year;
	}
	public String getInsurance_number()
	{
		return insurance_number;
	}
	
}
