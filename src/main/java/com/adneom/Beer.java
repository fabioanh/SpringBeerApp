package com.adneom;

/**
 * Basic Beer POJO
 * 
 * @author fnavarretehiguera
 *
 */
public class Beer {
	private String name;
	private Brewery brewery;
	private String type;

	public Beer() {
		System.out.println("This is our new beer object being created");
	}

	public void identify() {
		if (brewery != null) {
			System.out.println("I am a: " + name + ", brewed by: " + brewery.getName());
		} else {
			System.out.println("I am a: " + name);
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Brewery getBrewery() {
		return brewery;
	}

	public void setBrewery(Brewery brewery) {
		this.brewery = brewery;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
