package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component("emp")
public class Employee {
	
	Department department;
	
//   @Autowired
	public Employee(Department department) {
		this.department = department;
	}
	
	public void show()
	{
          System.out.println(department);
	}

}
