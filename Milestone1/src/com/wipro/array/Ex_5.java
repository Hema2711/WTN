package com.wipro.array;
import java.util.Scanner;
public class Ex_5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int i,temp=0,j;
		int[] a=new int[size];
		for(i=0;i<size;i++)
			a[i]=sc.nextInt();
		for(i=0;i<size;i++)
		{
			for(j=i+1;j<size;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Maximum element of given array is "+ a[a.length-1]);
		System.out.println("Second maximum element of given array is "+ a[a.length-2]);
		System.out.println("Minimum element of given array is "+ a[0]);
		System.out.println("Second minimum element of given array is "+ a[1]);
	}

}
