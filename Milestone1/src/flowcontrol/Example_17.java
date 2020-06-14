package flowcontrol;

public class Example_17 {
public static void main(String[] args) {
	int a=Integer.parseInt(args[0]);
	int reverse=0,num;
	while(a!=0)
	{
		num=a%10;
		reverse=reverse*10+num;
		a=a/10;
	}
	System.out.println(reverse);
}
}
