package javaprogram;

public class BackspaceinStr {
	public static void main(String[] args) {
		Disp("test yantra software solutions");
	}
	static void Disp(String s)
	{
		System.out.println(s);
		
		for (int i = 0; i < s.length(); i++) {
	    // System.out.println(s.charAt(i));
			if(s.charAt(i) == 's')
			{
				s.replace(s.charAt(i), ' ');
			}
			
			
			
		}
		
		 
	}

}
