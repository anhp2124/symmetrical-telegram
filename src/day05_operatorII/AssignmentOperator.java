package day05_operatorII;

public class AssignmentOperator {

	public static void main(String[] args) {
		int a = 9;
		a += 5;//a = a + 5;
		System.out.println(a);//14
		a += 5;//14 = 14 + 5;
		System.out.println(a);//19
		a -= 10;//19 = 19 - 10;
		System.out.println(a);//9
		a /= 3;//9 = 9/3;
		System.out.println(a);//3
		a *= 2;//3 = 3*2;
		System.out.println(a);//6
		
		a = 0;
		System.out.println(a);//0
		a += 5;
		System.out.println(a);//5

	}

}
