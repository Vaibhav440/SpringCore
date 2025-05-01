package com.nt.client;

import com.nt.Factory.Factory;
import com.nt.comps.AadharDetails;
import com.nt.comps.Employee;
import com.nt.comps.Person;
import com.nt.comps.Student;

public class FactoryPatternProblemTest {

	public static void main(String[] args) {
		
	Person studPerson=Factory.getInstPerson("emp");
	System.out.println(studPerson);
		  
	}

}
