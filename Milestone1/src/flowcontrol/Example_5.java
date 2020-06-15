package flowcontrol;

public class Example_5 {
	public static void main(String[] args) {
		String x=args[0];
	char a=x.charAt(0);
	if((a>=65&&a<=90)||(a>=97&&a<=122))
		System.out.println("Alphabet");
	else if(a>=48&&a<=57)
		System.out.println("Digit");
	else 
		System.out.println("Special Character");
		
	}

}
