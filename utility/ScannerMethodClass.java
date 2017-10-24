package utility;

import java.util.Scanner;

public class ScannerMethodClass {
	
	public int getInput(int x) {
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
	public static String getInput() {
		Scanner sc = new Scanner(System.in);
		String x = sc.nextLine();
		return x;
		
	}

}
