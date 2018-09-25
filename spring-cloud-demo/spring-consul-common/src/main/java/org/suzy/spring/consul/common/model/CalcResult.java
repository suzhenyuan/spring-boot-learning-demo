package org.suzy.spring.consul.common.model;

import java.io.Serializable;

public class CalcResult implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -12159068720623704L;
	private Integer result;
	
	public Integer getResult() {
		return result;
	}
	public void setResult(Integer result) {
		this.result = result;
	}
	
	
}
