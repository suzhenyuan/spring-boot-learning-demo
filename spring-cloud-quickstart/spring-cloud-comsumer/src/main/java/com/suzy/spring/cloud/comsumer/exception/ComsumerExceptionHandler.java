package com.suzy.spring.cloud.comsumer.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.alibaba.fastjson.JSONObject;
import com.suzy.spring.cloud.common.BizException;

import feign.FeignException;

@ControllerAdvice
public class ComsumerExceptionHandler {
	@ExceptionHandler(Throwable.class)
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	@ResponseBody
	public BizException processUnauthenticatedException(HttpServletRequest request, HttpServletResponse response, Throwable e) throws Throwable {
		if( e instanceof BizException){
			return (BizException)e;
		}else if(e instanceof FeignException){
			JSONObject m = JSONObject.parseObject(e.toString());
			System.out.println(m.get("code"));
			System.out.println(m.get("msg"));
			return new BizException(m.getInteger("code"),m.getString("msg"));
		}else{
			return new BizException(999,e.getMessage());
		}
	}
}
