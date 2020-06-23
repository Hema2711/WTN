package com.wipro.array;
import java.util.Scanner;
public class Ex_1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int i,sum=0,average=0;
		int[] a=new int[size];
		for(i=0;i<size;i++)
			a[i]=sc.nextInt();
		for(i=0;i<size;i++)
			sum=sum+a[i];
		average=sum/size;
		System.out.println("The sum of given array is "+ sum);
		System.out.println("The average of given array is "+ average);
		
	}
}
