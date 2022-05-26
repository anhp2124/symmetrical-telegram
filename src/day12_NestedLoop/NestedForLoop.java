package day12_NestedLoop;

public class NestedForLoop {

	public static void main(String[] args) {
		/*SYNTRAX: 
		 * for ( initialization; condition; increment ) {
		 * 	for ( initialization; condition; increment ) {
		 * 		// statement of inside loop 
		 * 	} 
		 * 	// statement of outer loop
		 * }
		 */

		// I want to count 1 to 10 five times
//		for (int i = 1; i <= 10; i++) {
//			System.out.println(i);
//		}
//		for (int i = 1; i <= 10; i++) {
//			System.out.println(i);
//		}
//		for (int i = 1; i <= 10; i++) {
//			System.out.println(i);
//		}
//		for (int i = 1; i <= 10; i++) {
//			System.out.println(i);
//		}
//		for (int i = 1; i <= 10; i++) {
//			System.out.println(i);
//		}

		for (int j = 1; j < 6; j++) {
			// System.out.println(j);
			for (int i = 1; i <= 10; i++) {
				System.out.println(i);
			}
		}

	}

}
