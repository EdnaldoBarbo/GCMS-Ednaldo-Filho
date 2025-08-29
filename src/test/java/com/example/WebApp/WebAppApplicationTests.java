package com.example.WebApp;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
class WebAppApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void shouldReturnDefaultMessage() throws Exception {
		this.mockMvc.perform(get("/"))
				.andDo(print()).andExpect(status().isOk())
				.andExpect(content()
						.string(containsString("Hello, World!")));
	}
	@Test
	public void shouldReturnEdnalMessage() throws Exception {
		this.mockMvc.perform(get("/ednal"))
				.andDo(print()).andExpect(status().isOk())
				.andExpect(content()
						.string(containsString("Hello, Ednaldo!"))); // <-- Ajuste aqui
	}

	@Test
	public void testHelloWorldEndpoint() throws Exception {
		mockMvc.perform(get("/hello"))
				.andExpect(status().isOk())
				.andExpect(content().string("Endpoint final"));
	}
	@Test
	public void testHotfixEndpoint() throws Exception {
		mockMvc.perform(get("/hotfix"))
				.andExpect(status().isOk())
				.andExpect(content().string("Hotfix aplicado! Versão: 1.0.1"));
	}
}
