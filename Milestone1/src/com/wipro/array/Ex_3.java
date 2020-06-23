package com.wipro.array;
import java.util.Scanner;
public class Ex_3 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		
		int i,found=0;
		int[] a=new int[size];
		for(i=0;i<size;i++)
			a[i]=sc.nextInt();
		int find=sc.nextInt();
		
		for(i=0;i<size;i++) {
			if(a[i]==find) {
				found=1;
			break;
			}
			}
		if(found==0)
			System.out.println("-1");
		if(found==1)
			System.out.println(i);
	}
}
