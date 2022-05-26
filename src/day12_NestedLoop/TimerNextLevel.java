package day12_NestedLoop;

import java.util.Scanner;

public class TimerNextLevel {

	public static void main(String[] args) throws InterruptedException {

		Scanner scan = new Scanner(System.in);
		System.out.println("How long you want to wait");
		int waitTime = scan.nextInt();

		System.out.println(waitTime + " timer start!");
		for (int i = waitTime - 1; i >= 0; i--) {
			for (int j = 59; j >= 0; j--) {
				System.out.println("0" + i + ":" + j);
				Thread.sleep(1000);
			}
		}
		System.err.println("Time's UP!!"); // highlight Time's UP!! in red

		scan.close();
	}
}
