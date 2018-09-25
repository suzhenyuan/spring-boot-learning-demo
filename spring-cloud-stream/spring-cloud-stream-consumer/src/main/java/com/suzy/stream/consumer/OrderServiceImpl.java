package com.suzy.stream.consumer;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;

import com.suzy.stream.common.OrderMessage;
import com.suzy.stream.common.pojos.OrderInfo;

@EnableBinding(OrderMessage.class)
public class OrderServiceImpl {

	@StreamListener(OrderMessage.CONSUMER)
	public void process(Message<OrderInfo> message) {
		OrderInfo o = message.getPayload();
		
		System.out.println(o.getAge());
		System.out.println(o.getName());
		System.out.println(o.isModify());
		System.out.println(o.getAmount());
		System.out.println(o.getCreateTime());
		Acknowledgment acknowledgment = message.getHeaders().get(KafkaHeaders.ACKNOWLEDGMENT, Acknowledgment.class);
		if (acknowledgment != null) {
			System.out.println("Acknowledgment provided");
			acknowledgment.acknowledge();
		}
	}
}
