package com.suzy.stream.provider;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.integration.config.EnableIntegration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.suzy.stream.common.pojos.OrderInfo;
import com.suzy.stream.provider.service.ProviderService;

/**
 * Hello world!
 *
 */
@EnableAutoConfiguration
@SpringBootApplication
@RestController
@RequestMapping("/")
public class StreamProviderApplication {

	@Autowired
	private ProviderService providerService;

	public static void main(String[] args) {
		SpringApplication.run(StreamProviderApplication.class, args);
		System.out.println("server started");
	}

	@RequestMapping("")
	@ResponseBody
	public String index() {
		return "it works";
	}

	@RequestMapping("sendOrder")
	@ResponseBody
	public String sendOrder() {
		OrderInfo info = new OrderInfo();
		info.setAge(5623);
		info.setAmount(BigDecimal.TEN);
		info.setName("hello,world");
		info.setCreateTime(new Date());
		info.setModify(true);
		return providerService.sendOrderInfo(info) + "";
	}
}
