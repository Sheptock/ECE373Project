import java.util.ArrayList;

public class Mission {
	private ArrayList<Person> heroSlots;
	private ArrayList<Boss> bossSlots;
	private Reward reward;
	private int resourceCost;
	private int level;
	private int xp;
	private String name;
	private int missionTime;
	private float completeChance;
	private String description;

	public ArrayList<Person> getHeroSlots() {
		return this.heroSlots;
	}

	public ArrayList<Boss> getBossSlots() {
		return this.bossSlots;
	}
	
	public Reward getReward() {
		return this.reward;
	}
	
	public int getResourceCost() {
		return this.resourceCost;
	}
	
	public int getLevel() {
		return this.level;
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

	public void setHeroSlots(ArrayList<Person> heroSlots) {
		this.heroSlots = heroSlots;
	}
	
	public void setbossSlots(ArrayList<Boss> bossSlots) {
		this.bossSlots = bossSlots;
	}

	public void setReward(Reward reward) {
		this.reward = reward;
	}
	
	public void setResourceCost(int cost) {
		this.resourceCost = cost;
	}

	public void setLevel(int lvl) {
		this.level = lvl;
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

	public int calculateMissionSuccessChance(Person p1, Person p2, Person p3  ) {
		Boss tempBoss = (Boss) p1;
		tempBoss.getAbility();
		return -1;
	}

	public boolean missionOutcome( ) {
		double number = Math.random();
		
		if(this.completeChance < number) {
			return true;
		}
		
		else {
			return false;
		}
	}
}
