package com.boa.crs.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
@EnableJpaRepositories("com.boa.crs.app.repo")
@ComponentScan({"com.boa.*"})
@EnableAutoConfiguration
@Configuration
@EnableWebMvc
@EnableDiscoveryClient
@SpringBootApplication
public class PaymentCrsProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaymentCrsProducerApplication.class, args);
	}

}
