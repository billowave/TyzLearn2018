package org.SpLNinth.Threads.example01.test;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        //super( testName );
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
    public void testApp01()
    {
        //new一个面包类
        Breads bre = new Breads();
        
        //new一个生产者类
        producer proth = new producer(bre,1000);
        //new一个消费者类
        consume conth = new consume(bre,2000);
        
        //new一个包含消费者类的线程
        Thread t1 = new Thread(proth,"生产者");
        
        //new一个包含生产者类的线程
        Thread t2 = new Thread(conth,"消费者");
        
        //启动线程
        t1.start();
        t2.start();   	
    	
        //assertTrue( true );
    }
    
    public void testApp02()
    {
        //new一个面包类
        Breads bre = new Breads();
        
        //new一个生产者类
        producer proth = new producer(bre,1000);
        //new一个消费者类
        consume conth = new consume(bre,2000);
        
        //new一个包含消费者类的线程
        Thread t1 = new Thread(proth,"生产者");
        
        //new一个包含生产者类的线程
        Thread t2 = new Thread(conth,"消费者");
        
        //启动线程
        proth.run();
        conth.run();
        //t2.start();   	
    	
        //assertTrue( true );
        
   
    }
    
    public void testApp03()
    {
        //new一个面包类
        Breads bre = new Breads();
        
        //new一个生产者类
        producer proth = new producer(bre,1000);
        //new一个消费者类
        consume conth = new consume(bre,2000);
        
        //new一个包含消费者类的线程
        Thread t1 = new Thread(proth,"生产者");
        
        //new一个包含生产者类的线程
        Thread t2 = new Thread(conth,"消费者");
        
        proth.start();
        conth.start();
    	
        //assertTrue( true );
        
       
    }
}
