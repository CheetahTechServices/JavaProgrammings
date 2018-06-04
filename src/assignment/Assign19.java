package assignment;

import java.util.Scanner;

import org.apache.poi.ddf.EscherColorRef.SysIndexProcedure;

public class Assign19 {

	public static void main(String[] args) {
		
		// Write a program to find the given number is prime or not.

		System.out.println("Enter a number to find prime number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 2; i < n/2; i++) {
			if((n % i) == 0) {
				System.out.println("Given number is not prime number");
				System.exit(0);
			} 
		}
		System.out.println("Given number is  prime number");
	}
}
