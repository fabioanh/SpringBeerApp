package com.adneom;

public class ChimayBrewery implements Brewery {
	private Beer insignia;
	private final String name = "Bières de Chimay Belgian";

	public ChimayBrewery() {
	}

	public ChimayBrewery(Beer insignia) {
		super();
		this.insignia = insignia;
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

	@Override
	public void throwParty() {
		try {
			System.out.println("I'm throwing a crazy party with moderately valued: " + insignia.getName() + "!");
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
