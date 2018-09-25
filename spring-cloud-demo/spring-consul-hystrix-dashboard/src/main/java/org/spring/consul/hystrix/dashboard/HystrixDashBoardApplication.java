package org.spring.consul.hystrix.dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@SpringBootApplication
@EnableTurbine
@EnableHystrix
@EnableDiscoveryClient
@EnableHystrixDashboard
public class HystrixDashBoardApplication {

	public static void main(String[] args) {
		SpringApplication.run(HystrixDashBoardApplication.class, args);
		System.out.println("------- consul hystrix dashboard--------------");
	}
}
