package com.ibm.org.services.impl;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.ibm.org.model.RepeatResponseWrapper;
import com.ibm.org.model.FtrepeatRq;
import com.ibm.org.model.RepeatP;
 
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import io.github.benas.randombeans.api.EnhancedRandom;

@WebMvcTest(RepeatTest.class)
public class RepeatTest {

	@Autowired
	private MockMvc mvc;
	
	@MockBean
	private RepeatImpl repeatImpl;
	
	@MockBean
	private RepeatResponseWrapper response;
	
	@Test
	public void testRepeat() throws Exception {
	
	FtrepeatRq ftrepeatRq =	EnhancedRandom.random(FtrepeatRq.class);
	
	ObjectMapper objectMapper = new ObjectMapper();
	ObjectWriter ow = objectMapper.writer().withDefaultPrettyPrinter();
	String requestJson = ow.writeValueAsString(ftrepeatRq);
	
	HttpHeaders httpHeaders = getHeaders();
	
	when(repeatImpl.execute(Mockito.any(RepeatP.class))).thenReturn(response);
	
	mvc.perform(MockMvcRequestBuilders.post("/v1/bian-3/core/payment/debitor/10.0.0/fundtransfer/repeat").headers(httpHeaders).accept(MediaType.APPLICATION_JSON)
				.contentType(MediaType.APPLICATION_JSON).content(requestJson)).andExpect(status().isOk());
	}
	
	public HttpHeaders getHeaders() throws Exception {

		ObjectMapper objectMapper = new ObjectMapper();
		Map<String, String> myMap = new HashMap<String, String>();
		ClassLoader classLoader = this.getClass().getClassLoader();
        File file = new File(classLoader.getResource("header.json").getFile());
		byte[] mapData = Files.readAllBytes(Paths.get( file.getAbsolutePath()));
		myMap = objectMapper.readValue(mapData, HashMap.class);

		HttpHeaders httpHeaders = new HttpHeaders();
		myMap.entrySet().stream().forEach(entry -> {
			httpHeaders.add(entry.getKey(), entry.getValue());
		});
		return httpHeaders;
	}
}