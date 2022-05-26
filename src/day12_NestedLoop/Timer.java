package day12_NestedLoop;

public class Timer {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		for (int i = 1; i >= 0; i--) {
			// system.out.println(i);
			for (int j = 59; j >= 0; j--) {
				System.out.println("0" + i + ":" + j);
				Thread.sleep(1000);
			}
		}
	}
}
