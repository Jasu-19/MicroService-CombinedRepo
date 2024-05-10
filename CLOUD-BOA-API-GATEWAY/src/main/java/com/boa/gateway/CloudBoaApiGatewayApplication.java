package com.boa.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Import;

import com.boa.gateway.config.SpringRouteConfig;

@SpringBootApplication
//@EnableDiscoveryClient
@Import({SpringRouteConfig.class})
public class CloudBoaApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudBoaApiGatewayApplication.class, args);
	}

}
