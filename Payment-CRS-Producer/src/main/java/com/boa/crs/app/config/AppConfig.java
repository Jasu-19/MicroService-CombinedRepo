package com.boa.crs.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.boa.crs.app.service.PaymentService;
import com.boa.crs.app.service.PaymentServiceImpl;





@Configuration
public class AppConfig {
	
	@Bean
	public PaymentService paymentService()
	{
		return new PaymentServiceImpl();
	}
}