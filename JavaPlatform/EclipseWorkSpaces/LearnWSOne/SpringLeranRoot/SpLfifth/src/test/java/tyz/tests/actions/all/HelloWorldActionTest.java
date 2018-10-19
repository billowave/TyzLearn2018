/**
 * 
 */
package tyz.tests.actions.all;

import junit.framework.TestCase;
import tyz.actions.all.HelloWorldAction;

/**
 * @author Administrator
 *
 */
public class HelloWorldActionTest extends TestCase {

	/**
	 * {@link tyz.actions.all.HelloWorldAction#SayOut()} µÄ²âÊÔ·½·¨¡£
	 */
	public void testSayOut() {
		
		HelloWorldAction test = new HelloWorldAction("test sayout method");
		
		assertTrue(test.SayOut().isEmpty());
	}

}
