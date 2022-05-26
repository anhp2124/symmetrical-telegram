package day08_controlFlowII;

public class SwitchStatement {

	public static void main(String[] args) {
		/*switch (condition){
		 * case x:
		 * 	code
		 *  break;
		 * default:
		 * 	code
		 */
		int day = 0;
		
		switch (day) {
		case 1:
			System.out.println("Mon");
			break;
		case 2:
			System.out.println("Tue");
			break;
		case 3:
			System.out.println("Wed");
			break;
		case 4:
			System.out.println("Thur");
			break;
		case 5:
			System.out.println("Fri");
			break;
		case 6:
			System.out.println("Sat");
			break;
		case 7:
			System.out.println("Sun");
			break;
		default:
			System.out.println("Invalid");
		}
	}

}
