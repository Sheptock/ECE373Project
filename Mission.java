

import java.util.ArrayList;


public class Mission {
	private ArrayList<Champion> heroSlots;

	private Reward reward;
	private int resourceCost;
	private int level;
	private int xp;
	private String name;
	private float completeChance;
	private String description;

	public ArrayList<Champion> getHeroSlots() {
		return this.heroSlots;
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

	public float getCompleteChance() {
		return this.completeChance;
	}

	public String getDescription() {
		return this.description;
	}

	public void setHeroSlots(ArrayList<Champion> heroSlots) {
		this.heroSlots = heroSlots;
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

	public void setCompleteChance(float completeChance) {
		this.completeChance = completeChance;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int calculateMissionSuccessChance(Champion p1, Champion p2, Champion p3  ) {
	
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
