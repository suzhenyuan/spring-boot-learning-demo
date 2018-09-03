package com.suzy.spring.cloud.comsumer.handler;

import java.io.IOException;

import org.apache.commons.io.IOUtils;

import com.alibaba.fastjson.JSONObject;
import com.suzy.spring.cloud.common.BizException;

import feign.Response;
import feign.codec.ErrorDecoder;

public class FeignErrorDecoder implements ErrorDecoder{

	public Exception decode(String methodKey, Response response) {
		try {
			String body = IOUtils.toString(response.body().asInputStream());
			System.out.println(body);
			JSONObject m = JSONObject.parseObject(body);
			System.out.println(m.get("code"));
			System.out.println(m.get("msg"));
			return new BizException(m.getInteger("code"),m.getString("msg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return new Default().decode(methodKey, response);
	}

}
