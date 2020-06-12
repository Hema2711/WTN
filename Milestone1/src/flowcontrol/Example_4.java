package flowcontrol;

public class Example_4 {
public static void main(String args[])
{
	char x,y;
	x=args[0].charAt(0);
	y=args[1].charAt(0);
	if(x<y)
	{
	  System.out.println(args[0]+","+args[1]);
	}
	else
	{
		System.out.println(args[1]+","+args[0]);
	}
}
}
