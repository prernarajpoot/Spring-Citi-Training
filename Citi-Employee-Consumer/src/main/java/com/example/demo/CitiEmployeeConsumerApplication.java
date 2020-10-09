package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.citi.*"})
@EnableDiscoveryClient
@SpringBootApplication
public class CitiEmployeeConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CitiEmployeeConsumerApplication.class, args);
	}

}
