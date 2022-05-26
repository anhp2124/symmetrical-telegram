package day09_control_flow_loops;

public class DoWhileLoop {

	public static void main(String[] args) {
		/*do...while loop vs while loop:
		 * do...while: run the code first then check condition//even condition false it still run the code once time
		 * while: check condition first then run the code*/
		
		//do {
		//	  run the code;
		//} while (condition is true);
		
		int i = 0;
		do {
			System.out.println(i);
			i++;
		}
		while (i < 5);
		
		System.out.println();
		
		do {
			System.out.println("Hello cohort 11");
		}while (false);
		
		System.out.println();
		
		int a = 10;
		do {
			System.out.println(a);
			a--;
		}while (a > 1);
	}

}
