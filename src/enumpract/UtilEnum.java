package enumpract;

import java.util.Scanner;

public class UtilEnum {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	DAYS d=DAYS.MONDAY;
	String ds=sc.next();
	System.out.println(d);
	System.out.println(d.val);
	DAYS[] da = DAYS.values();
	for(DAYS d1:da)
	{
		System.out.println(d1 + "  "+d1.val);
		d1.meth();
		
	}
	DAYS dd;
	dd=DAYS.valueOf(ds);
	System.out.println(dd + dd.no + dd.val);
	
}
}
