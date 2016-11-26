package org.game.hardware;

import org.game.people.*;

public class Equipment {
	private String name;
	private Champion champion;
	private int bonusXP;
	private int bonusGold;
	private String Icon;


	public String getName() {
		return this.name;
	}

	public Champion getChampion() {
		return this.champion;
	}

	public int getBonusXP() {
		return this.bonusXP;
	}

	public int getBonusGold() {
		return this.bonusGold;
	}

	public String getIcon() {
		return this.Icon;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setChampion(Champion champion) {
		this.champion = champion;
	}

	public void setBonusXP(int bonusXP) {
		this.bonusXP = bonusXP;
	}

	public void setBonusGold(int bonusGold) {
		this.bonusGold = bonusGold;
	}
	
	public void setIcon(String Icon) {
		this.Icon = Icon;
	}

}
