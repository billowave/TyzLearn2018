package tyz3.SpringMvc.example3rd.configs;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "tyz3.SpringMvc.example3rd")
public class HelloWorldConfiguration {
	
}