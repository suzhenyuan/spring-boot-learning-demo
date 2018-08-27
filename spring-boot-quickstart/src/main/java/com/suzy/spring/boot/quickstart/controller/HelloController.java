package com.suzy.spring.boot.quickstart.controller;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class HelloController {
	
	@RequestMapping("")
	public String index() {
		return "Greetings from Spring Boot!";
	}
	@RequestMapping("test")
	public String test(HttpServletRequest request, HttpServletResponse response) {
		try {
			InputStream is = request.getInputStream();
			String string = IOUtils.toString(is);
			System.out.println(request.getContentType().toString());
			System.out.println("inputStrwam:"+string);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Greetings from Spring Boot!";
	}
}
