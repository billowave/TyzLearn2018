package javaconfig.inclass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestRun {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
		
		ClassP p1 =  (ClassP) context.getBean("sub");
		ClassP p2 =  (ClassP) context.getBean("sub2");
		
		System.out.println(p1.SayHello("sub") + "------------");
		System.out.println(p2.SayHello("sub2") + "------------");
		
		
	}

}
