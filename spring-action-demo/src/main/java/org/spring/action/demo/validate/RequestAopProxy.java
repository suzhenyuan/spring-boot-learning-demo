package org.spring.action.demo.validate;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
public class RequestAopProxy {
	@Pointcut("execution(* org.spring.action.demo.validate.RequestTarget.doAround(..))")
	public void doAroundPc() {
	};
	
	@Around("doAroundPc()")
	public void doAroundMethod(ProceedingJoinPoint jp) throws Throwable {
		System.out.println("before RequestAopProxy");
		jp.proceed();
		System.out.println("after RequestAopProxy");
	}
}
