package com.suzy.spring.cloud.provider.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.suzy.spring.cloud.common.CalcDO;
import com.suzy.spring.cloud.common.CalcResult;
import com.suzy.spring.cloud.model.UserInfoDo;
import com.suzy.spring.cloud.provider.dao.IUserInfoDao;

@RestController
@RequestMapping("demo")
public class DemoController {

	@Autowired
	private IUserInfoDao userInfoDao;
	@RequestMapping("calc")
	public CalcResult calc(@RequestBody CalcDO calc ,@RequestParam("desc") String desc) {
		System.out.println(desc);
		CalcResult r = new CalcResult();
		r.setZ(calc.getX()+calc.getY());
		return r;
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
