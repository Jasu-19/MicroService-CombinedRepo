package com.boa.demo.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.boa.demo.service.HelloWorld;
import com.boa.demo.service.HelloWorldImpl;
@Configuration
public class HelloConfig {
	
	@Bean(name = "helloBean")
	public HelloWorld helloWorld()
	{
		return new HelloWorldImpl();
	}

}
