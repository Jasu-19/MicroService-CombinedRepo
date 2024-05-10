package com.boa.demo.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.boa.demo.service.customerService;
import com.boa.demo.service.customerServiceimpl;
@Configuration
public class CustomerConfig {
	
	@Bean(name = "customerBean")
	public customerService customerservice ()
	{
		return new customerServiceimpl();
	}

}
