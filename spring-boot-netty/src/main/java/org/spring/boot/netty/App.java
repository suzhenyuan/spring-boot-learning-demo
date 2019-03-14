package org.spring.boot.netty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@ComponentScan(basePackages={"org.spring.boot.netty.nettyserver","org.spring.boot.netty.controllers"})
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		SpringApplication.run(App.class, args);
	}
}
