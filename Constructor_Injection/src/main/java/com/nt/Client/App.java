package com.nt.Client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.Config.javaConfig;
import com.nt.sbeans.Employee;

public class App 
{
    public static void main( String[] args )
    {
       // ApplicationContext context=new AnnotationConfigApplicationContext(javaConfig.class);
    	ApplicationContext context=new ClassPathXmlApplicationContext("com/nt/Config/applicationContext.xml");
        Employee employee=context.getBean("emp",Employee.class);
        employee.show();
   
    }
}
