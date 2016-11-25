
public class Equipment {
	private String name;
	private int rarity;
	private Champion champion;
	private int bonusXP;
	private int bonusGold;
	private String Icon;


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

	public int getBonusGold() {
		return this.bonusGold;
	}

	public String getIcon() {
		return this.Icon;
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

	public void setBonusGold(int bonusGold) {
		this.bonusGold = bonusGold;
	}
	
	public void setIcon(String Icon) {
		this.Icon = Icon;
	}

}
