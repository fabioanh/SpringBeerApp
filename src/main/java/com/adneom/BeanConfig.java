package com.adneom;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

	@Bean
	public Beer getBeer(){
		Beer beer = new Beer();
		beer.setName("Chimay Grande Réserve");
		beer.setBrewery("Bières de Chimay Belgian");
		beer.setType("Strong Dark Ale");
		return beer;
	}
}
