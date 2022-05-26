package day10_loopReview;

public class SumofEvenNumber {

	public static void main(String[] args) {
		// Sum of Even Numbers from 1 to 100
		// for loop
		int a = 0;
		for (int i = 1; i < 101; i++) {
			if (i % 2 == 0) {
				a = a + i;
			}
		}
		System.out.println(a);

		System.out.println("----");

		// while loop
		int b = 0;
		int i = 1;
		while (i < 101) {
			if (i % 2 == 0) {
				b += i;
			}
			i++;
		}
		System.out.println(b);

	}
}
