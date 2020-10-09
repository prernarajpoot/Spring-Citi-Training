/**
 * 
 */
package com.citi.client;


import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;


public class EmployeeControllerClient {

	
	@Autowired
	private DiscoveryClient discoveryClient;
	
	@GetMapping("/consume")
	public ResponseEntity<String> getEmployee() throws RestClientException, IOException {
		
		List<ServiceInstance> instances=discoveryClient.getInstances("employee-producer");
		ServiceInstance serviceInstance=instances.get(0);
		
		String baseUrl=serviceInstance.getUri().toString();
		
		baseUrl=baseUrl+"/employee";
		
		System.out.println("in call");
		
		//Rest Template is using for intercommunication of microservices
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String>  response=null;
		//HttpEntity response=null;
		try{
		response=restTemplate.exchange(baseUrl,
				HttpMethod.GET, getHeaders(),String.class);
		}catch (Exception ex)
		{
			System.out.println(ex);
		}
		System.out.println(response.getBody());
		return new ResponseEntity<String>(response.getBody(), HttpStatus.OK);
	}

	private static HttpEntity<?> getHeaders() throws IOException {
		HttpHeaders headers = new HttpHeaders();
		headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);
		return new HttpEntity<>(headers);
	}
	
	
}
