package day06_controlFlow;

public class NestedIf {

	public static void main(String[] args) {

		double minimumSalary = 25000;
		int jobHistory = 15;
		int creditScore = 750;

		if (minimumSalary >= 30000) {
			if (jobHistory >= 2) {
				if (creditScore >= 680) {
					System.out.println("You're qualified for loan");
				} else {
					System.out.println("You must have at least 680");
				}
			} else {
				System.out.println("You must be on job for at least 2 years");
			}
		} else {
			System.out.println("You must have a minimum salary of 30000");
		}
	}
}
