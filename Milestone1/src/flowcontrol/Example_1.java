package flowcontrol;

public class Example_1 {
	public static void main(String args[])
	{
		int a;
		a=Integer.parseInt(args[0]);
		if(a>0)
		{
			System.out.println("Positive");
		}
		else if(a<0)
		{
			System.out.println("negative");
		}
		else
		{
			System.out.println("Zero");
		}
	}

}
