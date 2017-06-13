package com.infotech.config;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.infotech.model.Message;

@Configuration
public class MessageConfig {

	@Bean(name={"message"},autowire=Autowire.BY_NAME,initMethod="init",destroyMethod="destroy")
	@Scope(scopeName="prototype")
	public Message getMessage(){
		return new Message();
	}
}
