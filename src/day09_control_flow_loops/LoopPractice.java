package day09_control_flow_loops;

public class LoopPractice {

	public static void main(String[] args) {
		// Task 1
		for (int i = 20; i < 31; i++) {
			System.out.println(i);
		}
		System.out.println("-----");
		int i = 20;
		while (i < 31) {
			System.out.println(i);
			i++;
		}
		System.out.println("-----");
		int a = 20;
		do {
			System.out.println(a);
			a++;
		}
			while (a < 31);
		
		//Task 2 - sum of 1 to 100
		int sum = 0;
		for (int x = 1; x < 101; x++) {
			//System.out.println(x);
			sum = sum + x;
		}
		System.out.println(sum);
		
	}

}
