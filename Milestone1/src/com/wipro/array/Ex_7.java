package com.wipro.array;
import java.util.Scanner;
public class Ex_7 {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int size=sc.nextInt();
	int i,j,k,temp=0;
	int[] a=new int[size];
	for(i=0;i<size;i++)
		a[i]=sc.nextInt();
	for(i=0;i<size;i++)
	{
		for(j=i+1;j<size;j++)
		{
			if(a[i]==a[j])
			{
				for(k=j;k<size-1;k++)
					a[k]=a[k+1];
				size--;
			    j--;
	     	}	
         }
     }
       for(i=0;i<size;i++)
         System.out.print(a[i] + " ");
}
}

