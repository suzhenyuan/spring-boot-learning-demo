package org.suzy.spring.consul.common.model;

import java.io.Serializable;

public class CalcParam implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4299906042757798156L;

	private Integer x;
	private Integer y;
	public Integer getX() {
		return x;
	}
	public void setX(Integer x) {
		this.x = x;
	}
	public Integer getY() {
		return y;
	}
	public void setY(Integer y) {
		this.y = y;
	}
}
