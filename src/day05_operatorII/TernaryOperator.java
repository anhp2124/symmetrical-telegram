package day05_operatorII;

public class TernaryOperator {

	public static void main(String[] args) {
		/*syntax:
		 * condition ? block1 : block2
		 * condition true--assign blockl
		 * condition false--assign block 2*/
		
		int a,b;
		a = 10;
		b = (a==1) ? 5 : 60;//if a equal to 1 is true, value of b is 5**if false, value of b is 60
		System.out.println(b);//60
		
		b = (a/10==1) ? 10 : 20;
		System.out.println(b);//10
		System.out.println("Value of b is "+b);
		
		String result = (b%2==0)? "even number" : "odd number";
		System.out.println(result);//even number
		
		b = 11;
		String result1 = (b%2==0)? "even number" : "odd number";
		System.out.println(result1);//odd number
		
	}

}
