package day05_operatorII;

import java.util.Scanner;

public class ScannerObjectPractice {

	public static void main(String[] args) {
		
		Scanner S = new Scanner(System.in);
		
		System.out.println("Input value a");
		//int a = 1;
		int a = S.nextInt();
		
		System.out.println("Input value b");
		//int b = 2;
		int b = S.nextInt();
		
		System.out.println("Input value c");
		//int c = 3;
		int c = S.nextInt();
		
		System.out.println(a+b > c);
		
		S.close();
		
		
		
	}

}
