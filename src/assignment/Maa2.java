package assignment;

public class Maa2 {

	public static void main(String[] args) {
	/*
		6 5 4 
		 3 2 
		  1 
*/
			int n = 3;
			int p = 6;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < i; j++) {
					System.out.print(" ");
				}
				for (int j = 0; j < n - i; j++) {
					System.out.print(p-- +" ");
				}
				System.out.println();
			}
	}

}
