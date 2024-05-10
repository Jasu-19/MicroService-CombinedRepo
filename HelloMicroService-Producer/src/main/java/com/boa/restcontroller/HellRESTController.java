/**
 * 
 */
package com.boa.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.boa.model.Customer;

import jakarta.ws.rs.core.MediaType;

/**
 * @author Jasmine
 *
 */
@RestController
@RequestMapping("/api")
public class HellRESTController {
	//method for first rest service
	
	@GetMapping("/lookup")
	public String helloRestService()
	{
		return "My first Rest Service -->BOA";
	}
	
	//using request mapping method impl
	
	@RequestMapping(value = "/detailsCustomer", produces = MediaType.APPLICATION_JSON, 
			method = RequestMethod.GET)
	public Customer getAllCustomerDetails()
	{
		//set some data here hard coded later look up by the service to jpa
		Customer customer = new Customer();
		customer.setCustomerId(101);
		customer.setCustomerName("BOA");
		customer.setCustomerAddress("Hyderabad");
		return customer;
	}
	


}
