package day13_String;

public class SubStringMethod {

	public static void main(String[] args) {
		//
		//			   0123456789
		String str1 = "television";
		System.out.println(str1.substring(4)); // show characters from 4th position to the end
		System.out.println(str1.substring(2,5)); // show characters from 2nd position to (5-1)th position
		
		String email = "firstname.lastname@domainname.com";
		String gmail = "tech.circle@gmail.com";
		System.out.println(gmail.indexOf('g'));
		System.out.println(gmail.lastIndexOf('.'));
		System.out.println(gmail.substring(12,17));
		System.out.println(gmail.substring(gmail.indexOf('g'), gmail.lastIndexOf('.')));

	}

}
