package assignment;

import java.util.Scanner;

public class Assign17 {

	public static void main(String[] args) {
		
		// Write a program to find the common elements between two arrays.
		
		int a[] = enterArray(1);
		int b[] = enterArray(2);
		commonValueInTwoArrays(a, b);
	}

	private static void commonValueInTwoArrays(int[] a, int[] b) {
		System.out.println("Common value in both arrays");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if(a[i] == b[j]) {
					System.out.println(a[i]);
				}
			}
		}
	}

	private static int[] enterArray(int m) {
		System.out.println("Enter "+m+" array size");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int []a = new int[n];
		int t;
		System.out.println("Enter "+n+" array values");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		return a;
	}
}
