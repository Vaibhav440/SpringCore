package com.nt.sbeans;

import java.time.LocalDate;
import java.time.Month;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("season")
public class Season_Finder {

	@Autowired
	private LocalDate date;
	
	public Season_Finder()
	{
		System.out.println("Season_Finder.Season_Finder()");
	}

	public String getCurrentSeason(String user) {
		int month = date.getMonthValue();
		if (month >= 3 && month <= 6)
			return " Hot Summer wishes to :" + user;
		else if (month >= 7 && month <= 10)
			return "   Drizziling  Monsoon wishes to :" + user;
		else
			return " Cool  Winter wishses  to  :" + user;

	}
}
