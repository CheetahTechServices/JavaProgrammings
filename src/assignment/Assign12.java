package assignment;

import java.util.ArrayList;

import org.apache.xerces.util.SynchronizedSymbolTable;

public class Assign12 {

	public static void main(String[] args) {
		
		// Write a program to implement an array list?
		
		ArrayList al = new ArrayList();
		al.add("a");
		al.add(1);
		System.out.println("size is " +al.size());
		System.out.println("3 is "+al.contains(3));
		System.out.println(al);
		System.out.println("2 nd index value "+al.get(1));
		al.remove("a");
		System.out.println(al);
	}

}
