package com.nt.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("emp")
public class Employee {
	
	@Autowired
	Departmet dtDepartmet;
	
	public Employee()
	{
		System.out.println("Employee.Employee()");
	}
	
	public void test()
	{
		System.out.println("Employee.test()");
		dtDepartmet.show();
	}
}
