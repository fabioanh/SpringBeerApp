package com.adneom;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

	@Bean
	public Brewery brewery() {
		return rochefortBrewery();
	}

	@Bean
	public Beer chimayInsignia() {
		Beer beer = new Beer();
		beer.setName("Chimay Grande Réserve");
		beer.setType("Strong Dark Ale");
		return beer;
	}
	
	@Bean
	public Brewery chimayBrewery() {
		Brewery brewery = new ChimayBrewery(chimayInsignia());
		chimayInsignia().setBrewery(brewery);
		return brewery;
	}
	
	@Bean
	public Beer rochefortInsignia() {
		Beer beer = new Beer();
		beer.setName("Trappistes Rochefort 10");
		beer.setType("Quadrupel (Quad)");
		return beer;
	}
	
	@Bean
	public Brewery rochefortBrewery() {
		Brewery brewery = new BrasserieRochefort(rochefortInsignia());
		rochefortInsignia().setBrewery(brewery);
		return brewery;
	}
	
}
