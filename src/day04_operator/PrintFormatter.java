package day04_operator;

public class PrintFormatter {

	public static void main(String[] args) {
		//%s = string, %b = boolean, %d = digit, %f = float
		System.out.printf("Hello My name is %s", "A");
		System.out.println();//go to a new line
		System.out.printf("%s My name is %s", "Bonjour", "A");
		System.out.println();
		System.out.printf("Is today sunny? %b", false);
		System.out.println();
		System.out.printf("Price is %.3f cheaper",4.35);//format 3 decimal posn
	}

}
