package day06_controlFlow;

import java.util.Scanner;

public class AgePractice {

	public static void main(String[] args) {

		String name = "James";
		int age = 19;
		String message = name + " is eligible to buy alcohol";

		boolean isEligible = age >= 21;
		System.out.println(message);
		System.out.println(isEligible);

		System.out.println();

		if (age >= 21) {
			System.out.println(name + " is eligible to buy alcohol");
			System.out.println(true);
		} else {
			System.out.println(name + " is eligible to buy alcohol");
			System.out.println(false);
		}

		System.out.println();

		Scanner s = new Scanner(System.in);
		System.out.println("Input your age:");
		int a = s.nextInt();
		var age1 = (a >= 21) ? true : false;
		System.out.println(message);
		System.out.println(age1);
	}

}
