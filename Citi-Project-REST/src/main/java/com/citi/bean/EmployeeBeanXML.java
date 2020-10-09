/**
 * 
 */
package com.citi.bean;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author indianrenters
 *
 */
@XmlRootElement
public class EmployeeBeanXML {
	 private int employeeId;
	    private String employeeName;
	    private String emploeeAddress;
	    
	    
	    //Setter getter
		public int getEmployeeId() {
			return employeeId;
		}
		public void setEmployeeId(int employeeId) {
			this.employeeId = employeeId;
		}
		public String getEmployeeName() {
			return employeeName;
		}
		public void setEmployeeName(String employeeName) {
			this.employeeName = employeeName;
		}
		public String getEmployeeAdress() {
			return emploeeAddress;
		}
		public void setEmploeeAddress(String emploeeAddress) {
			this.emploeeAddress = emploeeAddress;
		}
}
