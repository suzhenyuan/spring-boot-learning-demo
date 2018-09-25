package com.suzy.stream.provider.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;

import com.suzy.stream.common.OrderMessage;
import com.suzy.stream.common.pojos.OrderInfo;

@EnableBinding(OrderMessage.class)
public class ProviderService {

	@Autowired
	OrderMessage orderMessage;
	public String sendOrderInfo(OrderInfo info) {
		Message<OrderInfo> m=MessageBuilder.withPayload(info).build();
		return orderMessage.sender().send(m)+"";
	}
}
