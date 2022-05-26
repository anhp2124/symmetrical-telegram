package day14_StringReview;

public class Reverse {

	public static void main(String[] args) {
		/*
		 * Create a class called Reverse, write a program that will reverse a string.
		 * Your program should reverse a string only 5 characters long. If word is
		 * shorter, display message: "Too short!". If word is longer, display message:
		 * "Too long!". Otherwise, reverse this word and print out result into the
		 * console.
		 */
		String input = "abcde";
		if (input.length() > 5) {
			System.out.println("Too long!");
		} else if (input.length() < 5) {
			System.out.println("Too short!");
		} else {
			for (int i = input.length() - 1; i >= 0; i--) {
				System.out.print(input.charAt(i));
			}
		}
	}
}
