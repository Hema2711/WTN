package flowcontrol;

public class Example_15 {
public static void main(String args[])
{
	int x=Integer.parseInt(args[0]);
			int sum=0,n;
			for(;x!=0;)
			{
				n=x%10;
				sum=sum+n;
				x=x/10;
			}
			System.out.println(sum);
}
}
