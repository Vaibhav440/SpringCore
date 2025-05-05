package com.velox.Internationalization;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration
@ComponentScan(basePackages="com.velox")
public class config {
	
	@Bean("messageSource")
	public ResourceBundleMessageSource getBundleMessageSource()
	{
		  ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
	      messageSource.setBasename("com/velox/files/messages");  
	      messageSource.setDefaultEncoding("UTF-8");
	      return messageSource;
	}

}
