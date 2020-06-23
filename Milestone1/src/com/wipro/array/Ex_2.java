package com.wipro.array;
import java.util.Scanner;
public class Ex_2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int size=sc.nextInt();
	int i,maximum=0,minimum=0;
	int[] a=new int[size];
	for(i=0;i<size;i++)
		a[i]=sc.nextInt();
	maximum=a[0];
	minimum=a[0];
	for(i=0;i<size;i++)
	{
		if(a[i]>maximum)
			maximum=a[i];
		if(a[i]<minimum)
			minimum=a[i];
	}
	System.out.println("Maximum element of given array is "+ maximum);
	System.out.println("Minimum element of given array is "+ minimum);
}
}
