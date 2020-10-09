/**
 * 
 */
package com.citi.service;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.citi.model.Employee;

//Service is responsible for send the message

@Service
public class RabbitMQSender {
	@Autowired
	private AmqpTemplate amqpTemplate;
	
	@Value("${citi.rabbitmq.exchange}")
	private String exchange;
	
	@Value("${citi.rabbitmq.routingkey}")
	private String routingkey;	
	String kafkaTopic = "java_in_use_topic";
	
	public void send(Employee company) {
		amqpTemplate.convertAndSend(exchange, routingkey, company);
		System.out.println("Send msg = " + company);
	}

}
