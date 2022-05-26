package day14_StringReview;

public class NumberToStringWrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte age = 60;
		String ageAsString = Byte.toString(age);
		System.out.println(ageAsString); // 60 as a string
		System.out.println(ageAsString.charAt(0)); // 6
		
		int distance = 1000;
		String c = Integer.toString(distance);
		System.out.println(c); // 1000 as a string
		
		double price = 9.99;
		String p = Double.toString(price);
		System.out.println(p); // 9.99 as a string
		System.out.println(p.length()); // 4
		System.out.println(p.charAt(1)); // .

	}

}
