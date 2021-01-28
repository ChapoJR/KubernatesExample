package com.nobelsoft.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestService {
	@GetMapping("/testService")
	public String testService() {
		return "This is a Test";
	}
	
	@GetMapping("/testService2")
	public String testService2() {
		return "This is a Test 3";
	}

}
