package com.adneom;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

	@Bean
	public Brewery brewery() {
		Brewery brewery = new ChimayBrewery(insignia(), "Bi�res de Chimay Belgian");
		insignia().setBrewery(brewery);
		return brewery;
	}

	@Bean
	public Beer insignia() {
		return chimayInsignia();
	}

	@Bean
	public Beer chimayInsignia() {
		Beer beer = new Beer();
		beer.setName("Chimay Grande R�serve");
		beer.setType("Strong Dark Ale");
		return beer;
	}
}
