package assignment;

public class Assign6 {

	public static void main(String[] args) {
/*
		12345 
		23451 
		34512 
		45123 
		51234

*/		
		int n = 5;
		for (int i = 0; i < n; i++) {
			int p = i ;
			for (int j = 0; j < n; j++) {
				System.out.print((p < 5) ? ++ p : (p=1));
			}
			System.out.println();
		}
	}
}
