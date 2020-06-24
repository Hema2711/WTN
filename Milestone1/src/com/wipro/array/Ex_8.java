package com.wipro.array;
import java.util.Scanner;
public class Ex_8 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int size=sc.nextInt();
	int[] a=new int[size];
	int i,p=0,q=0,sum=0;
	for(i=0;i<size;i++)
	{
		a[i]=sc.nextInt();
	}
	for(i=0;i<size;i++)
	{
		if(a[i]==6)
		{
			p=i;
			break;
		}
	}
	for(i=0;i<size;i++)
	{
		if(a[i]==7)
		{
			q=i;
			break;
		}
	}
	if(p<q)
	{
		for(i=0;i<p;i++)
			sum=sum+a[i];
		for(i=q+1;i<size;i++)
			sum=sum+a[i];
	}
	else
	{
		for(i=0;i<size;i++)
			sum=sum+a[i];
	}
	System.out.println(sum);
}
}
