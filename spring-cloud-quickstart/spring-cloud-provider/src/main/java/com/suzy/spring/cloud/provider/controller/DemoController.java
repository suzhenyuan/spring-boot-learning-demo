package com.suzy.spring.cloud.provider.controller;


import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.suzy.spring.cloud.common.BizException;
import com.suzy.spring.cloud.common.CalcDO;
import com.suzy.spring.cloud.common.CalcResult;

import com.suzy.spring.cloud.common.service.ICalcService;


@RestController
@RequestMapping("demo")
public class DemoController {
public class DemoController implements ICalcService{

	@RequestMapping("calc")
	public CalcResult calc(@RequestBody CalcDO calc ,@RequestParam("desc") String desc) {
	public CalcResult addItem(@RequestBody CalcDO calc ,@RequestParam("desc") String desc) {
		System.out.println(desc);
		CalcResult r = new CalcResult();
		r.setZ(calc.getX()+calc.getY());
		return r;
	}




	@RequestMapping(value = "remoteExcept/{type}")
	public int remoteExcept(@RequestParam("type") int type) {
		System.out.println("provider收到了消息："+type);
		if(type==0){
			throw new BizException(500,"后台异常");
		}else if(type == 1){
			throw new NullPointerException("空指针异常");
		}
		return type;
	}

	@RequestMapping("saveUser")
	public UserInfoDo saveUser(@RequestBody UserInfoDo userInfoDo){
		return userInfoDao.saveUser(userInfoDo);
	}
	@RequestMapping("updateUser")
	public UserInfoDo updateUser(@RequestBody UserInfoDo userInfoDo){
		return userInfoDao.updateUser(userInfoDo);
	}
	@RequestMapping("findUser")
	public UserInfoDo findUser(@RequestParam("id") int id){
		return userInfoDao.findUser(id);
	}

}
