package edurekatest;

import org.testng.log4testng.Logger;

public class LoggerExample {
	// logger instance
	
	public static Logger logger = Logger.getLogger(LoggerExample.class);
	public void testLoggerDebug() {
		logger.debug("Hello...i m in Debug mode");
	}
	
	public void testLoggerinfo() {
		logger.info("Hello...i m in Info mode");
	}
	
	public void testWarn() {
		logger.info("Hello...i m in Warn mode");
	}
	
	public void testError() {
		logger.info("Hello...i m in Error mode");
	}
	
	public void testFatalError() {
		logger.info("Hello...i m in Fatal Error mode");
	}
	
	public static void main(String[] args) {
		LoggerExample example = new LoggerExample();
		example.testLoggerDebug();
		example.testLoggerinfo();
		example.testWarn();
		example.testError();
		example.testFatalError();
			
		
	}

}
