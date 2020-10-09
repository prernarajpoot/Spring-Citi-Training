package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@EnableAutoConfiguration
@Configuration
@ComponentScan({"com.citi.*"})
@EnableDiscoveryClient
@SpringBootApplication
public class CitiEmployeeProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CitiEmployeeProducerApplication.class, args);
	}

}
