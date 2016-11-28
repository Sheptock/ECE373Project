

public class Reward {
	private int bonusXP;
	private int bonusResources;
	private Equipment bonusEquipment;
	private String Icon;

	public String getIcon() {
		return this.Icon;
	}
	
	public int getBonusXP() {
		return this.bonusXP;
	}

	public int getBonusResources() {
		return this.bonusResources;
	}

	public Equipment getBonusEquipment() {
		return this.bonusEquipment;
	}

	public void setBonusXP(int bonusXP) {
		this.bonusXP = bonusXP;
	}

	public void setBonusResources(int bonusResources) {
		this.bonusResources = bonusResources;
	}

	public void setBonusEquipment(Equipment bonusEquipment) {
		this.bonusEquipment = bonusEquipment;
	}

	public void setIcon(String Icon) {
		this.Icon = Icon;
	}
	
	public void giveAcctReward(Account acc  ) {
		// TODO should be implemented
	}
}
