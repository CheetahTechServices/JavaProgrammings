package javaprogram;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class PractInLog4j {

	public static void main(String[] args) {
		Logger log=Logger.getLogger(Logger.class.getName());
		DOMConfigurator.configure("./log4j.xml");
		for (int i = 0; i < 10; i++) {
			System.out.println("i is "+i);
			log.info(i);
			if(i == 8)
			{
				log.debug("ended");
				break;
			}
		}	}

}
