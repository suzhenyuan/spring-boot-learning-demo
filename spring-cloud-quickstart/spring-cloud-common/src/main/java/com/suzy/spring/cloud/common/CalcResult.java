package com.suzy.spring.cloud.common;

import java.io.Serializable;

public class CalcResult implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5743528682415889619L;
	private int z;

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
}
