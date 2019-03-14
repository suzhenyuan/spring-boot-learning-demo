package com.suzy.spring.boot.quickstart.controller;

import java.io.IOException;
import java.io.InputStream;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.suzy.spring.boot.quickstart.models.Car;

@RestController
@RequestMapping("hello")
public class HelloController {

	@RequestMapping("")
	public String index(HttpServletRequest request, HttpServletResponse response) {
		String t = "";
		t += request.getSession().getId() + "\n";
		t += request.getSession().getAttribute("hello") + "\n";
		request.getSession().setAttribute("hello", request.getParameter("hello"));
		System.out.println(t);
		return "Greetings from Spring Boot!" + t;
	}

	@RequestMapping("test")
	public String test(HttpServletRequest request, HttpServletResponse response) {
		try {
			InputStream is = request.getInputStream();
			String string = IOUtils.toString(is);
			System.out.println(request.getContentType().toString());
			System.out.println("inputStrwam:" + string);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Greetings from Spring Boot!";
	}

	@Resource(name="car")
	private Car car;

	@RequestMapping("getCar")
	@ResponseBody
	public int curCar() {
		
		return car.getNumber();
	}

	@RequestMapping("addCar")
	@ResponseBody
	public int updateCar() {
		car.setNumber(car.getNumber()+1);
		return car.getNumber();
	}
}
