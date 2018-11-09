package javajdk.logging.tyz.use;

import java.util.logging.Level;
import java.util.logging.Logger;

public class JDKLoggerTest {
	//private static Logger logger = Logger.getLogger("com.bes.logging");

	public static void main(String argv[]) {
		// Log a FINEtracing message
		System.setProperty("java.util.logging.config.file", "//resource//logging.properties");
		Logger logger = Logger.getLogger("com.bes.logging");

		logger.info("Main running.");
		logger.fine("doingstuff");

		logger.log(Level.CONFIG, "config");
		try {
			Thread.currentThread().sleep(1000);// do some work
		} catch (Exception ex) {
			logger.log(Level.WARNING, "trouble sneezing", ex);
		}
		logger.fine("done");
		System.out.println(System.getProperty("java.util.logging.config.file"));
		
		
	}
}
