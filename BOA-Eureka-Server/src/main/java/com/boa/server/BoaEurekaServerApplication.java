package com.boa.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class BoaEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BoaEurekaServerApplication.class, args);
	}

}
