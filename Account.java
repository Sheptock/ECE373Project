import java.util.ArrayList;

public class Account {
	private ArrayList<Champion> champions;

	private String username;
	private String password;
	private ArrayList<Mission> missions;
	private ArrayList<Mission> availableMissions;

	private ArrayList<Equipment> equipments;
	private ArrayList<Equipment> stash;
	private ArrayList<Reward> rewards;
	private ArrayList<Ability> abilities;
	private int resources;

	public Account() {
		//Create all of the things used in the game
		//promptCreateUserPass; //The prompt to create the user name and password?
		createAbilities();
		createChampions();
		createEquipment();
		createRewards();
		createMissions();
		resources = 500;
	}
	
	public ArrayList<Champion> getChampions() {
		return this.champions;
	}

	public String getUsername() {
		return this.username;
	}

	public String getPassword() {
		return this.password;
	}

	public ArrayList<Mission> getMissions() {
		return this.missions;
	}

	public ArrayList<Mission> getAvailableMissions() {
		return this.availableMissions;
	}

	public ArrayList<Equipment> getEquipments() {
		return this.equipments;
	}

	public ArrayList<Equipment> getStash() {
		return this.stash;
	}
	
	public ArrayList<Reward> getRewards(){
		return this.rewards;
	}
	
	public int getResources(){
		return this.resources;
	}
	
	public ArrayList<Ability> getAbilities() {
		return this.abilities;
	}

