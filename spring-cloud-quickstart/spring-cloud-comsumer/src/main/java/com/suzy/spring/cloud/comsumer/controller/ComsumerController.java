package com.suzy.spring.cloud.comsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.suzy.spring.cloud.common.BizException;
import com.suzy.spring.cloud.common.CalcDO;
import com.suzy.spring.cloud.common.CalcResult;
import com.suzy.spring.cloud.common.service.ICalcService;
import com.suzy.spring.cloud.model.UserInfoDo;

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
	
	@RequestMapping("saveUser")
	public UserInfoDo saveUser(@RequestBody UserInfoDo user){
		return calcService.saveUser(user);
	}
	@RequestMapping("saveUserException")
	public UserInfoDo saveUserException(@RequestBody UserInfoDo user){
		return calcService.saveUserException(user);
	}
	@RequestMapping("updateUser")
	public UserInfoDo updateUser(@RequestBody UserInfoDo user){
		user = calcService.updateUser(user);
		return user;
	}
	
	@RequestMapping("findUser")
	public UserInfoDo findUser(@RequestParam("id") int id){
		return calcService.findUser(id);
	}
	@RequestMapping("findLastUser")
	public UserInfoDo findLastUser(){
		return calcService.findLastUser();
	}
}

