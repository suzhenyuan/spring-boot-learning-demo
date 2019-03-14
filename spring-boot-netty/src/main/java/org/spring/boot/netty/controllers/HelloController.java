package org.spring.boot.netty.controllers;

import java.util.Date;

import org.spring.boot.netty.nettyserver.NettyClientManager;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class HelloController {
	
	@RequestMapping("say")
	public String say(){
		for(String key: NettyClientManager.getInstance().getClients().keySet()){
			NettyClientManager.getInstance().getClients().get(key).writeAndFlush("hello,world"+new Date());
		}
		return "say hello to client:"+NettyClientManager.getInstance().getClients().size();
	}
}
