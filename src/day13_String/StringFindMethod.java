package day13_String;

public class StringFindMethod {

	public static void main(String[] args) {
		// To find the position of character ____.indexOf("word" or 'letter'); opposite
		// with ____.charAt(number);
		// 012345678910 1617
		String name = "President George Washington"; // space is 9th and 16th

		System.out.println(name.indexOf('P')); // 0
		System.out.println(name.indexOf('e')); // 2
		System.out.println(name.indexOf("George")); // 10
		System.out.println(name.indexOf("George") > -1); // true - "George" in the string
		System.out.println(name.indexOf('e', 3)); // 6 - Find position of 'e' starting from 3rd position
		System.out.println(name.indexOf('e', 11)); // 11
		System.out.println(name.lastIndexOf('e')); // 15 - Find the first position of 'e' from right to left
		System.out.println(name.indexOf("rge")); // 13
		System.out.println(name.indexOf("Bob")); // -1 - There is no "Bob" in the string
		System.out.println(name.indexOf("Bob") > -1); // false - no "Bob" in the string

	}

}
