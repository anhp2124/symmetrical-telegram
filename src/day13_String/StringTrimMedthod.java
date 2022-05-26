package day13_String;

public class StringTrimMedthod {

	public static void main(String[] args) {
		// To remove white space in front of the first word or after the last word in the string ____.trim();
		// trim Do NOT remove white space between words
		
		String name = "George Washington";
		
		System.out.println(name.trim()); // return the same
		
		String name1 = "   George Washington   ";
		
		System.out.println(name1);
		System.out.println(name1.trim()); // "George Washington"
		
		
		String str1 = "     Hello";
		
		System.out.println(str1.length());
		
		System.out.println(str1);
		
		System.out.println(str1.trim()); // remove all the white space in str1
		
		System.out.println(str1.trim().length());
		
		
		String str2 = "     hello     ";
		
		System.out.println(str2.length()); 
		
		System.out.println(str2);
		
		str2 = str2.trim();
		
		System.out.println(str2);

	}

}
