package com.suzy.spring.security.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableAutoConfiguration
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		SpringApplication.run(App.class, args);
		System.out.println("Server started");
	}
}
