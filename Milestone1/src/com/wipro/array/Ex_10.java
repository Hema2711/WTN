package com.wipro.array;

public class Ex_10 {
	public static void main(String[] args) {
		int[][]a=new int[3][3];
		int max=0;
		if(args.length<9)
			System.out.println("Please enter 9 integer numbers");
		else
		{
			for(int i=0;i<3;i++)
			{
		for(int j=0;j<3;j++)
		{
			a[i][j]=Integer.parseInt(args[3*i+j]);
			
		}
		
	}	
	System.out.println("The given array is: ");
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			System.out.print(a[i][j]+ " ");
		}
		System.out.println(" ");
	}
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			if(a[i][j]>max)
				max=a[i][j];
		}
	}
	System.out.println("The biggest number in the given array is "+ max);
	}
}
}
