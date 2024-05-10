package com.boa.demo.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({HelloConfig.class , CustomerConfig.class})
public class AppConfig {
	
	
}
