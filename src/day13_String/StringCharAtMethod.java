package day13_String;

public class StringCharAtMethod {

	public static void main(String[] args) {
		// 			  0123456789	
		String str = "TechCircle";
//		System.out.println(str.charAt(0)); //T
//		System.out.println(str.charAt(1)); //e
//		System.out.println(str.charAt(2)); //c
//		System.out.println(str.charAt(3)); //h
//		System.out.println(str.charAt(4)); //C
//		System.out.println(str.charAt(5)); //i
//		System.out.println(str.charAt(6)); //r
//		System.out.println(str.charAt(7)); //c
//		System.out.println(str.charAt(8)); //l
//		System.out.println(str.charAt(9)); //e
		
		for (int i = 0; i < 10; i++) {
//			System.out.println(i);
			System.out.println(str.charAt(i));
		}
		System.out.println("---");
		for (int i = 9; i >= 0; i--) {
			System.out.println(str.charAt(i));
		}

	}

}
