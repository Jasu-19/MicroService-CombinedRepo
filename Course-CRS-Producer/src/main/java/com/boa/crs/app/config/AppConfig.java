package com.boa.crs.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.boa.crs.app.service.CourseService;
import com.boa.crs.app.service.CourseServiceImpl;





@Configuration
public class AppConfig {
	
	@Bean
	public CourseService courseService()
	{
		return new CourseServiceImpl();
	}
	
	@Bean
	public RestTemplate restTemplate()
	{
		return new RestTemplate();
	}
	
	
}