package com.suzy.spring.cloud.model;

import java.io.Serializable;

public class UserInfoDo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5184126402413371008L;

	
	private Integer id;
	private String name;
	private String remark;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
}
