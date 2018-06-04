package assignment;

import java.util.Scanner;

public class Assign20 {

	public static void main(String[] args) {
		
		// Write a program to remove the duplicates from the array.

		System.out.println("Enter the array size");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int []a = new int[n];
		int t;
		System.out.println("Enter "+n+" array values");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		int k = a.length - 1;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < k; j++) {
				if(a[i] == a[j]) {
					//System.out.println(a[j]);
					t = a[j];
					a[j] = a[k];
					a[k] = t;
					j --;
					k --;
				}
			}
		}
		
		for (int i = 0; i < k; i ++) {
			System.out.println(a[i]);
		}
	}

}
