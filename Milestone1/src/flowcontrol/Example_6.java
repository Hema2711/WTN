package flowcontrol;

public class Example_6 {
	public static void main(String args[])
	{
		
		String gender=args[0];
		int a=Integer.parseInt(args[1]);
			if(gender.contentEquals("Female"));
			{
				if(a>0&&a<59)
				{
					System.out.println("The percentage of interset is 8.2%");
				}
				else
				{
					System.out.println("The percentage of interset is 9.2%");
				}
			}
			if(gender.contentEquals("Male"))
			{
				if(a>0&&a<59)
				{
					System.out.println("The percentage of interset is 8.4%");
				}
				else
				{
					System.out.println("The percentage of interset is 10.5%");
				}	
			}
	}

}
