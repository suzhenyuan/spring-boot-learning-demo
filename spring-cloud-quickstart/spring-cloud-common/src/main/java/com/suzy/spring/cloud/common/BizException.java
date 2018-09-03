package com.suzy.spring.cloud.common;

public class BizException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -410521855053690850L;

	private int code;
	private String msg;

	
	public BizException() {
	}

	public BizException(int code, String msg) {
		this.code = code;
		this.msg = msg;
	}
	
	@Override
	public Throwable fillInStackTrace(){
		return this;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}
