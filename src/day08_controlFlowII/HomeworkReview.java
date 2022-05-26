package day08_controlFlowII;

import java.util.Scanner;

public class HomeworkReview {

	public static void main(String[] args) {
		// Find largest number: n1=4.5,n2=-3,n3=10
		double n1 = 4.5;
		double n2 = -3;
		double n3 = 10;
		if (n1 > n2 && n1 > n3) {
			System.out.println("n1 is the largest number");
		}
		if (n2 > n1 && n2 > n3) {
			System.out.println("n2 is the largest number");
		}
		if (n3 > n1 && n3 > n2) {
			System.out.println("n3 is the largest number");
		}
		
		//Calculator:
		Scanner s = new Scanner(System.in);
		System.out.println("Input number 1");
		double a1 = s.nextDouble();
		System.out.println("Input number 2");
		double a2 = s.nextDouble();
		System.out.println("Operator:");
		String a3 = s.next();
		double result = 0;
		if (a3.equals("+")) {
			System.out.println(result = a1+a2);
		}
		if (a3.equals("-")) {
			System.out.println(result = a1-a2);
		}
		if (a3.equals("*")) {
			System.out.println(result = a1*a2);
		}
		if (a3.equals("/")) {
			System.out.println(result = a1/a2);
		}
		s.close();
		
		/*double num1 = 5; double num2=10; double total = 0;
		String op = "*";
		if(op.equals("*")) {
			System.out.println(total = num1 * num2);
		}*/	
		
	}
	}