package day13_String;

public class StringConcatenationMethod {

	public static void main(String[] args) {
		// To link many strings into one: str1+str2; or str1.concat(str2); or str += str1; str += str2;
		String word1 = "re";
		String word2 = "think";
		String word3 = "ing";

		String result = word1 + word2 + word3;
		System.out.println(result); // rethinking

		String result1 = word1.concat(word2 + word3);
		System.out.println(result1); // rethinking

		String result2 = word1.concat(word2).concat(word3);
		System.out.println(result2); // rethinking

		String result3 = "";
		result3 += word1;
		System.out.println(result3); // re
		result3 += word2;
		System.out.println(result3); // rethink
		result3 += word3;
		System.out.println(result3); // rethinking
	}

}
