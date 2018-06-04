package assignment;

import java.io.*;

public class Assign13 {

	public static void main(String[] args) throws IOException {

		// Write a program to find maximum repeated words from a file.
		String s ="", ns="";
		int k, a = 1;
		FileReader fr = new FileReader("./text.txt");
		for (;((k = fr.read()) != -1);) {
			s += (char)k;
		}
		String[] strings = s.split(" ");
		System.out.println(strings[4]);
		for (int i = 0; i < strings.length; i++) {
			int  count = 1;
			for (int j = i + 1; j < strings.length; j++) {
				if(strings[i].equals(strings[j])) {
					count ++;
				}
			}
			if(a < count) {
				a = count;
				ns = strings[i];
			}
		}
		System.out.println(ns +" is "+ a +"times");
		for (int i = 0; i < 10; i++) {
			System.out.println(strings[i]);
		}
	}
}
