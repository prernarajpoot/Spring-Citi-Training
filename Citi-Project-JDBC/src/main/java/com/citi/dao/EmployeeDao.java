/**
 * 
 */
package com.citi.dao;

import java.util.List;

import com.citi.bean.Employee;

/**
 * @author indianrenters
 *
 */
public interface EmployeeDao {

	 public void create(String name, Integer age);
	   
	   public Employee getEmployee(Integer id);
	  
	   public List<Employee> listEmployees();
	  
	   public void delete(Integer id);
	  
	   public void update(Integer id, Integer age);
		public void setupDB();

}
