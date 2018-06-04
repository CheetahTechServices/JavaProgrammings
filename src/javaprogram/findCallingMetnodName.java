package javaprogram;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class findCallingMetnodName {
	static void meth1()
	{
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		System.out.println("meth1");
		System.out.println(methodName);
	}
	
	static void meth2()
	{
		StackTraceElement[] stackTrace = new Throwable().getStackTrace();
		Class<? extends StackTraceElement[]> class1 = stackTrace.getClass();
		String name = class1.getName();
		Method[] methods = class1.getMethods();
		for(Method m:methods)
			System.out.println(m.getName());
		System.out.println("meth2");
		System.out.println(name+"  this is name");
		
	}
public static void main(String[] args) {
	//meth2();
	meth1();
}
}
