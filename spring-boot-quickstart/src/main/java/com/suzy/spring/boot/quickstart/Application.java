package com.suzy.spring.boot.quickstart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

import com.suzy.spring.boot.quickstart.models.CarConfig;


/**
 * Hello world!
 *
 */
@EnableEurekaServer
@SpringBootApplication
@EnableAutoConfiguration
@EnableAsync(proxyTargetClass=true)
@ComponentScan(basePackageClasses={Application.class,CarConfig.class})

public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
