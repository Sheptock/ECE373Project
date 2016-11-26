package org.game.people;

import org.game.hardware.*;
import org.game.software.*;

public class Boss extends Person{
	private Reward reward;
	private int difficulty;
	private String rarity;
	public Ability ability;
	

	public Reward getReward() {
		return this.reward;
	}

	public int getDifficulty() {
		return this.difficulty;
	}

	public String getRarity() {
		return this.rarity;
	}

	public Ability getAbility() {
		return this.ability;
	}

	public void setReward(Reward reward) {
		this.reward = reward;
	}

	public void setDifficulty(int difficulty) {
		this.difficulty = difficulty;
	}

	public void setRarity(String rarity) {
		this.rarity = rarity;
	}

	public void setPerson(Ability abil) {
		this.ability = abil;
	}

}
