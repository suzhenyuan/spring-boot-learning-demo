package com.suzy.spring.cloud.comsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.suzy.spring.cloud.common.CalcDO;
import com.suzy.spring.cloud.common.CalcResult;
import com.suzy.spring.cloud.common.service.ICalcService;

@RestController
@RequestMapping("comsumer")
public class ComsumerController {

	@Autowired
	ICalcService calcService;
	
	@RequestMapping("calc")
	public int calc(@RequestParam("x") int x,@RequestParam("y") int y){
		CalcDO c=new CalcDO();
		c.setX(x);
		c.setY(y);
		CalcResult r = calcService.addItem(c, "this is a demo");
		return r.getZ();
	}
	@RequestMapping("remoteExcept/{type}")
	public int remoteExcept(int type){
		return calcService.remoteExcept(type);
	}
	
}

