package flowcontrol;

public class Example_16 {
public static void main(String[] args) {
	int i,j;
	int a=Integer.parseInt(args[0]);
	for(i=0;i<a;i++)
	{
		for(j=0;j<=i;j++)
		{
			System.out.print("* ");
		}
		System.out.println(" ");
	}
}
}
