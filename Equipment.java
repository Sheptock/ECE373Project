
public class Equipment {
	private String name;
	private int rarity;
	private Champion champion;
	private int bonusXP;
	private invalid bonusGold;

	public String getName() {
		return this.name;
	}

	public int getRarity() {
		return this.rarity;
	}

	public Champion getChampion() {
		return this.champion;
	}

	public int getBonusXP() {
		return this.bonusXP;
	}

	public invalid getBonusGold() {
		return this.bonusGold;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setRarity(int rarity) {
		this.rarity = rarity;
	}

	public void setChampion(Champion champion) {
		this.champion = champion;
	}

	public void setBonusXP(int bonusXP) {
		this.bonusXP = bonusXP;
	}

	public void setBonusGold(invalid bonusGold) {
		this.bonusGold = bonusGold;
	}

}
