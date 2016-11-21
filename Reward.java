
public class Reward {
	private int bonusXP;
	private Equipment bonusResources;
	private Equipment bonusEquipment;

	public int getBonusXP() {
		return this.bonusXP;
	}

	public Equipment getBonusResources() {
		return this.bonusResources;
	}

	public Equipment getBonusEquipment() {
		return this.bonusEquipment;
	}

	public void setBonusXP(int bonusXP) {
		this.bonusXP = bonusXP;
	}

	public void setBonusResources(Equipment bonusResources) {
		this.bonusResources = bonusResources;
	}

	public void setBonusEquipment(Equipment bonusEquipment) {
		this.bonusEquipment = bonusEquipment;
	}

	public void giveAcctReward(Account acc  ) {
		// TODO should be implemented
	}
}
