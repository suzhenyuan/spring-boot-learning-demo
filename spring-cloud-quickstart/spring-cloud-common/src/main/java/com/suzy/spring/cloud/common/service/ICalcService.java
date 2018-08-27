package com.suzy.spring.cloud.common.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.suzy.spring.cloud.common.CalcDO;
import com.suzy.spring.cloud.common.CalcResult;

@FeignClient("demo-spring-provider")
public interface ICalcService {
	@RequestMapping(value = "/demo/calc", method = RequestMethod.POST)
	CalcResult addItem(@RequestBody CalcDO calc, @RequestParam("desc") String desc);

}
