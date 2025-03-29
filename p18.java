package java25;

import java.util.Scanner;

public class p18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[][][] = new int[3][3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 3; k++) {
					arr[i][j][k] = sc.nextInt();
				}
			}
		}
		for (int j[][] : arr) {
			for (int k[] : j) {
				for (int l : k) {
					System.out.print(" "+l);
				}
				System.out.println();
			}
	System.out.println();

		}
	}
}