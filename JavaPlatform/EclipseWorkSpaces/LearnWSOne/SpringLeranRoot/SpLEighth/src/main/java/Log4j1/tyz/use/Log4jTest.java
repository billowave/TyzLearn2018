package Log4j1.tyz.use;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import junit.framework.Assert;

public class Log4jTest {
   
	private static final Logger log = Logger.getLogger(Log4jTest.class);


    
    public static void main(String[] args) {    
    	
    	System.out.println(System.getProperty("user.dir"));
    	//PropertyConfigurator.configure("src\\main\\java\\resource\\log4j.properties");
        
      	//PropertyConfigurator.configure("src/main/java/resource/log4j.properties");
      	
    	//PropertyConfigurator.configure("target/classes/resource/log4j.properties");
        
        System.out.println(Log4jTest.class.getName());
       
       
    	
        log.trace("TRACE:测试输出1");
        log.debug("DEBUG:测试输出2");
        log.info("INFO: Log4j 输出测试成功");
        log.error("error");
        log.fatal("fatal");
        
        
    }
}