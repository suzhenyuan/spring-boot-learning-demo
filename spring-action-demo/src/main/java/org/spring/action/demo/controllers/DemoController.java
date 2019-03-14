package org.spring.action.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("demo")
public class DemoController {

	@RequestMapping("hello")
	public String hello() {
		return "hello";
	}
}
