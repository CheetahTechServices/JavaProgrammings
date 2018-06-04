package assignment;

import java.util.Scanner;

public class Assign1 {

	public static void main(String[] args) {
		
/* 	    1 
		2 3 
		4 5 6 
		7 8 9 10   		 */
		
		int n = 4;
		int l = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < i ; j++) {
				System.out.print(l++ +" ");
			}
			System.out.println();
		}

	}

}
