package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("dept")
public class Department {

	
	private String dnameString="Hr";

	@Override
	public String toString() {
		return "Department [dnameString=" + dnameString + "]";
	}
	
	
	

}
