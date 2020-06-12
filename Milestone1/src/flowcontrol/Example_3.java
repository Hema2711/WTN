package flowcontrol;

public class Example_3 {
	public static void main(String args[])
	{
		int a=args.length;
      if(a==0)
      {
    	  System.out.println("No Values");
      }
      else
      {
    	  System.out.print(args[0]);
    	  for(int i=1;i<a;i++)
    	  {
    		  System.out.print(","+args[i]);
    	  }
      }
	}
}
