package day06_controlFlow;

import java.util.Scanner;

public class IfStatementpractice {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		System.out.println("Input Temperature:");

		int temp = t.nextInt();

		if (temp <= 90) {
			System.out.println("Brrr!");
		}
		if (temp > 90 && temp <= 95) {
			System.out.println("Lukewarm");
		}
		if (temp >= 95 && temp <= 105) {
			System.out.println("Perfect");
		}
		if (temp > 105 && temp <= 110) {
			System.out.println("Not a hottub");
		}
		if (temp > 110) {
			System.out.println("Trying to boil a lobster");
		}

		t.close();

	}

}
