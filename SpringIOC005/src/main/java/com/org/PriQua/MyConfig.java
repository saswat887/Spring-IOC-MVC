package com.org.PriQua;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.org.PriQua")
public class MyConfig {
	@Bean
	public Employee m1()
	{
		return new Employee();
	}

}
