package assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Assign8 {

	public static void main(String[] args) {
		System.out.println("Please enter the  value of ''n'' to find duplicate");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int []a = new int[n];
		int t;
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the "+(i + 1)+" value");
			a[i] = sc.nextInt();
		}
		int k = a.length - 1;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < k; j++) {
				if(a[i] == a[j]) {
					System.out.println(a[j]);
					t = a[k];
					a[k] = a[j];
					a[j] = t;
					j --;
					k --;
				}
			}
		}
		System.out.println(k);
		for (int i = n - 1; i > k; i--) {
			System.out.println(a[i]);
		}
		System.out.println(Arrays.toString(a));
	}

}
