package com.suzy.spring.cloud.common.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.suzy.spring.cloud.common.CalcDO;
import com.suzy.spring.cloud.common.CalcResult;
import com.suzy.spring.cloud.model.UserInfoDo;

@FeignClient("demo-spring-provider")
public interface ICalcService {
	@RequestMapping(value = "/demo/calc", method = RequestMethod.POST)
	CalcResult addItem(@RequestBody CalcDO calc, @RequestParam("desc") String desc);

	@RequestMapping(value = "/demo/remoteExcept/{type}")
	int remoteExcept(@RequestParam("type") int type);

	@RequestMapping(value = "/demo/saveUser")
	UserInfoDo saveUser(@RequestBody UserInfoDo userInfoDo);

	@RequestMapping(value = "/demo/updateUser")
	UserInfoDo updateUser(@RequestBody UserInfoDo userInfoDo);

	@RequestMapping(value = "/demo/findUser")
	UserInfoDo findUser(@RequestParam("id") int id);
	@RequestMapping(value = "/demo/findLastUser")
	UserInfoDo findLastUser();
	@RequestMapping(value = "/demo/saveUserException")
	UserInfoDo saveUserException(@RequestBody UserInfoDo user);
}
