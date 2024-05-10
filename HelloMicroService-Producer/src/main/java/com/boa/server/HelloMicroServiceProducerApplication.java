package com.boa.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.context.annotation.Configuration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@ComponentScan({"com.boa.*"})
@EnableAutoConfiguration
@Configuration
@EnableWebMvc
@EnableDiscoveryClient
public class HelloMicroServiceProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloMicroServiceProducerApplication.class, args);
	}

}
