package com.suzy.spring.cloud.provider;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.alibaba.fastjson.JSONObject;
import com.suzy.spring.cloud.common.BizException;

@ControllerAdvice
public class ProviderException {
	
	@ExceptionHandler(Throwable.class)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public void processUnauthenticatedException(HttpServletRequest request, HttpServletResponse response, Throwable e) throws Throwable {
		if (e instanceof BizException) {
			
			String json = JSONObject.toJSONString(e);
			((BizException) e).setJson(json);
			throw e;
		}
	}
}
