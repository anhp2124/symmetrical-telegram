package day04_operator;

public class TypeCasting {

	public static void main(String[] args) {
		/*
		*Widening Casting (automatically) - converting a smaller type to a larger type size
		byte -> short -> char -> int -> long -> float -> double
		 */
		int a = 10;
		double b = a;
		System.out.println(a);
		System.out.println(b);
		
		long c = 700000l;
		float d =c;
		System.out.println(d);
				
		/*
		*Narrowing Casting (manually) - converting a larger type to a smaller size type
		double -> float -> long -> int -> char -> short -> byte
		*/
		int valueA = 10;
		byte valueV = (byte)valueA;
		System.out.println(valueA);
		System.out.println(valueV);
		
		int C = 300;
		byte D = (byte)C;//byte [-128,127]
		System.out.println(D);//lose some value for D
		
		System.out.println(Byte.MAX_VALUE);//show the upper range of byte
		System.out.println(Byte.MIN_VALUE);//show the minimum value of byte

	}

}
