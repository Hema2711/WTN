package com.wipro.classandobj;
import java.util.Scanner;
public class Patient {


	    public static void main(String[] args) {
	        computeBMI();
	    }

	    public static void computeBMI() {
	        Scanner sc = new Scanner(System.in);
	        double height, weight, BMI;
	        String s = "Mahendhar"; 
	        System.out.println("Patient name = " + s); 
	        System.out.print("Your height in m: ");
	        height = sc.nextDouble();
	        System.out.print("Your weight in kg: ");
	        weight = sc.nextDouble();
	        BMI = weight/(height*height);
	        System.out.println();
	        System.out.println("Your BMI is " + BMI);
	    }

}
