package com.suzy.spring.cloud.provider.controller;


import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.suzy.spring.cloud.common.CalcDO;
import com.suzy.spring.cloud.common.CalcResult;

@RestController
@RequestMapping("demo")
public class DemoController {

	@RequestMapping("calc")
	public CalcResult calc(@RequestBody CalcDO calc ,@RequestParam("desc") String desc) {
		System.out.println(desc);
		CalcResult r = new CalcResult();
		r.setZ(calc.getX()+calc.getY());
		return r;
	}
}
