package com.citi.client;

import static org.junit.Assert.*;

import org.junit.*;
import org.junit.Test;
import org.junit.After;
import org.junit.Before;

import com.citi.bean.Employee;
import com.citi.service.EmployeeService;


public class EmployeeTest {
	
	EmployeeService empBusinessLogic = null;
	Employee employee = null;
	
	//Junit life cycle method it execute before the test case
	@Before
	public void setUp() throws Exception {
		
		// before
		System.out.println("before");
		
		
		}

	// after the test case
	@After
	public void tearDown() throws Exception {
		// after
		System.out.println("after");
	
	}

	
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	// test to check yearly salary
	   @Test
	   public void testCalculateYearlySalary() {
	      employee.setName("Amit");
	      employee.setAge(25);
	      employee.setMonthlySalary(8000);
			
	      double salary = empBusinessLogic.calculateYearlySalary(employee);
	      assertEquals(96000, salary, 0.0);
	   }
	   //test to check appraisal
	   @Test
	   public void testCalculateAppriasal() {
	      employee.setName("Amit");
	      employee.setAge(25);
	      employee.setMonthlySalary(8000);
			
	      double appraisal = empBusinessLogic.calculateAppraisal(employee);
	      assertEquals(500, appraisal, 0.0);
	   }



}
