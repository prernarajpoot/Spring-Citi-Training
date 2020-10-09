/**
 * 
 */
package com.citi.bean;

/**
 * @author indianrenters
 *
 */
//This is a POJO class which treat by SC  as a bean
public class HelloWorld {
      private String citiMessage;

      //Setter injection for citi message here
	public String getCitiMessage() {
		return citiMessage;
	}

	public void setCitiMessage(String citiMessage) {
		this.citiMessage = citiMessage;
	}
	
	public void display() {
		System.out.println(citiMessage);
	}
      
}
