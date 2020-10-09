/**
 * 
 */
package com.citi.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author indianrenters
 *
 */
@Configuration
public class AppConfig {
	@Bean(name="helloBean")
    public HelloWorldImpl helloWorld() {
        return new HelloWorldImpl();
    }

}
