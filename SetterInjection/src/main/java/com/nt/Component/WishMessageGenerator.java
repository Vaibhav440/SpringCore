package com.nt.Component;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wish")
public class WishMessageGenerator {
	

	LocalDateTime localDateTime;
  
	 @Autowired
    public void setLocalDateTime(LocalDateTime localDateTime) {
		this.localDateTime = localDateTime;
	}


	public WishMessageGenerator()
    {
    	System.out.println("WishMessageGenerator.WishMessageGenerator()");
    }


	public String generateWishMessage(String username)
	{
		int hour=localDateTime.getHour();
		
		if(hour<12)
		{
			return "Good Morining..!"+username;
		}
		else if(hour>=12 && hour<16) {
			return "Good Afternoon..!"+username;
		}
		else if(hour>=16 && hour<20)
		{
			return "Good Evining..!"+username;
		}
		else {
			return "Good Night..!"+username;
		}
		
		
	}

}
