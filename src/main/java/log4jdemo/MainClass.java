package log4jdemo;

import org.apache.log4j.Logger;

public class MainClass {

	final static Logger logger = Logger.getLogger(MainClass.class);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi");
		
		
		if ( logger.isTraceEnabled() ) { 
			logger.debug("Trace mode is enabled.");
		}
		
		if ( logger.isDebugEnabled() ) { 
			logger.debug("Debug mode is enabled.");
		}
		
		if ( logger.isInfoEnabled() ) { 
			logger.debug("Info mode is enabled.");
		}

		new MainClass().echo("Hello There");
		

	}

	private void echo(String message) {
		
		logger.debug(message);	
	}
}
