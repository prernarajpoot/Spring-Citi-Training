
package com.citi.restservice;

import org.springframework.stereotype.Service;

@Service
public class BusinessService {

	// Can do @Autowired too
	private DataService dataService;

	//Constructor Injection
	public BusinessService(DataService dataService) {
		super();
		this.dataService = dataService;
	}

	public int findTheGreatestFromAllData() {
		int[] data = dataService.retrieveAllData();
		int greatest = Integer.MIN_VALUE;

		for (int value : data) {
			if (value > greatest) {
				greatest = value;
			}
		}
		return greatest;
	}

}
