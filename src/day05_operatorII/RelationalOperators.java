package day05_operatorII;

public class RelationalOperators {

	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = 3;
		
		System.out.println(a > b);//false
		System.out.println(a < b);//true
		
		boolean result = a < b;
		System.out.println(result);//true
		
		result = a == b;//"==" for comparing 2 variables, a equal to b
		System.out.println(result);//false
		
		System.out.println(a != b);//"!=" a not equal to b--true
		
		result = a + b == c;//1+2==3
		System.out.println(result);//true
		
		System.out.println(a*b >= c);//1*2>=3--false
		
		result = a + b <= c;//1+2<=3--true
		System.out.println(result);
		System.out.println(a + b >= c);//1+2>=3--true

	}

}
