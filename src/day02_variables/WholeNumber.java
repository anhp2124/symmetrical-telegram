package day02_variables;

public class WholeNumber {

	public static void main(String[] args) {
	//byte,short,int,long (must have letter L at the end of number of more than 5 digits)
		byte min = -128;
		byte max = 127;
		
		long phone = 1234567891L;
		long ssn = 123_12_12340;
		System.out.println(phone);
		System.out.println(ssn);
	//float must have letter f at the end of the number
		float price = 9.99f;
		double accountBalance = 999999.9999999;
	}

}
