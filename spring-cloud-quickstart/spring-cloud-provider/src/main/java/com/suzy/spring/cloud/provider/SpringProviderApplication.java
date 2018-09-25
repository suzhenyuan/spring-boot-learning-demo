package com.suzy.spring.cloud.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ImportResource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement 
@EnableAutoConfiguration
@SpringBootApplication
@EnableDiscoveryClient
@ImportResource(locations="classpath:spring/spring.xml")
public class SpringProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringProviderApplication.class, args);
	}

}
