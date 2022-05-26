package day10_loopReview;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5;
		for (int i = 1; i < 11; i++) {
			// System.out.println(num * i);
			int total = num * i;
			System.out.println(i + " x " + num + " = " + total);
			//System.out.printf(%d x %d = %d, i, num, num *i);
		}
	}

}
