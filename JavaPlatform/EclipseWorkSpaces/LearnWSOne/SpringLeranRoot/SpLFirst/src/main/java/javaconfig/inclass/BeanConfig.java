package javaconfig.inclass;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mysql.fabric.xmlrpc.base.Member;

@Configuration
public class BeanConfig {
	
	@Bean(name = "sub")
	public ClassP get()
	{
		return new ClassPImpSub();
	}
	
	@Bean(name = "sub2" )
	public ClassP get2()
	{
		return new ClassPImpSubTwo();
	}
}
