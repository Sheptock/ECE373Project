import javax.swing.ImageIcon;

public class Equipment {
	private String name;
	private Champion champion;
	private int bonusXP;
	private double bonusChance; //increased chance to complete mission between 0-1
	private ImageIcon Icon;

	public Equipment() {
		name = "name";
		champion = null;
		bonusXP = 0;
		bonusChance = 0;
	}

	public String getName() {
		return this.name;
	}

	public Champion getChampion() {
		return this.champion;
	}

	public int getBonusXP() {
		return this.bonusXP;
	}

	public ImageIcon getIcon() {
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
	
	public void setIcon(ImageIcon Icon) {
		this.Icon = Icon;
	}

	public double getBonusChance() {
		return bonusChance;
	}

	public void setBonusChance(double bonusChance) {
		this.bonusChance = bonusChance;
	}

}
