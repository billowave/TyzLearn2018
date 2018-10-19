package org.SpLFirst;

import org.SpLFirst.Service.HWService;
import org.SpLFirst.ServiceImp.HWServiceImp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("/resource/Bean.xml");
        
        HWService sd = (HWServiceImp) context.getBean("helloWorldService");
        
        sd.gethw().SayHelloW();
        
        
    }
}
