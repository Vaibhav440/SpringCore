package com.nt.Config;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.nt")
public class javaConfig {
	
	@Bean("ltd")
	public LocalDateTime localDateTime()
	{
		return LocalDateTime.now();
	}
}
