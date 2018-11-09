package org.SpLEighth;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import Log4j2.tyz.use.Log4J2TestClass;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class Log4j2Test extends TestCase {
	
	/**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public Log4j2Test( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        Logger logger = LogManager.getLogger("test1Logger");
        logger.fatal("fsdf");
        
        assertTrue( true );
    
    }

}
