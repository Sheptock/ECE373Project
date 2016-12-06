import java.util.ArrayList;


public class Mission {
	private ArrayList<Champion> heroSlots;

	private Reward reward;
	private ArrayList<Ability> abilities;
	private boolean completed;
	private int resourceCost;
	private int level;
	private int xp;
	private String name;
	private double completeChance;
	private String description;

	public Mission() {
		heroSlots = new ArrayList<Champion>();
		abilities = new ArrayList<Ability>();
		reward = null;
		completed = false;
		resourceCost = 0;
		level = 0;
		xp = 0;
		name = "Blank";
		completeChance = 0.0;
		description = "Blank";
	
	}
	
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

	public double getCompleteChance() {
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

	public void setCompleteChance(double completeChance) {
		this.completeChance = completeChance;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int calculateMissionSuccessChance(Champion p1, Champion p2, Champion p3  ) {
		
		int totalChance = 0;
		ArrayList<Ability> championAbilities = new ArrayList<Ability>();
		championAbilities.add(p1.getAbilities().get(0));
		championAbilities.add(p1.getAbilities().get(1));
		championAbilities.add(p2.getAbilities().get(0));
		championAbilities.add(p2.getAbilities().get(1));
		championAbilities.add(p3.getAbilities().get(0));
		championAbilities.add(p3.getAbilities().get(1));
		
		int incChance = 1;
		int decChance = 1;
		double avgLevel;
		int i = 0;
		int totalMatch = 0;
		boolean flag1 = false;
		boolean flag2 = false;
		boolean flag3 = false;
		boolean flag4 = false;
		boolean flag5 = false;
		boolean flag6 = false;
		
		if(this.abilities.size() == 2) {
			incChance = 30;
			decChance = 15;
		}
		
		else if(this.abilities.size() == 3) {
			incChance = 25;
			decChance = 12.5;
		}
		else if(this.abilities.size() == 4) {
			incChance = 20;
			decChance = 10;
		}		
		else if(this.abilities.size() == 5) {
			incChance = 15;
			decChance = 7.5;
		}
		else if(this.abilities.size() == 6) {
			incChance = 10;
			decChance = 5;
		}		
		
		for(i = 0; i < this.abilities.size(); i++) {
			if(championAbilities.at(0).Name == this.abilities.at(i).Name) {
				flag1 = true;
				totalMatch = totalMatch + 1;
			}
			if(championAbilities.at(1).Name == this.abilities.at(i).Name) {
				flag2 = true;
				totalMatch = totalMatch + 1;
			}
			if(championAbilities.at(2).Name == this.abilities.at(i).Name) {
				flag3 = true;
				totalMatch = totalMatch + 1;
			}
			if(championAbilities.at(3).Name == this.abilities.at(i).Name) {
				flag4 = true;
				totalMatch = totalMatch + 1;
			}
			if(championAbilities.at(4).Name == this.abilities.at(i).Name) {
				flag5 = true;
				totalMatch = totalMatch + 1;
			}
			if(championAbilities.at(5).Name == this.abilities.at(i).Name) {
				flag6 = true;
				totalMatch = totalMatch + 1;
			}
		}
		
		totalChance = totalChance + totalMatch*incChance + (6 - totalMatch)*decChance;

		avgLevel = (double)(p1.getLevel() + p2.getLevel() + p3.getLevel())/3.0;
		totalChance = totalChance + 3*(avgLevel + 2 - this.level);
		
		return totalChance;
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

	public ArrayList<Ability> getAbilities() {
		return abilities;
	}

	public void setAbilities(ArrayList<Ability> abilities) {
		this.abilities = abilities;
	}

	public boolean isCompleted() {
		return completed;
	}

	public void setCompleted(boolean completed) {
		this.completed = completed;
	}
}
