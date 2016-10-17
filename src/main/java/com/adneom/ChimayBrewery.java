package com.adneom;

public class ChimayBrewery implements Brewery {
	private Beer insignia;
	private String name;

	public ChimayBrewery() {
	}

	public ChimayBrewery(Beer insignia, String name) {
		super();
		this.insignia = insignia;
		this.name = name;
	}

	@Override
	public Beer getInsignia() {
		return insignia;
	}

	public void setInsignia(Beer insignia) {
		this.insignia = insignia;
	}

	@Override
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
