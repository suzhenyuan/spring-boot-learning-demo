package com.suzy.dubbo.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(locations = { "classpath:spring-application.xml" })
public class DubboProviderApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SpringApplication.run(DubboProviderApplication.class, args);
	}

}
