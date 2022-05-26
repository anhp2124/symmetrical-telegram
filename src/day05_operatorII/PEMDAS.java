package day05_operatorII;

public class PEMDAS {

	public static void main(String[] args) {
		// () -> EXPONENTS -> */ -> +-
		int result = 1+2+3-4;//2 
		System.out.println(result);
		
		result = 1+2+(3-4);//2
		System.out.println(result);
		
		result = 1+2+3*4;//15
		System.out.println(result);
		
		int ans = (int) Math.pow(5,2);//5^2--25
		System.out.println(ans);
	}

}
