
package com.citi.testrest;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import javax.ws.rs.core.MediaType;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import com.citi.restservice.EmployeeController;
import com.example.demo.CitiProjectRestApplication;



@RunWith(SpringJUnit4ClassRunner.class)

@WebMvcTest(EmployeeController.class)
@WebAppConfiguration
@ContextConfiguration(classes=CitiProjectRestApplication.class)

class EmployeeControllerTest {
	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void helloWorld_basic() throws Exception {
		//call GET "/hello-world"  application/json
		
		RequestBuilder request = MockMvcRequestBuilders
				.get("/employee")
				.accept(MediaType.APPLICATION_JSON);
		
		MvcResult result = mockMvc.perform(request)
				.andExpect(status().isOk())
				.andExpect(content().string("Hello World"))
				.andReturn();
	
		//verify "Hello World"
		assertEquals("My Hello Rest", result.getResponse().getContentAsString());
	}
	
	
}
