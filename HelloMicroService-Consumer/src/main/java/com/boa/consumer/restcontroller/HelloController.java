package com.boa.consumer.restcontroller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;



@RestController
public class HelloController {
	
	@Autowired
	DiscoveryClass discoveryClass;

	@RequestMapping(value = "/getMessage", produces = "plain/text", method = RequestMethod.GET)
	public ResponseEntity<String> getMessage() throws RestClientException, IOException {
		return discoveryClass.discoveryResult("HELLOMICROSERVICE-PRODUCER", "/api/lookup", HttpMethod.GET);
	}

		
		

		


}
