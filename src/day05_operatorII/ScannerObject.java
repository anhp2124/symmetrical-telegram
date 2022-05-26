package day05_operatorII;

import java.util.Scanner;

public class ScannerObject {

	public static void main(String[] args) {
		// Create instance of scanner object s
		Scanner s = new Scanner(System.in);
		
		System.out.println("Input number A");//guide user to input number A to scanner object s created above
		int a = s.nextInt();
		
		System.out.println("Input number B");//guide user to input number B to scanner object s created above
		int b = s.nextInt();
		
		int result = a + b;
		System.out.println(result);
			
		s.close();//close the scanner 

	}

}
