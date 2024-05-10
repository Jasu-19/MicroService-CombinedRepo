/**
 * 
 */
package com.boa.demo.service;

import org.springframework.stereotype.Service;

/**
 * @author Jasmine
 *
 */
@Service
public class HelloWorldImpl implements HelloWorld{

	@Override
	public String sayHellWorld(String msg) {
		// TODO Auto-generated method stub
		System.out.println("In the Service method");
		
		return "Hello World Service with Call name -->" +msg;
	}
	
	
	

}
