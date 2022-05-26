package day02_variables;

public class VariableName {

	public static void main(String[] args) {
	//type variablename = value:
	//variableName starts with (letter or $ or _)
	//VariableName after 1st initial can have number from 0 to 9/no space no special character
	//Case sensitive
		String city = "Chantily";
		String $ = "Chantily";
		String _____hello = "just name";
		String $$$$$money = "1000";
		String fruit123456 = "Apple";
		
		int age = 20;
		
		String phoneNumber = "123456789";
		System.out.println(phoneNumber);
	//put *final* before String/int to block VariableName => this VariableName cannot change value
		final int days_a_week = 7;
	}

}
