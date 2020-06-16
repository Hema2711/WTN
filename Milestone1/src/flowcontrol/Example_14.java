package flowcontrol;

public class Example_14 {
public static void main(String[] args) {
	int num=Integer.parseInt(args[0]);
	int i,m=0;
	boolean flag = false;
	m=num/2;
	if(num==0||num==1)
		System.out.println(num+" is neither prime nor composite");
	else
	{
		for(i=2;i<=m;i++) 
		{
			if(num%i==0)
			{
			System.out.println(num+" is not a prime number");
			flag=true;
			break;
			}
		}
		if(flag==false)
		{
			System.out.println(num+" is a prime number");
		}
	}
}
}
