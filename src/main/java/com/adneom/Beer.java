package com.adneom;

/**
 * Basic Beer POJO
 * 
 * @author fnavarretehiguera
 *
 */
public class Beer {
	private String name;
	private String brewery;
	private String type;

	public Beer() {
		System.out.println("This is our new beer object being created");
	}

	public void identify() {
		System.out.println("I am a: " + name + ", brewed by: " + brewery);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrewery() {
		return brewery;
	}

	public void setBrewery(String brand) {
		this.brewery = brand;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
