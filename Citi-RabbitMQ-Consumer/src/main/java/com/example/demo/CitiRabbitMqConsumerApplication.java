package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@EnableAutoConfiguration
@Configuration
@ComponentScan({"com.citi.*"})
@SpringBootApplication
public class CitiRabbitMqConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CitiRabbitMqConsumerApplication.class, args);
	}

}
