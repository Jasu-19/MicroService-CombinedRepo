package com.boa.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.boa.demo.configuration.AppConfig;
import com.boa.demo.service.HelloWorld;
import com.boa.demo.service.customerService;

@SpringBootApplication //Entry point of spring APP
public class SpringMicroServiceCoreBoaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(AppConfig.class);
		//SpringApplication.run(SpringMicroServiceCoreBoaApplication.class, args);
		System.out.println("Spring demo start up");
		
		
	HelloWorld obj =(HelloWorld) context.getBean("helloBean");
	System.out.println(obj.sayHellWorld("by Jasmine"));
	
	
	customerService customer = (customerService) context.getBean("customerBean");
	customer.createCustomer(1, "Jasmine", "Hyderabad");
	customer.createCustomer(2, "Shareeff", "Vijayawada");

	customer.ListAllCustomer();
	customer.updateCustomer(1, "Jasmine1", "Bhimavaram");
	customer.deleteCustomer(2);
	customer.ListAllCustomer();



	
	}

}
