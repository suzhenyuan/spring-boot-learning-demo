package com.suzy.stream.common;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface OrderMessage {

	//consumer
	String CONSUMER = "order_consumer";
	@Input(OrderMessage.CONSUMER)
	SubscribableChannel consume();

	//provider
	String PROVIDER = "order_sender";
	@Output(OrderMessage.PROVIDER)
	MessageChannel sender();
}
