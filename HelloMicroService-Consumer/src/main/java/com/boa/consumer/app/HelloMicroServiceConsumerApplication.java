package com.boa.consumer.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@ComponentScan({"com.boa.*"})
@EnableDiscoveryClient
@EnableWebMvc
public class HelloMicroServiceConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloMicroServiceConsumerApplication.class, args);
	}

}
