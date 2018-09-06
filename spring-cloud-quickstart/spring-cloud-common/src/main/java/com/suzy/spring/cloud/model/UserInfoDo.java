package com.suzy.spring.cloud.model;

import java.io.Serializable;

public class UserInfoDo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5184126402413371008L;

	
	private Integer id;
	private String userName;
	private String desc;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
}
