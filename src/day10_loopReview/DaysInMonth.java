package day10_loopReview;

public class DaysInMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month = 2;
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			System.out.println("31 days a month");
		} else if (month == 2) {
			System.out.println("Either 28 or 29 days");
		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
			System.out.println("30 days a month");
		} else {
			System.out.println("Invalid Number");
		}

		// boolean statement
		boolean has30days = (month == 4 || month == 6 || month == 9 || month == 11) ? true : false;
		boolean has31days = (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10
				|| month == 12) ? true : false;
		boolean has28days = (month == 2) ? true : false;
		if (has30days) {
			System.out.println("Has 30 days");
		}
		if (has31days) {
			System.out.println("Has 31 days");
		}
		if (has28days) {
			System.out.println("Has 28 or 29 days");
		}
	}

}
