package day06_controlFlow;

public class IfStatement {

	public static void main(String[] args) {
		// Decision making statements: IF and SWITCH statement
		//IF Syntax:
		/*
		 * if (condition){statement1;} else{statement2;}
		 *IF condition true -> statement 1//ELSE condition false -> statement 2
		 *ELSE part is optional -> can be removed if not needed: if (condition){s1;s1';}
		 *Can remove true statement: if (condition){
		 *} else{s2;s2';} 
		 *We can add more statements on each part like: if (condition){s1;s1';} else{s2;s2';}
		 * */
		int a = 5;
		int b = 7;
		if (a>b){System.out.println("a is greater");} else{System.out.println("b is greater");}
		
		int count = 10;
		int total = 4;
		if (count <3){total = 0;} else{total += count;}
		System.out.println(total);
		
		int aa = 5;
		if (aa%2 == 1){System.out.println(aa +" is an odd number");}//remove ELSE part
		if (aa%2 == 0) {System.out.println(aa +" is an even number");}
		
		int n1 = 300;
		int n2 = 4;
		if (n1 > n2){System.out.println("Max number is "+n1);System.out.println("Min number is "+n2);}//add one more statement
		if (n1 < n2){System.out.println("Max number is "+n2);System.out.println("Min number is "+n1);}
		if (n1 == n2){System.out.println("They are equal");}
		
	}

}
