package com.nt.Factory;

import com.nt.comps.AadharDetails;
import com.nt.comps.Employee;
import com.nt.comps.Person;
import com.nt.comps.Student;

public class Factory {
	
	public static Person getInstPerson(String username)
	{
		Person person=null;
		if(username.equalsIgnoreCase("stud"))
		{
		  AadharDetails  details=new AadharDetails(3464565464L, 30, 999999L);
		  person=new Student("raja", "hyd", details, 1001, "JAVA");
		}
		else if(username.equalsIgnoreCase("emp"))
		{
			AadharDetails  details=new AadharDetails(3887988898L, 10, 187999L);
			  person=new Employee("Vaibhav", "Dev", details, 7001, "Python");
		}
		return person;
	}

}
