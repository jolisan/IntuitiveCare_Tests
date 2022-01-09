package com.intuitivecare.api.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest
public class OperadoraControllerTest {
	
	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void mustReturnSucess_withValidParamaters() throws Exception{
		//mockMvc.perform(MockMvcRequestBuilders.get("/api/operadora/search").param("texto", "Rio de"))
		//.andExpect(MockMvcResultMatchers.status().isOk())
		//.andExpect(MockMvcResultMatchers.content().json("{\"registroANS\":\""));
	}
}
