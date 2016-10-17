package com.adneom;

public class BrasserieRochefort implements Brewery {
	private Beer insignia;
	private final String name = "Brasserie de Rochefort";

	public BrasserieRochefort() {
	}

	public BrasserieRochefort(Beer insignia) {
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

}
