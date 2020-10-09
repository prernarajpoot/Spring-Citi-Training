package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.citi.annotation.AppConfig;
import com.citi.bean.HelloWorld;

@SpringBootApplication
public class CitiProjectApplication {

	public static void main(String[] args) {
		//SpringApplication.run(CitiProjectApplication.class, args);
	    //Annotation Style Configuration
		ApplicationContext context =SpringApplication.run(AppConfig.class);
	    HelloWorld obj = (HelloWorld) context.getBean("helloBean");
	    
	    obj.printCitiMessage("Spring5 Java Config");

	    
	    
	    
	    
	    
	    
	    //XML STYLE Configuration
	    //HelloWorld hw = new HelloWorld();
		//ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
	//HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
	//helloWorld.display();

	}

}
