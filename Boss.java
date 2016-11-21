
public class Boss {
	private Reward reward;
	private int difficulty;
	private String rarity;
	public Person person;

	public Reward getReward() {
		return this.reward;
	}

	public int getDifficulty() {
		return this.difficulty;
	}

	public String getRarity() {
		return this.rarity;
	}

	public Person getPerson() {
		return this.person;
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

	public void setPerson(Person person) {
		this.person = person;
	}

}
