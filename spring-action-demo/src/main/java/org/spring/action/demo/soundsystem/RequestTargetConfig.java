package org.spring.action.demo.soundsystem;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@Configuration
@EnableAspectJAutoProxy
public class RequestTargetConfig {

	@Bean
	public RequestProcessor requestProcessor() {
		System.out.println("requestProcessor init");
		return new RequestProcessor();
	}
}
