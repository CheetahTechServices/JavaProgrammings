package javaprogram;

public class mainrun1 {
	public static void main(String[] args) {
		IPract1 pr=new IPract1(){

			@Override
			public void run1()
			{
				System.out.println(" 456 ");

			}

			@Override
			public void run2() 
			{
				System.out.println(" 123  ");
				
			}


		};
		pr.run3();
		pr.run1();
	}
}


