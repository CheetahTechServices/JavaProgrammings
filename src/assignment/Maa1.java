package assignment;

public class Maa1 {

	public static void main(String[] args) {
		// Reverse a string without using Inbuilt function
		String s = "this is the string";
		String ns = "";
		for (int i = 0; i < s.length(); i++) {
			ns = s.charAt(i) + ns;
		}
		 
		System.out.println(ns);
	}

}
