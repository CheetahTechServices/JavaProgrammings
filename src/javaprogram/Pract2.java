package javaprogram;

public class Pract2 
{
	public static void main() {
		System.out.println(Pr2.createObj());
		System.out.println(Pr2.createObj());
	
		Pr2 a=Pr2.createObj();
		Pr2 a1=Pr2.createObj();
		Pr2 a3=Pr2.createObj();
		Pr2 a4=Pr2.createObj();
		System.out.println(a   +"  "+ a1   +"  "+a3   +"  "+a4   +"  "+a.hashCode()+"  "+a3.hashCode());
		
	}
}
