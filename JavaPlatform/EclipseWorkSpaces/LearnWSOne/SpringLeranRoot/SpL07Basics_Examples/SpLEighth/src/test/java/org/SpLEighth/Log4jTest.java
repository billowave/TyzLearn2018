package org.SpLEighth;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.DOMConfigurator;

import junit.framework.TestCase;

public class Log4jTest extends TestCase {

	private static final Logger log = Logger.getLogger(Log4jTest.class);

	public void test01()

	{
		//PropertyConfigurator.configure("log4j.properties"); 
		   //在后台输出 
	
		   
		System.out.println(System.getProperty("user.dir"));
		// PropertyConfigurator.configure("src\\main\\java\\resource\\log4j.properties");

		// PropertyConfigurator.configure("src/main/java/resource/log4j.properties");

		PropertyConfigurator.configure("target/classes/resource/log4j.properties");

		System.out.println(Log4jTest.class.getName());
		
		Logger module1 = Logger.getLogger("Module1"); 
		module1.error(" logger1 logger1 logger1 logger1  error");

		log.trace("TRACE:测试输出1");
		log.debug("DEBUG:测试输出2");
		log.info("INFO: Log4j 输出测试成功");
		log.error("error");
		log.fatal("fatal");
		

	}

	public void test02()

	{
		System.out.println(System.getProperty("user.dir"));
		// PropertyConfigurator.configure("src\\main\\java\\resource\\log4j.properties");

		// PropertyConfigurator.configure("src/main/java/resource/log4j.properties");

		PropertyConfigurator.configure("target/classes/resource/log4j.properties");

		System.out.println(Log4jTest.class.getName());

		log.trace("TRACE:测试输出1");
		log.debug("DEBUG:测试输出2");
		log.info("INFO: Log4j 输出测试成功");
		log.error("error");
		log.fatal("fatal");
	}

	public void test03()

	{
		System.out.println(System.getProperty("user.dir"));
		// PropertyConfigurator.configure("src\\main\\java\\resource\\log4j.properties");

		// PropertyConfigurator.configure("src/main/java/resource/log4j.properties");

		PropertyConfigurator.configure("target/classes/resource/log4j.properties");

		System.out.println(Log4jTest.class.getName());

		log.trace("TRACE:测试输出1");
		log.debug("DEBUG:测试输出2");
		log.info("INFO: Log4j 输出测试成功");
		log.error("error");
		log.fatal("fatal");
	}

	public void test04()

	{
		System.out.println(System.getProperty("user.dir"));
		// PropertyConfigurator.configure("src\\main\\java\\resource\\log4j.properties");

		// PropertyConfigurator.configure("src/main/java/resource/log4j.properties");

		PropertyConfigurator.configure("target/classes/resource/log4j.properties");

		System.out.println(Log4jTest.class.getName());

		log.trace("TRACE:测试输出1");
		log.debug("DEBUG:测试输出2");
		log.info("INFO: Log4j 输出测试成功");
		log.error("error");
		log.fatal("fatal");
	}

	public void test05()

	{
		System.out.println(System.getProperty("user.dir"));
		// PropertyConfigurator.configure("src\\main\\java\\resource\\log4j.properties");

		// PropertyConfigurator.configure("src/main/java/resource/log4j.properties");

		PropertyConfigurator.configure("target/classes/resource/log4j.properties");

		System.out.println(Log4jTest.class.getName());

		log.trace("TRACE:测试输出1");
		log.debug("DEBUG:测试输出2");
		log.info("INFO: Log4j 输出测试成功");
		log.error("error");
		log.fatal("fatal");
	}

	public void test06()

	{
		System.out.println(System.getProperty("user.dir"));
		// PropertyConfigurator.configure("src\\main\\java\\resource\\log4j.properties");

		// PropertyConfigurator.configure("src/main/java/resource/log4j.properties");

		PropertyConfigurator.configure("target/classes/resource/log4j.properties");

		System.out.println(Log4jTest.class.getName());

		log.trace("TRACE:测试输出1");
		log.debug("DEBUG:测试输出2");
		log.info("INFO: Log4j 输出测试成功");
		log.error("error");
		log.fatal("fatal");
	}

	public void test07()

	{
		Logger log = Logger.getLogger("");
		System.out.println(System.getProperty("user.dir"));
		// PropertyConfigurator.configure("src\\main\\java\\resource\\log4j.properties");

		// PropertyConfigurator.configure("src/main/java/resource/log4j.properties");

		//PropertyConfigurator.configure("target/classes/resource/log4j.xml");

		DOMConfigurator.configure("target/classes/resource/log4j.xml");
		System.out.println(Log4jTest.class.getName());

		log.trace("TRACE:测试输出1");
		log.debug("DEBUG:测试输出2");
		log.info("INFO: Log4j 输出测试成功");
		log.error("error");
		log.fatal("fatal");
	}

}
