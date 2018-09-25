package com.suzy.spring.cloud.comsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableDiscoveryClient
@SpringBootConfiguration
@EnableFeignClients(basePackages={"com.suzy.spring.cloud.common"})
@EnableAutoConfiguration
//@ComponentScan(basePackages={"com.suzy.spring.cloud","com.suzy.spring.cloud.common.service","com.suzy.spring.cloud.comsumer.controller"})
public class SpringComsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringComsumerApplication.class, args);
	}
}
