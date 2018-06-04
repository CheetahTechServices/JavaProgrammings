package assignment;

public class Assign4 {

	public static void main(String[] args) {

/*	
		***1***
		**2*2**
		*3*3*3*
		4*4*4*4

						*/
		
		int n = 4, a, b = -1, c;
		for (int i = 0; i < n; i++) {
			a = n - 1 - i;
			for (int j = 0; j < a; j++) {
				System.out.print("*");
			}
			b = b + 2;
			for (int j = 1; j <= b; j++) {
				System.out.print(((j % 2) == 1) ? i + 1 : "*");
			}
			for (int j = 0; j < a; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
