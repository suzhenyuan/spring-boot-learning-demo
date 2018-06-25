package com.suzy.spring.boot.quickstart.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class HelloController {
	
	@RequestMapping({"","index.do"})
	public String index() {
		return "Greetings from Spring Boot!";
	}
}
