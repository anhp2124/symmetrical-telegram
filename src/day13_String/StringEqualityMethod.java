package day13_String;

public class StringEqualityMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word1 = "Hello";
		String word2 = "hello";

		System.out.println(word1.equals(word2)); // false

		System.out.println(word1.equalsIgnoreCase(word2)); // true

		if (word1.equals(word2)) {
			System.out.println("They're equal");
		} else {
			System.out.println("not equal");
		}

		boolean b = word1.equals(word2); // false - H at word1 # h at word2
		System.out.println(b);
		b = word1.equalsIgnoreCase(word2); // true - ignore lower/upper case
		System.out.println(b);

		b = "Raiders".equals("Raiders"); // true
		b = "Raiders".equals("raiders"); // false
		b = "Raiders".equalsIgnoreCase("raiders"); // true
		System.out.println(b);
	}

}
