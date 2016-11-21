
public class Mission {
	private Person missionSlots;
	private Reward reward;
	private int xp;
	private String name;
	private int missionTime;
	private float completeChance;
	private String description;
	private Ability abilities;

	public Person getMissionSlots() {
		return this.missionSlots;
	}

	public Reward getReward() {
		return this.reward;
	}

	public int getXp() {
		return this.xp;
	}

	public String getName() {
		return this.name;
	}

	public int getMissionTime() {
		return this.missionTime;
	}

	public float getCompleteChance() {
		return this.completeChance;
	}

	public String getDescription() {
		return this.description;
	}

	public Ability getAbilities() {
		return this.abilities;
	}

	public void setMissionSlots(Person missionSlots) {
		this.missionSlots = missionSlots;
	}

	public void setReward(Reward reward) {
		this.reward = reward;
	}

	public void setXp(int xp) {
		this.xp = xp;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMissionTime(int missionTime) {
		this.missionTime = missionTime;
	}

	public void setCompleteChance(float completeChance) {
		this.completeChance = completeChance;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setAbilities(Ability abilities) {
		this.abilities = abilities;
	}

	public int calculateMissionSuccessChance(Person p1 Person p2 Person p3  ) {
		// TODO should be implemented
	}

	public boolean missionOutcome( ) {
		// TODO should be implemented
	}
}
