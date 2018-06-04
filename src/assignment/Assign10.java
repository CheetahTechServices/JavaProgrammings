package assignment;

import java.util.Date;

public class Assign10 {

	static String s = "New Year";
	static String n = "";
	public static void main(String[] args) {

		//  Write a program to reverse a string using recursive algorithm
		long currentTimeMillis = System.currentTimeMillis();
		revStr(0);
		System.out.println(n);
		long currentTimeMillis1 = System.currentTimeMillis();
		System.out.println(currentTimeMillis1 - currentTimeMillis );
	}

	static void revStr(int i) {
		if(i < s.length()) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			n = s.charAt(i) + "" +n;
			i ++;
			revStr(i);
		}
	}
}
