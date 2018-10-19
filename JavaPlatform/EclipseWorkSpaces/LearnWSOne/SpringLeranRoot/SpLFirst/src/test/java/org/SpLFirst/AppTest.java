package org.SpLFirst;

import org.SpLFirst.Service.HWService;
import org.SpLFirst.ServiceImp.HWServiceImp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.support.BooleanTypedValue;

import javaconfig.inclass.BeanConfig;
import javaconfig.inclass.ClassP;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
	/**
	 * Create the test case
	 *
	 * @param testName
	 *            name of the test case
	 */
	public AppTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(AppTest.class);
	}

	/**
	 * Rigourous Test :-)
	 */
	@SuppressWarnings("resource")
	public void testApp() {
		ApplicationContext context = new ClassPathXmlApplicationContext("/resource/Bean.xml");

		HWService sd = (HWServiceImp) context.getBean("helloWorldService");

		assertEquals("** Spring **Hello World !!", sd.gethw().SayHelloStr());
	}

	/**
	 * Rigourous Test :-)
	 */
	@SuppressWarnings("resource")
	public void testApp1() {
		ApplicationContext context = new ClassPathXmlApplicationContext("/resource/Bean.xml");

		HWService sd = (HWServiceImp) context.getBean("helloWorldService");

		boolean res = sd.gethw().SayHelloStr().equals("** Struts **Hello World !!");

		assertFalse(res);

	}

	public void testclassconfig() {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);

		ClassP p1 = (ClassP) context.getBean("sub");
		ClassP p2 = (ClassP) context.getBean("sub2");

		assertTrue(p1.SayHello("sub").contains("!!!") && p2.SayHello("sub2").contains("..."));

	}
}
