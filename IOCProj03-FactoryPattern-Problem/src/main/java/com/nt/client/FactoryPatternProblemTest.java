package com.nt.client;

import com.nt.comps.AadharDetails;
import com.nt.comps.Employee;
import com.nt.comps.Person;
import com.nt.comps.Student;

public class FactoryPatternProblemTest {

	public static void main(String[] args) {
		  AadharDetails  details=new AadharDetails(3464565464L, 30, 999999L);//dependent class obj
		  Person st=new Student("raja", "hyd", details, 1001, "JAVA");  //target class obj having dependent class obj
		  System.out.println(st);
		  
		  System.out.println("+++++++++++++++++++++++++++++");
		  
		  AadharDetails  details1=new AadharDetails(3464565461L, 31, 989999L);//dependent class obj
		  Person emp=new Employee("suresh", "vizag", details1, 1002, "MANAGER");  //target class obj having dependent class obj
		  System.out.println(emp);
		  
	}

}
