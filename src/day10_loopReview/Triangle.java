package day10_loopReview;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 90;
		int b = 45;
		int c = 50;
		if (a + b + c == 180) {
			System.out.println("ABC is a triangle");
		} else {
			System.out.println("Sum of A,B,C must be equal to 180 degrees");
		}
		
		System.out.println("-----");
		
		// boolean
		boolean degrees = (a + b + c == 180) ? true : false;
		if (degrees) {
			System.out.println("ABC is a triangle");
		} else {
			System.out.println("ABC is not a triangle");
		}
	}

}
