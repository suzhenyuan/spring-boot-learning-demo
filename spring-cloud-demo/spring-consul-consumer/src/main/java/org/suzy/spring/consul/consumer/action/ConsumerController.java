package org.suzy.spring.consul.consumer.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.suzy.spring.consul.common.model.CalcParam;
import org.suzy.spring.consul.common.model.CalcResult;
import org.suzy.spring.consul.common.service.IDemoService;

@RestController
@RequestMapping("consumer")
public class ConsumerController {

	@Autowired
	private IDemoService demoService;
	
	@RequestMapping("calc")
	public CalcResult calc(@RequestParam("x")int x, @RequestParam("y") int y) {
		CalcParam param = new CalcParam();
		param.setX(x);
		param.setY(y);
		return demoService.calc(param);
	}
	@RequestMapping("test")
	public String test() {
		return "It works on consumer";
	}
}
