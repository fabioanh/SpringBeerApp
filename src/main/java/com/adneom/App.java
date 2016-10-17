package com.adneom;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
		Brewery brewery = context.getBean(Brewery.class);
		brewery.getInsignia().identify();
	}
}
