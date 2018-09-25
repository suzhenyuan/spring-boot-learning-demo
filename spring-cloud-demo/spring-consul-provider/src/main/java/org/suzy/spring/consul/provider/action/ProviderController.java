package org.suzy.spring.consul.provider.action;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.suzy.spring.consul.common.model.CalcParam;
import org.suzy.spring.consul.common.model.CalcResult;
import org.suzy.spring.consul.common.service.IDemoService;

@RestController
@RequestMapping("provider")
public class ProviderController implements IDemoService {

	@Override
	@RequestMapping("calc")
	public CalcResult calc(@RequestBody CalcParam param) {
		CalcResult r = new CalcResult();
		r.setResult(param.getX() + param.getY());
		return r;
	}
	@RequestMapping("test")
	public String test() {
		return "It works";
	}
}
