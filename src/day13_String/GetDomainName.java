package day13_String;

public class GetDomainName {

	public static void main(String[] args) {
		// help@walmart.com

		String email = "help@uscis.gov";
		System.out.println(email.substring(email.indexOf('@') + 1, email.lastIndexOf('.'))); // uscis

	}

}
