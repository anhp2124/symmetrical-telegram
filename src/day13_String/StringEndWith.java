package day13_String;

public class StringEndWith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello";
		System.out.println(str.startsWith("He")); // true
		System.out.println(str.endsWith("He")); // false
		System.out.println(str.endsWith("llo")); // true
		
		String str2 = "TechCircle";
		System.out.println(str2.startsWith("Tech")); // true
		System.out.println(str2.startsWith("tech")); // false - case senstive

	}

}