	public void setChampions(Champion champions) {
		this.champions.add(champions);
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setMissions(ArrayList<Mission> missions) {
		this.missions = missions;
	}

	public void setAvailableMissions(ArrayList<Mission> availableMissions) {
		this.availableMissions = availableMissions;
	}

	public void setEquipments(ArrayList<Equipment> equipments) {
		this.equipments = equipments;
	}

	public void setStash(ArrayList<Equipment> stash) {
		this.stash = stash;
	}
	
	public void setRewards(ArrayList<Reward> rewards){
		this.rewards = rewards;
	}
	
	public void setResources(int res){
		this.resources = res;
	}

	public boolean login(String name, String pw  ) {
		if(username.equals(name) && password.equals(pw)) {
			return true;
		} else {
			return false;
		}
	}
	
	public void createAbilities() {
		//Warrior
		Ability a0 = new Ability();
		a0.setName("Heroic Strike");
		Ability a1 = new Ability();
		a1.setName("Execute");
		//Paladin
		Ability a2 = new Ability();
		a2.setName("Judgment");
		Ability a3 = new Ability();
		a3.setName("Repentence");
		//Hunter
		Ability a4 = new Ability();
		a4.setName("Aimed Shot");
		Ability a5 = new Ability();
		a5.setName("Multishot");
		//Rogue
		Ability a6 = new Ability();
		a6.setName("Backstab");
		Ability a7 = new Ability();
		a7.setName("Sap");
		//Priest
		Ability a8 = new Ability();
		a8.setName("Smite");
		Ability a9 = new Ability();
		a9.setName("Penance");
		//Shaman
		Ability a10 = new Ability();
		a10.setName("Stormstrike");
		Ability a11 = new Ability();
		a11.setName("Lightning Bolt");
		//Mage
		Ability a12 = new Ability();
		a12.setName("Fireball");
		Ability a13 = new Ability();
		a13.setName("Frost Nova");
		//Warlock
		Ability a14 = new Ability();
		a14.setName("Chaos Bolt");
		Ability a15 = new Ability();
		a15.setName("Fear");
		//Monk
		Ability a16 = new Ability();
		a16.setName("Fists of Fury");
		Ability a17 = new Ability();
		a17.setName("Tiger Palm");
		//Druid
		Ability a18 = new Ability();
		a18.setName("Lunar Strike");
		Ability a19 = new Ability();
		a19.setName("Moonfire");
		
		this.abilities.add(a0);
		this.abilities.add(a1);
		this.abilities.add(a2);
		this.abilities.add(a3);
		this.abilities.add(a4);
		this.abilities.add(a5);
		this.abilities.add(a6);
		this.abilities.add(a7);
		this.abilities.add(a8);
		this.abilities.add(a9);
		this.abilities.add(a10);
		this.abilities.add(a11);
		this.abilities.add(a12);
		this.abilities.add(a13);
		this.abilities.add(a14);
		this.abilities.add(a15);
		this.abilities.add(a16);
		this.abilities.add(a17);
		this.abilities.add(a18);
		this.abilities.add(a19);
		
	}
	
	public void createChampions(){
		ArrayList<Ability> abilityList = this.getAbilities();
		
		Champion c0 = new Champion();
		c0.setName("Warrior");
		c0.setLevel(1);
		c0.setAbilities(abilityList.get(0), abilityList.get(1));
		
		Champion c1 = new Champion();
		c1.setName("Paladin");
		c1.setLevel(1);
		c1.setAbilities(abilityList.get(2), abilityList.get(3));
		
		Champion c2 = new Champion();
		c2.setName("Hunter");
		c2.setLevel(1);
		c2.setAbilities(abilityList.get(4), abilityList.get(5));
		
		Champion c3 = new Champion();
		c3.setName("Rogue");
		c3.setLevel(1);
		c3.setAbilities(abilityList.get(6), abilityList.get(7));
		
		Champion c4 = new Champion();
		c4.setName("Priest");
		c4.setLevel(1);
		c4.setAbilities(abilityList.get(8), abilityList.get(9));
		
		Champion c5 = new Champion();
		c5.setName("Shaman");
		c5.setLevel(1);
		c5.setAbilities(abilityList.get(10), abilityList.get(11));
		
		Champion c6 = new Champion();
		c6.setName("Mage");
		c6.setLevel(1);
		c6.setAbilities(abilityList.get(12), abilityList.get(13));
		
		Champion c7 = new Champion();
		c7.setName("Warlock");
		c7.setLevel(1);
		c7.setAbilities(abilityList.get(14), abilityList.get(15));
		
		Champion c8 = new Champion();
		c8.setName("Monk");
		c8.setLevel(1);
		c8.setAbilities(abilityList.get(16), abilityList.get(17));
		
		Champion c9 = new Champion();
		c9.setName("Druid");
		c9.setLevel(1);
		c9.setAbilities(abilityList.get(18), abilityList.get(19));
	
		this.champions.add(c0);
		this.champions.add(c1);
		this.champions.add(c2);
		this.champions.add(c3);
		this.champions.add(c4);
		this.champions.add(c5);
		this.champions.add(c6);
		this.champions.add(c7);
		this.champions.add(c8);
		this.champions.add(c9);
		
	}
	
	public void createEquipment(){
		//List of ideas:
		/*
		 * Shield
		 * Swift Boots
		 * Potion
		 */
		
		Equipment e0 = new Equipment();
		e0.setBonusChance(0.1);
		e0.setBonusXP(0);
		e0.setName("Shield");
		
		Equipment e1 = new Equipment();
		e1.setBonusChance(0.1);
		e1.setBonusXP(10);
		e1.setName("Mace");
		
		Equipment e2 = new Equipment();
		e2.setBonusChance(0.2);
		e2.setBonusXP(0);
		e2.setName("Helmet");
		
		Equipment e3 = new Equipment();
		e3.setBonusChance(0);
		e3.setBonusXP(20);
		e3.setName("Dagger");
		
		Equipment e4 = new Equipment();
		e4.setBonusChance(0.05);
		e4.setBonusXP(25);
		e4.setName("Axe");
		
		
	}
	
	public void createRewards(){
		//List of ideas:
		/*
		 * well, just
		 * extra xp, resources, or equipment
		 */
		
		Reward r0 = new Reward();
		r0.setBonusEquipment(this.getEquipments().get(0));
		r0.setBonusResources(0);
		r0.setBonusXP(0);
		
		Reward r1 = new Reward();
		r1.setBonusEquipment(this.getEquipments().get(1));
		r1.setBonusResources(0);
		r1.setBonusXP(0);
		
		Reward r2 = new Reward();
		r2.setBonusEquipment(this.getEquipments().get(2));
		r2.setBonusResources(0);
		r2.setBonusXP(0);
		
		Reward r3 = new Reward();
		r3.setBonusEquipment(this.getEquipments().get(3));
		r3.setBonusResources(0);
		r3.setBonusXP(0);
		
		Reward r4 = new Reward();
		r4.setBonusEquipment(this.getEquipments().get(4));
		r4.setBonusResources(0);
		r4.setBonusXP(0);
		
		Reward r5 = new Reward();
		r5.setBonusEquipment(null);
		r5.setBonusResources(10);
		r5.setBonusXP(0);
		
		Reward r6 = new Reward();
		r6.setBonusEquipment(null);
		r6.setBonusResources(0);
		r6.setBonusXP(50);
		
		this.rewards.add(r0);
		this.rewards.add(r1);
		this.rewards.add(r2);
		this.rewards.add(r3);
		this.rewards.add(r4);
		this.rewards.add(r5);
		this.rewards.add(r6);
		
	}
	
	
	public void createMissions(){
		//List of ideas:
		/*
		 * Assassination
		 * Siege
		 * Arena
		 * Defend from the Attack
		 * Secret Orders
		 */
		
		//Assassination
		Mission m0 = new Mission();
		m0.setReward(this.getRewards().get(0));
		m0.setDescription("This is a mission");
		m0.setLevel(100);
		m0.setXp(200);
		m0.setResourceCost(50);
		m0.setName("Assassination");
		
		
	}
	

	

	

	
}
