package com.suzy.dubbo.comsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(locations="classpath:spring-application.xml")
public class DubboComsumerApplication {

	public static void main(String[] args){
		SpringApplication.run(DubboComsumerApplication.class, args);
	}
}
