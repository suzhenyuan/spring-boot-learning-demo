package com.suzy.stream.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableAutoConfiguration
public class StreamConsumerApplication {
	public static void main(String[] args) {
		SpringApplication.run(StreamConsumerApplication.class, args);
		System.out.println("kafka consumer started");
	}
}
