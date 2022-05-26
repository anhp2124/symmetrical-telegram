package day09_control_flow_loops;

public class ForLoop {

	public static void main(String[] args) {
		/*for (statement 1; statement 2; statement 3) {
  			code block to be executed;
		  }*/
		 
		int count = 1;
		while (count <= 10) {
			System.out.println(count);
			count++;
		}
		
		System.out.println("-----");
		//if () {}
		//for () {}
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
		System.out.println("-----");
		
		for (int i = 10; i <= 30; i++) {
			System.out.println(i);
		}
		
		System.out.println("-----");
		
		for (int i = 50; i >= 25; i--) {
			System.out.println(i);
		}
	
	}

}
