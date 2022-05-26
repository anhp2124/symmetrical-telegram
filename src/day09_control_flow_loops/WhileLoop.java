package day09_control_flow_loops;

public class WhileLoop {

	public static void main(String[] args) {
		/*
		 * while (condition) {
		 * 		run the code;
		 * }
		 * While is the same as if, but if checks condition only once time
		 */
		int i = 0;
		while (i < 5) {
			System.out.println(i);
			break;// put break here to run only once time...optional
		}

		System.out.println();

		int a = 0;
		while (a < 5) {
			System.out.println(a);
			a++;// a++ = a+1...each time it runs, value of a increases by 1 until meeting the
				// condition
		}

		System.out.println();

		int x = 10;
		int y = 20;
		while (x < y) {
			System.out.println("value of x: " + x);
			x++;
		}

		System.out.println();

		// if (condition) {your statement}
		// while (condition) {your statement}
		int count = 0;
		while (true) {
			System.out.println("Hello cohort 11");
			if (count == 5) {
				break;
			}
			count++;
		}
	}

}
