package javaprogram;

public class multiplearg {
	public static void display(Number... val)
	{
		System.out.println(Pr2.obj+"  1");
		System.out.println(Pr2.createObj());
		for(Number v:val)
		System.out.println(v +" ");
	}
	/*public static void display(int... va)
	{
		for(int v:va)
		System.out.print (v +" ");
	}*/
public static void main(String[] args) {
	display(1.2,5.6,4,987654231456132186l);
	display(1,2,3,12);
	System.out.println(Pr2.obj+"   2");
	Pract2.main();
}
}
