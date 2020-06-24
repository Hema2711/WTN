package com.wipro.classandobj;

public class Calci {
public static void main(String[] args) {
	System.out.println(Calculator.powerInt(10,20));
	System.out.println(Calculator.powerDouble(10.9,20));
}
}
class Calculator{
	static double powerInt(int num1,int num2)
	{
		return Math.pow(num1,num2);
	}
	static double powerDouble(double num1,int num2)
	{
		return Math.pow(num1,num2);
	}
}

