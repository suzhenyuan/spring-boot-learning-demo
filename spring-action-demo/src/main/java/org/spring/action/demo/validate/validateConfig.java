package org.spring.action.demo.validate;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configurable
@EnableAspectJAutoProxy
public class validateConfig {

	@Bean
	public RequestTarget requestTarget(){
		return new RequestTarget();
	}
	
	@Bean
	public RequestAopProxy requestAopProxy(){
		return new RequestAopProxy();
	}
}
