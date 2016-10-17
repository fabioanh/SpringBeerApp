package com.adneom;

/**
 * Defines a Brewery basic contract for any existant brewery.
 * 
 * @author fnavarretehiguera
 *
 */
public interface Brewery {
	Beer getInsignia();
	String getName();
	void throwParty();
}
