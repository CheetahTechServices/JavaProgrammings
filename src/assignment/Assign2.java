package assignment;

public class Assign2 {

	public static void main(String[] args) {
/*
		54321 12345
		4321 1234
		321 123
		21 12
		1 1

							*/
		
		int n=5;
		for (int i = 0; i <= n; i++) {
			int j = n - i;
			while(j > 0) {
				System.out.print(j --);
			}
			System.out.print(" ");
			while(j < (n - i)) {
				System.out.print(++ j);
			}
			System.out.println();
		}
	}

}
