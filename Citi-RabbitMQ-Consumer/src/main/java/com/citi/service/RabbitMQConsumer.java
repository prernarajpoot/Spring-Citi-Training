package com.citi.service;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


import com.citi.model.Employee;

@Component
@Configuration
public class RabbitMQConsumer {

	@RabbitListener(queues = "${citi.rabbitmq.queue}")
	public void recievedMessage(Employee employee) {
		System.out.println("Recieved Message From RabbitMQ: " + employee);
	}
	
	@Bean
	public MessageConverter jsonMessageConverter() {
		return new Jackson2JsonMessageConverter();
	}
	
}
