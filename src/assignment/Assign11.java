package assignment;

public class Assign11 {

	public static void main(String[] args) {
		
		//  Write a program to reverse a given number?
		
		int num1 = 12345;
		int newnum = 0, t;
		while(num1 != 0)
		{
			t = num1 % 10;
			newnum = (newnum * 10) + t;
			num1 = num1 / 10;
		}
		System.out.println(newnum);
	}
}
