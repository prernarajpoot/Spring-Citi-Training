

package com.citi.dao;

import java.util.List;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.citi.bean.Employee;
import com.citi.dao.EmployeeDao;


@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	
	//create ref of logger here
	 Logger logger = LoggerFactory.getLogger(EmployeeDaoImpl.class);
//setter injection
	private JdbcTemplate jdbcTemplateObject;
	
	@Autowired
	 public void setDataSource(DataSource dataSource){
	        this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	    }
	
	public void setupDB() {
		
		jdbcTemplateObject.execute("DROP TABLE employee IF EXISTS");
		
		jdbcTemplateObject.
		execute("CREATE TABLE employee"
				+ "(" + "name VARCHAR(255), age INT, id SERIAL)");
	}
	
	
	
	
	
	
	@Override
	@Transactional
	public void create(String name, Integer age) {
		// TODO Auto-generated method stub
		
		
		String SQL = "insert into employee (name, age) values (?, ?)";
	      
	 jdbcTemplateObject.update( SQL, name, age);
	 System.out.println("Created Record Name = " + name + " Age = " + age);
	
	 return;
		
	}
	
	@Override
	public Employee getEmployee(Integer id) {
		// TODO Auto-generated method stub
		
		String SQL = "select * from employee where id = ?";
	      Employee employee = jdbcTemplateObject.queryForObject(SQL, 
	                        new Object[]{id}, new EmployeeMapper());
	      //System.out.println("value", jdbcTemplateObject.queryForObject(SQL, 
	                       // new Object[]{id}, new EmployeeMapper()));;
	                        System.out.println("value of emp-->" +employee.toString());
	      return employee;
	}

	@Override
	@Transactional
	public List<Employee> listEmployees() {
		// TODO Auto-generated method stub
		 String SQL = "select * from employee";
	      List <Employee> employees = jdbcTemplateObject.query(SQL, 
	                                new EmployeeMapper());
	      System.out.println("in debug");
	      return employees;
	}

	
			
	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
		 String SQL = "delete from employee where id = ?";
	      jdbcTemplateObject.update(SQL, id);
	      System.out.println("Deleted Record with ID = " + id );
	      return;
	}

	@Override
	public void update(Integer id, Integer age) {
		// TODO Auto-generated method stub
		 String SQL = "update employee set age = ? where id = ?";
	      jdbcTemplateObject.update(SQL, age, id);
	      System.out.println("Updated Record with ID = " + id );
	      return;
	}


	

	
	
	
}
