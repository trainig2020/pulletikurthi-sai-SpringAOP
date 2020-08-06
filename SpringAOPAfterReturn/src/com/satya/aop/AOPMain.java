package com.satya.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.satya.service.AOPService;

public class AOPMain {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		AOPService aopService=context.getBean("aopService",AOPService.class);
		aopService.getCircle().setNameandReturn("Dummy Circle");
		
	}
}
