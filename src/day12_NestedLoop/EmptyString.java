package day12_NestedLoop;

public class EmptyString {

	static String msg;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "";// empty string no character inside => length == 0
		String word2 = new String();
		System.out.println(word.length());// 0 count the length of string variable
		System.out.println(word2.length());// 0

		System.out.println(msg);
		System.out.println(msg.length());// cannot run since msg the value is null uninitialized character => no length
	}

}
