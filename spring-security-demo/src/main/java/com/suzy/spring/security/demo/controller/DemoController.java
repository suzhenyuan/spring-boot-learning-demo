package com.suzy.spring.security.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@ResponseBody
	@RequestMapping("/")
	public String index() {
		return "It works!";
	}

	@ResponseBody
	@RequestMapping("hello")
	public String hello() {
		return "hello,world!";
	}
}
