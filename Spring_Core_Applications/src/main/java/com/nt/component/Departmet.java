package com.nt.component;

import org.springframework.stereotype.Component;

@Component("dept")
public class Departmet {
	
	public Departmet()
	{
		System.out.println("Departmet.Departmet()");
	}
	
	public void show()
	{
		System.out.println("Inside show!");
	}

}
