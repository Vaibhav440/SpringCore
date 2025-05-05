package com.velox.Internationalization;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ResourceBundleMessageSource;
import java.util.Locale;

public class App {
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(config.class);

		ResourceBundleMessageSource messageSource = (ResourceBundleMessageSource) context.getBean("messageSource");

		String message = messageSource.getMessage("wish.message", null, Locale.ENGLISH);
		System.out.println("English: " + message);

		message = messageSource.getMessage("wish.message", null, new Locale("hi", "IN"));
		System.out.println("Hindi: " + message);

		message = messageSource.getMessage("wish.message", null, Locale.FRENCH);
		System.out.println("French: " + message);
	}
}
