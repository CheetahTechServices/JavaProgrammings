package assignment;

public class Assign5 {

	public static void main(String[] args) {

		/*		
		 *******
		 *     *  
		 *     *  
		 *     *  
		 *     *  
		 *     *  
		 *******

		 */

		int n = 7;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(((i == 0) || (j == 0) || (i == n - 1) || (j == n - 1)) ? "*" : " ") ;
			}
			System.out.println();
		}
	}
}
