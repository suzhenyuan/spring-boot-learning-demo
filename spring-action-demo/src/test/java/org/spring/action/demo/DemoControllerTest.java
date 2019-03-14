package org.spring.action.demo;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.header;

import org.junit.Test;
import org.spring.action.demo.controllers.DemoController;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

public class DemoControllerTest {

	@Test
	public void testHomePage(){
		DemoController ct = new DemoController();
		MockMvc mm = MockMvcBuilders.standaloneSetup(ct).build();
		try {
			mm.perform(get("/demo/hello")).andExpect(header().exists("Content-Length"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
