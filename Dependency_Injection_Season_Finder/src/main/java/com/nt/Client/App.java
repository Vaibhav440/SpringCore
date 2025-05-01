package com.nt.Client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.Season_Finder;



public class App {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/nt/Config/applicationContext.xml");
        Season_Finder season_Finder=context.getBean("season",Season_Finder.class);
        String resultString=season_Finder.getCurrentSeason("Vaibhav");
        System.out.println(resultString);

	}
}
