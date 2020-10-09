/**
 * 
 */
package com.citi.restservice;

import javax.ws.rs.core.MediaType;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.citi.bean.EmployeeBean;
import com.citi.bean.EmployeeBeanXML;

/**
 * @author Alankrit
 *
 */

@RestController
public class EmployeeController {

	//HTTP GET method implementation for Employee Service
	@GetMapping("/employee")
	public String getEmployees() {
		return "My Hello Rest";
	}
		
	//HTTP GET method for Employee details 

	@RequestMapping(produces = MediaType.APPLICATION_XML, 
		    method = RequestMethod.GET,
		    value = "/detailsXML")
		@ResponseBody
			public EmployeeBeanXML detailsXML(){
				
		
				EmployeeBeanXML employeeBean=new EmployeeBeanXML();
				employeeBean.setEmployeeId(101);
				employeeBean.setEmployeeName("Prerna");
				employeeBean.setEmploeeAddress("Debai");
				
				return employeeBean;
				
			}


}
