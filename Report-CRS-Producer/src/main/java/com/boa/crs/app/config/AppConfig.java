package com.boa.crs.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.boa.crs.app.service.ReportsService;
import com.boa.crs.app.service.ReportsServiceImpl;

@Configuration
public class AppConfig {
	@Bean
	public ReportsService reportsService()
	{
		return new ReportsServiceImpl();
	}

}
