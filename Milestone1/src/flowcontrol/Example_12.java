package flowcontrol;

public class Example_12 {
	public static void main(String args[])
	{
		int i;
		int num=Integer.parseInt(args[0]);
		boolean flag=true;
		for(i=2;i<=num;i++)
		{
			if(num%i==0)
			{
				flag = false;
				break;
			}	
		}
		if(flag)
			System.out.println(num+" is a prime number");
		else 
			System.out.println(num+" is not a prime number");
	}
}
