package day13_String;

public class StringReplaceMethod {

	public static void main(String[] args) {
		// String word2 = word1.replace(oldCh, newCH);
		 String word = "car";
		 		word = word.replace('r', 't'); // 'r' replaced by 't'
		 		System.out.println(word);
		 		
		 String str = "tomato";
		 System.out.println(str);
		 str = str.replace('t', 'p');
		 System.out.println(str);
		 
		 String str2 = "tomato";
		 str2 = str2.replace("to", "MO");
		 System.out.println(str2);
		 
		 String str3 = "How Turkey spoiled NATO";
		 str3 = str3.replace(" ", ""); // to remove all white spaces between words
		 System.out.println(str3);

	}

}
