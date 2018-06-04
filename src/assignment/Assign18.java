package assignment;

import java.util.Scanner;

public class Assign18 {

	public static void main(String[] args) {
		
		// Write a program to find top two maximum number in an array.

		System.out.println("Enter the array size");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int []a = new int[n];
		int t;
		System.out.println("Enter "+n+" array values");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		int fb = a[0];
		int sb = a[1];
		
		for (int i = 0; i < a.length; i++) {
			if(fb < a[i]) {
				sb = fb;
				fb = a[i];
			} else if(sb < a[i] && fb != a[i]) {
				sb = a[i];
			}
		}
		System.out.println(fb+ " "+sb );
	}

}
