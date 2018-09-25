package com.suzy.spring.cloud.provider.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.suzy.spring.cloud.common.BizException;
import com.suzy.spring.cloud.common.CalcDO;
import com.suzy.spring.cloud.common.CalcResult;

import com.suzy.spring.cloud.common.service.ICalcService;
import com.suzy.spring.cloud.model.UserInfoDo;
import com.suzy.spring.cloud.provider.dao.IUserInfoDao;


@RestController
@RequestMapping("demo")
public class DemoController implements ICalcService{

	@Autowired
	private IUserInfoDao userInfoDao;
	
	@RequestMapping("calc")
	public CalcResult addItem(@RequestBody CalcDO calc ,@RequestParam("desc") String desc) {
		System.out.println(desc);
		CalcResult r = new CalcResult();
		r.setZ(calc.getX()+calc.getY());
		return r;
	}

	@RequestMapping(value = "remoteExcept/{type}")
	public int remoteExcept(@RequestParam("type") int type) {
		System.out.println("provider exception"+type);
		if(type==0){
			throw new BizException(500,"exception");
		}else if(type == 1){
			throw new NullPointerException("null point exception");
		}
		return type;
	}

	@Override
	@Transactional
	@RequestMapping("saveUser")
	public UserInfoDo saveUser(@RequestBody UserInfoDo userInfoDo){
		userInfoDo = userInfoDao.saveUser(userInfoDo);
		UserInfoDo lu =userInfoDao.queryLastUser();
		System.out.printf("这是正常保存:%s,%s,%s\n",lu.getId(),lu.getName(),lu.getRemark());
		return lu;
		
	}
	@Override
	@Transactional
	@RequestMapping("updateUser")
	public UserInfoDo updateUser(@RequestBody UserInfoDo userInfoDo){
		userInfoDo= userInfoDao.updateUser(userInfoDo);
		throw new BizException(99, "异常");
	}
	@Override
	@RequestMapping("findUser")
	public UserInfoDo findUser(@RequestParam("id") int id){
		return userInfoDao.findUser(id);
	}

	@Override
	@RequestMapping("findLastUser")
	public UserInfoDo findLastUser() {
		return userInfoDao.queryLastUser();
	}

	@Transactional
	@Override
	@RequestMapping("saveUserException")
	public UserInfoDo saveUserException(@RequestBody UserInfoDo user) {
		user = userInfoDao.saveUser(user);
		UserInfoDo lu =userInfoDao.queryLastUser();
		System.out.printf("这是异常保存:%s,%s,%s\n",lu.getId(),lu.getName(),lu.getRemark());
		throw new BizException(99, "异常",lu);
	}

}
