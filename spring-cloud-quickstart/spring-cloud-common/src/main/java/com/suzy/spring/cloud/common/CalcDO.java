package com.suzy.spring.cloud.common;

import java.io.Serializable;


public class CalcDO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3148087932236159860L;
	private int x;
	private int y;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
}
