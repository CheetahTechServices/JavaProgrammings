package javaprogram;

class Pr2 
{
	static Pr2 obj=null;
	private Pr2()
	{
		
	}
	static Pr2 createObj()
	{
		if(null==obj)
			obj=new Pr2();
		return obj;
		
	}
}
