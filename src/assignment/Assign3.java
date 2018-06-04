package assignment;

public class Assign3 {

	public static void main(String[] args) {
/*
		 * 1
		 * 1 * 2
		 * 1 * 2 * 3
		 * 1 * 2 * 3 * 4
		 * 1 * 2 * 3 * 4 * 5
		 * 1 * 2 * 3 * 4
		 * 1 * 2 * 3
		 * 1 * 2
		 * 1

										*/
		int n = 10, m = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print("* " + (j + 1) + " ");
			}
			System.out.println();
			int l= (i < (n / 2) - 1) ? m ++ : m-- ;
		}
	}
}
