package day05_operatorII;

public class ConstantValue {

	public static void main(String[] args) {
		//final datatype variable = value;
		final int numberOfUser = 4;
		System.out.println(numberOfUser);//4
		
		//numberOfUser = 8; the value is constantly 4
		System.out.println(numberOfUser);//4
		
		final float pi = 3.14f;
		final long daysperWeek = 7L;
		
		int A = 10;
		int B = 3;
		int C = 4;
		int D = 5;
		
		System.out.println(A % B);//1
		System.out.println(A % C);//2
		System.out.println(A % D);//0

	}

}
