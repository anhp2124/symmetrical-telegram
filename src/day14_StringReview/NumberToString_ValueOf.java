package day14_StringReview;

public class NumberToString_ValueOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long a = 123456L;
		String valueA = String.valueOf(a);
		System.out.println(valueA); // "123456L"
		System.out.println(valueA.length()); // 6
		
		short s = 31542;
		String valueS = String.valueOf(31542);
		System.out.println(valueS); // "31542"
		System.out.println(valueS.length()); // 4
		System.out.println(valueS.charAt(2)); // 5

	}

}
