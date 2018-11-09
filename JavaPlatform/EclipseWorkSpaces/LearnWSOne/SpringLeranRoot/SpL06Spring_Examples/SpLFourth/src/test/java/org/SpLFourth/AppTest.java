package org.SpLFourth;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import tyz.bean.all.Stock;
import tyz.bean.all.StockBo;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
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
        assertTrue( true );
    }
    
    public void save() {
		
    	ApplicationContext appContext = 
  	    	  new ClassPathXmlApplicationContext("spring/config/BeanLocations.xml");
  		
  	    	StockBo stockBo = (StockBo)appContext.getBean("stockBo");
  	    	
  	    	/** insert **/
  	    	Stock stock = new Stock();
  	    	stock.setStockCode("7668");
  	    	stock.setStockName("HAIniao");
  	    	stockBo.save(stock);    	
	}
    
    public void query() {
		
    	ApplicationContext appContext = 
  	    	  new ClassPathXmlApplicationContext("spring/config/BeanLocations.xml");
  		
  	    	StockBo stockBo = (StockBo)appContext.getBean("stockBo");
  	    	
  	 
  	    	Stock stock2 = stockBo.findByStockCode("7668");
  	    	System.out.println(stock2.toString());
  	    	System.out.println(stock2.getStockName() + stock2.getStockCode() + stock2.getStockId());
  	    	
	}
    
    public void update() {
    	
    	ApplicationContext appContext = 
  	    	  new ClassPathXmlApplicationContext("spring/config/BeanLocations.xml");
  		
  	    	StockBo stockBo = (StockBo)appContext.getBean("stockBo");
  	  
  	    	
  	    	/** select **/
  	    	Stock stock2 = stockBo.findByStockCode("7668");
  	    	System.out.println(stock2);
  	    	
  	    	/** update **/
  	    	stock2.setStockName("HAIO-1");
  	    	stockBo.update(stock2);
		
	}
    
    
    public void delete() {
    	ApplicationContext appContext = 
  	    	  new ClassPathXmlApplicationContext("spring/config/BeanLocations.xml");
  		
  	    	StockBo stockBo = (StockBo)appContext.getBean("stockBo");
  	    	
  	   
  	    	
  	    	/** select **/
  	    	Stock stock2 = stockBo.findByStockCode("7668");
  	    	System.out.println(stock2);
  	    	
  	   
  	    	stockBo.delete(stock2);
  	    	
  	    	System.out.println("Done");
	}
    
    
}
