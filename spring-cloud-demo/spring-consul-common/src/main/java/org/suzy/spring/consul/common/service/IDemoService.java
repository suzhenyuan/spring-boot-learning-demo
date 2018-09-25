package org.suzy.spring.consul.common.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.suzy.spring.consul.common.model.CalcParam;
import org.suzy.spring.consul.common.model.CalcResult;

@FeignClient("consul-provider")
public interface IDemoService {

	@RequestMapping("/provider/calc")
	public CalcResult calc(@RequestBody CalcParam param);
}
