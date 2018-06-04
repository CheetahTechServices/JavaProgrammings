package javaprogram;

import java.util.Scanner;

public class TriNumHalRev {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int st=1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - 1 - i; j++) {
				System.out.print(" ");
			}
			int l = i + 1;
			for (int j = 0; j < st; j++) {
				System.out.print((st/2) > j ? l++ : l--);
			}
			System.out.println();
			st += 2;
		}
	}
}
