package org.game.people;

public class Troop extends Person{
	private int usesRemaining;
	private int successBoost;
	public Person person;

	public int getUsesRemaining() {
		return this.usesRemaining;
	}

	public int getSuccessBoost() {
		return this.successBoost;
	}

	public Person getPerson() {
		return this.person;
	}

	public void setUsesRemaining(int usesRemaining) {
		this.usesRemaining = usesRemaining;
	}

	public void setSuccessBoost(int successBoost) {
		this.successBoost = successBoost;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

}
