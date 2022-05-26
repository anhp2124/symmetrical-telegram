package day14_StringReview;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		/*
		 * write a program that asks user to enter two strings, and print out the
		 * longest string
		 */
		Scanner s = new Scanner(System.in);

		System.out.println("Input String 1");
		String str1 = s.next();

		System.out.println("Input String 2");
		String str2 = s.next();

		if (str1.length() > str2.length()) {
			System.out.println(str1);
		} else {
			System.out.println(str2);
		}

	}

}
