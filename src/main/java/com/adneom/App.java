package com.adneom;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
		Beer beer = context.getBean(Beer.class);
		beer.identify();
	}
}
