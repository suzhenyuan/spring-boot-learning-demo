package com.suzy.spring.cloud.common;

public class BizException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -410521855053690850L;
	
	private String json;

	public String getJson() {
		return json;
	}

	public void setJson(String json) {
		this.json = json;
	}
	
	

}
