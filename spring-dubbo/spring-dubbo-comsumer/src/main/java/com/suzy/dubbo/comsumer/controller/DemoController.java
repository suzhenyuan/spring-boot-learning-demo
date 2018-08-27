package com.suzy.dubbo.comsumer.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.suzy.dubbo.common.IDemoService;

@RestController
@RequestMapping("demo")
public class DemoController {

	@Autowired
	private IDemoService demoService;
	
	@RequestMapping("add")
	public int add(HttpServletRequest request){
		int x = Integer.parseInt(request.getParameter("x"));
		int y = Integer.parseInt(request.getParameter("y"));
		return demoService.add(x, y);
	}
}
