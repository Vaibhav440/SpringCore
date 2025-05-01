package com.nt.Client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.component.Employee;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/nt/config/applicationContext.xml");
		Employee employee = context.getBean("emp", Employee.class);
		employee.test();

	}

}
