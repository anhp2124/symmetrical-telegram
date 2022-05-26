package day14_StringReview;

public class Task4 {

	public static void main(String[] args) {
		/*
		 * write a program that can check if the first and last characters of the string
		 * are same ex: level // output: same
		 */
		String str = "level";
		if (str.charAt(0) == str.charAt(str.length() - 1)) {
			System.out.println("same");
		}

	}

}
