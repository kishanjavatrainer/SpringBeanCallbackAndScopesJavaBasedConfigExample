package com.infotech.model;

import org.springframework.beans.factory.annotation.Value;

//public class Message implements InitializingBean,DisposableBean{
public class Message {

	@Value(value = "1001")
	private int messageId;
	
	@Value(value = "Hello World!!!")
	private String message;
	
	public int getMessageId() {
		return messageId;
	}
	public void setMessageId(int messageId) {
		this.messageId = messageId;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	@Override
	public String toString() {
		return "Message [messageId=" + messageId + ", message=" + message + "]";
	}

	//@PreDestroy
	public void destroy() throws Exception {
		System.out.println("Bean is going to destroy");
	}
	//@PostConstruct
	public void init() throws Exception {
		System.out.println("Bean is going through init process");
	}
	
}
