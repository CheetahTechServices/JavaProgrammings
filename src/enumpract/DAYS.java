package enumpract;

import java.sql.Timestamp;

public enum DAYS {
	
	
	MONDAY(10, "firstday"), WEDNESDAY(20, "secondday") ;
	
	int val;
	String no;
	
	DAYS(int v,String s){
		System.out.println(new Timestamp(System.currentTimeMillis()) +"  1");
		this.val=v;
		this.no=s;
		System.out.println(new java.util.Date()  +"  2");
	}
	{
		System.out.println(new java.util.Date()  + "    3");
		
		System.out.println(val);
	}

	static void meth()
	{
		System.out.println(" This is method");
	}
	
}

