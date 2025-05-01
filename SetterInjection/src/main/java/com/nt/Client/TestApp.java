package com.nt.Client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.Component.WishMessageGenerator;
import com.nt.Config.javaConfig;

public class TestApp {
	
	public static void main(String agr[])
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("com/nt/Config/applicationContext.xml");
		
//		ApplicationContext context=new AnnotationConfigApplicationContext(javaConfig.class);
		WishMessageGenerator wishMessageGenerator=context.getBean("wish",WishMessageGenerator.class);
		String result=wishMessageGenerator.generateWishMessage("Vaibhav");
		System.out.println(result);
		
	}

}
