/**
 * 
 */
package com.citi.restservice;


import org.springframework.stereotype.Repository;

//Data Service is like DAO in the project. Here is the sample data
@Repository
public class DataService {
	public int[] retrieveAllData() {
		// Some dummy data
		// Actually this should talk to some database to get all the data
		return new int[] { 1, 2, 3, 4, 5 };
	}
}

