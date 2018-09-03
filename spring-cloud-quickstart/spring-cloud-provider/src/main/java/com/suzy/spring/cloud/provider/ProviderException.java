package com.suzy.spring.cloud.provider;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.suzy.spring.cloud.common.BizException;

@ControllerAdvice
public class ProviderException {
	
	@ExceptionHandler(Throwable.class)
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	@ResponseBody
	public BizException processUnauthenticatedException(HttpServletRequest request, HttpServletResponse response, Throwable e) throws Throwable {
		response.addHeader("biz", "exception");
		if( e instanceof BizException){
			return (BizException)e;
		}else{
			return new BizException(999,e.getMessage());
		}
	}
}
