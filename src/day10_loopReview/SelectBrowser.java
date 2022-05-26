package day10_loopReview;

public class SelectBrowser {

	public static void main(String[] args) {
		// Can use else if or switch statement
		String str = "EDGE";
		String msg = "BROWSER IS SELECTED";
		if (str == "CHROME" || str == "FIREFOX" || str == "SAFARI" || str == "EDGE" || str == "OPERA") {
			System.out.println(str + " " + msg);
		} else {
			System.out.println("INVALID BROWSER");
		}
	}

}
