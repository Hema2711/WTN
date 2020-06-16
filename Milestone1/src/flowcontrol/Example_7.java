package flowcontrol;

public class Example_7 {
public static void main(String[] args) {
	char character=args[0].charAt(0);
	if(character>='A'&&character<='Z')
		System.out.println(character+"->"+args[0].toLowerCase());
	else
		System.out.println(character+"->"+args[0].toUpperCase());
}
}
