package javaprogram;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Test;

public class PractLog4j2 {
	Logger logger=LogManager.getLogger(PractLog4j2.class);
	@Test
	void testin()
	{
		logger.trace("app start");
		System.out.println("App running");
		logger.error("app end");
	}
}
