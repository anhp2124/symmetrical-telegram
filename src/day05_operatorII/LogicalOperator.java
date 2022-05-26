package day05_operatorII;

public class LogicalOperator {

	public static void main(String[] args) {
		// &&, ||, !
		
		//&& AND
		/*
		 *ConditionA	ConditionB	Result
		 *	true			true	true
		 *	true			false	false
		 *	false			true	false
		 *	false			false	false
		 * */
		int a = 10;
		int b = 5;
		int c = 15;
		
		boolean conditionA = a+b == c;
		boolean conditionB = c-b == a;
		System.out.println(conditionA && conditionB);//true
		System.out.println(a+b==c && c-b==a);//true
		
		conditionA = c/b >= 3;
		conditionB = a+b > c;
		boolean result = conditionA && conditionB;//A true AND B false -- false
		System.out.println(result);
		
		String userName = "techcircle";
		String password = "abc123";
		System.out.println(userName=="techcircle" && password=="abc123");//userName and password match -- true
		System.out.println(userName=="hello" && password=="abc123");//userName not match and password match -- false
		
		
		//|| OR
		/*
		 *ConditionA	ConditionB	Result
		 *	true			true	true	System.out.println(true || true);
		 *	true			false	true	System.out.println(true || false);
		 *	false			true	true	System.out.println(false || true);
		 *	false			false	false	System.out.println(false || false);
		 * */
		a = 1;
		b = 2;
		c = 3;
		conditionA = a+b == c;//true
		conditionB = a-b > c;//false
		System.out.println(conditionA || conditionB);//A true OR B false -- true
		System.out.println(conditionA || c/a == 1);//A true OR B false -- true
		System.out.println(c+a > b+a || a < 5);//A true OR B true -- true
		
		
		//! LOGICAL NOT
		/*
		 * !true == false
		 * !false == true
		 **/
		conditionA = true;
		conditionB = false;
		System.out.println(!conditionA);//false
		System.out.println(!conditionB);//true

	}

}
