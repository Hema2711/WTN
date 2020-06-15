package flowcontrol;

public class Example_18 {
public static void main(String[] args) {
	int a=Integer.parseInt(args[0]);
	int num,sum=0,temp;
	temp=a;
	while(a!=0)
	{
		num=a%10;
		sum=(sum*10)+num;
		a=a/10;
	}
	if(temp==sum)
		System.out.println(sum +" is a palindrome");
	else
		System.out.println(sum +" is not a palindrome");
	
}
}
