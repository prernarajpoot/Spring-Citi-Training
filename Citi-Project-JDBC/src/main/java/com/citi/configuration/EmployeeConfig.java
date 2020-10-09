/**
 * 
 */
package com.citi.configuration;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.context.annotation.ComponentScan;

@Configuration
@ComponentScan({"com.citi.*"})
public class EmployeeConfig {

	 @Bean
	    public DataSource dataSource() {
	        DriverManagerDataSource dataSource = new DriverManagerDataSource();
	        //MySQL database we are using
	        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
	        dataSource.setUrl("jdbc:mysql://localhost:3306/classicmodels");//change url
	        dataSource.setUsername("root");//change userid
	        dataSource.setPassword("1234");//change pwd
	        
	        //H2 database
	        /*
	        dataSource.setDriverClassName("org.h2.Driver");
	        dataSource.setUrl("jdbc:h2:tcp://localhost/~/test");
	        dataSource.setUsername("sa");
	        dataSource.setPassword("");*/
	        return dataSource;
	    }
	 
	    @Bean
	    public JdbcTemplate jdbcTemplate() {
	        JdbcTemplate jdbcTemplate = new JdbcTemplate();
	        jdbcTemplate.setDataSource(dataSource());
	        return jdbcTemplate;
	    }
	 
	  //  @Bean
	  //  public EmployeeDao employeeDAO(){
	   //  EmployeeDaoImpl empDao = new EmployeeDaoImpl();
	    // empDao.setJdbcTemplate(JdbcTemplate());
	   //  return empDao;
	   // }
	
}
