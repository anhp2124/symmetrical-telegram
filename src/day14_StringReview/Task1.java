package day14_StringReview;

public class Task1 {

	public static void main(String[] args) {
		/*
		 * write a program that asks user to enter a sentence. then print the first &
		 * last characters of the sentence Example: Input: Welcome To TechCircle // output: We
		 */
		String input = "Welcome to TechCircle";
		System.out.print(input.charAt(0));
		System.out.print(input.charAt(input.length()-1));

	}

}
