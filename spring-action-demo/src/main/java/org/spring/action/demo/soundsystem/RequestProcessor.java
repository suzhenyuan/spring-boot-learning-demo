package org.spring.action.demo.soundsystem;

import java.io.Serializable;

/**
 * @author suzymf
 * @date 2019年2月25日
 * @todo 请求处理的目标类
 * 
 */
public class RequestProcessor  implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5533521069044996163L;

	/*public void query_user_info(Map<String,Object>request) {
		request.put("target", "target");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("in target");
		System.out.println("");
		System.out.println("");
		System.out.println("");
	}*/
	/*
	public void queryUserInfo() {
		System.out.println("in target");
	}
	*/
	public void doAround(){
		System.out.println("doaround-------------");
	}

}
