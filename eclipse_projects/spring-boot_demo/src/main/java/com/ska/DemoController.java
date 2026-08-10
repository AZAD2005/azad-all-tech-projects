package com.ska;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	
	@GetMapping(path = "/welMsg")
	public String m1() {
		return "Hii Welcome to Spring-Boot Projects..!";
	}
	
	@GetMapping(path = "/fetchFullName/{fName}")
	public String m1(@PathVariable("fName") String fName) {
		return String.format("Hii your firstName is  : " + fName);
		
	}

}
