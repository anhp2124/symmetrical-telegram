package day04_operator;

public class ArthmeticOperator {

	public static void main(String[] args) {
		// +,-,*,/
		int a = 10;
		int b = 20;
				
		System.out.println(a+b);//30
		System.out.println(b-a);//10
		System.out.println(a*b);//200
		System.out.println(b/a);//2
		
		double valueA = a;
		double valueB = b;
		double result = valueA/valueB;
		System.out.println(result);//0.5
		
		//++,--
		int valueC = 1;
		System.out.println(valueC);//1
		//valueC = valueC +1;
		//System.out.println(valueC);//2
		valueC++;//shortcut of LN24
		System.out.println(valueC);//2
		//valueC = valueC -1;
		//System.out.println(valueC);//1
		valueC--;//shortcut of LN 30
		System.out.println(valueC);//1
		
		//%-division remainder
		int A = 10;
		int B = 3;
		System.out.println(A/B);//3
		System.out.println(A%B);//1
		System.out.println(10%4);//2
		System.out.println(10%5);//0
		System.out.println(99%2 == 1);//true
		System.out.println(98%2 == 1);//false
		System.out.println(99%2 == 0);//false
		
		

	}

}
