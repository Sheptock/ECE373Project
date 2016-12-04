import java.util.ArrayList;

import javax.swing.ImageIcon;

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
		username = "username";
		password = "password";
		champions = new ArrayList<Champion>();
		missions = new ArrayList<Mission>();
		availableMissions = new ArrayList<Mission>();
		equipments = new ArrayList<Equipment>();
		stash = new ArrayList<Equipment>();
		rewards = new ArrayList<Reward>();
		abilities = new ArrayList<Ability>();
		resources = 100;
		
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
		a0.setIcon(new ImageIcon("images\\a0-icon.PNG"));
		Ability a1 = new Ability();
		a1.setName("Execute");
		a1.setIcon(new ImageIcon("images\\a1-icon.PNG"));
		//Paladin
		Ability a2 = new Ability();
		a2.setName("Judgment");
		a2.setIcon(new ImageIcon("images\\a2-icon.PNG"));
		Ability a3 = new Ability();
		a3.setName("Repentence");
		a3.setIcon(new ImageIcon("images\\a3-icon.PNG"));
		//Hunter
		Ability a4 = new Ability();
		a4.setName("Aimed Shot");
		a4.setIcon(new ImageIcon("images\\a4-icon.PNG"));
		Ability a5 = new Ability();
		a5.setName("Multishot");
		a5.setIcon(new ImageIcon("images\\a5-icon.PNG"));
		//Rogue
		Ability a6 = new Ability();
		a6.setName("Backstab");
		a6.setIcon(new ImageIcon("images\\a6-icon.PNG"));
		Ability a7 = new Ability();
		a7.setName("Sap");
		a7.setIcon(new ImageIcon("images\\a7-icon.PNG"));
		//Priest
		Ability a8 = new Ability();
		a8.setName("Smite");
		a8.setIcon(new ImageIcon("images\\a8-icon.PNG"));
		Ability a9 = new Ability();
		a9.setName("Penance");
		a9.setIcon(new ImageIcon("images\\a9-icon.PNG"));
		//Shaman
		Ability a10 = new Ability();
		a10.setName("Stormstrike");
		a10.setIcon(new ImageIcon("images\\a10-icon.PNG"));
		Ability a11 = new Ability();
		a11.setName("Lightning Bolt");
		a11.setIcon(new ImageIcon("images\\a11-icon.PNG"));
		//Mage
		Ability a12 = new Ability();
		a12.setName("Fireball");
		a12.setIcon(new ImageIcon("images\\a12-icon.PNG"));
		Ability a13 = new Ability();
		a13.setName("Frost Nova");
		a13.setIcon(new ImageIcon("images\\a13-icon.PNG"));
		//Warlock
		Ability a14 = new Ability();
		a14.setName("Chaos Bolt");
		a14.setIcon(new ImageIcon("images\\a14-icon.PNG"));
		Ability a15 = new Ability();
		a15.setName("Fear");
		a15.setIcon(new ImageIcon("images\\a15-icon.PNG"));
		//Monk
		Ability a16 = new Ability();
		a16.setName("Fists of Fury");
		a16.setIcon(new ImageIcon("images\\a16-icon.PNG"));
		Ability a17 = new Ability();
		a17.setName("Tiger Palm");
		a17.setIcon(new ImageIcon("images\\a17-icon.PNG"));
		//Druid
		Ability a18 = new Ability();
		a18.setName("Lunar Strike");
		a18.setIcon(new ImageIcon("images\\a18-icon.PNG"));
		Ability a19 = new Ability();
		a19.setName("Moonfire");
		a19.setIcon(new ImageIcon("images\\a19-icon.PNG"));
		
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
		e0.setIcon(new ImageIcon("images\\e0-icon.PNG"));
		
		Equipment e1 = new Equipment();
		e1.setBonusChance(0.1);
		e1.setBonusXP(10);
		e1.setName("Mace");
		e1.setIcon(new ImageIcon("images\\e1-icon.PNG"));
		
		Equipment e2 = new Equipment();
		e2.setBonusChance(0.2);
		e2.setBonusXP(0);
		e2.setName("Helmet");
		e2.setIcon(new ImageIcon("images\\e2-icon.PNG"));
		
		Equipment e3 = new Equipment();
		e3.setBonusChance(0);
		e3.setBonusXP(20);
		e3.setName("Dagger");
		e3.setIcon(new ImageIcon("images\\e3-icon.PNG"));
		
		Equipment e4 = new Equipment();
		e4.setBonusChance(0.05);
		e4.setBonusXP(25);
		e4.setName("Axe");
		e4.setIcon(new ImageIcon("images\\e4-icon.PNG"));
		
		this.equipments.add(e0);
		this.equipments.add(e1);
		this.equipments.add(e2);
		this.equipments.add(e3);
		this.equipments.add(e4);
		
		
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
		//Arraylist of abilities
		ArrayList<Ability> as0 = new ArrayList<Ability>();
		as0.add(this.abilities.get(0));
		as0.add(this.abilities.get(1));
		
		ArrayList<Ability> as1 = new ArrayList<Ability>();
		as1.add(this.abilities.get(4));
		as1.add(this.abilities.get(7));
		as1.add(this.abilities.get(5));
		as1.add(this.abilities.get(1));
		as1.add(this.abilities.get(6));
		as1.add(this.abilities.get(9));
		
		ArrayList<Ability> as2 = new ArrayList<Ability>();
		as2.add(this.abilities.get(0));
		as2.add(this.abilities.get(1));
		as2.add(this.abilities.get(2));
		as2.add(this.abilities.get(3));
		
		ArrayList<Ability> as3 = new ArrayList<Ability>();
		as3.add(this.abilities.get(5));
		as3.add(this.abilities.get(7));
		as3.add(this.abilities.get(8));
		
		
		ArrayList<Ability> as4 = new ArrayList<Ability>();
		as4.add(this.abilities.get(9));
		as4.add(this.abilities.get(2));
		as4.add(this.abilities.get(3));
		as4.add(this.abilities.get(8));
		as4.add(this.abilities.get(6));
		
		
		ArrayList<Ability> as5 = new ArrayList<Ability>();
		as5.add(this.abilities.get(19));
		as5.add(this.abilities.get(18));
		as5.add(this.abilities.get(12));
		as5.add(this.abilities.get(13));
		as5.add(this.abilities.get(11));
		
		
		ArrayList<Ability> as6 = new ArrayList<Ability>();
		as6.add(this.abilities.get(15));
		as6.add(this.abilities.get(14));
		as6.add(this.abilities.get(10));
		as6.add(this.abilities.get(17));
		as6.add(this.abilities.get(16));
		
		
		//Assassination
		Mission m0 = new Mission();
		m0.setReward(this.getRewards().get(0));
		m0.setDescription("Invade the cave and kill Agnidox and Erethon.");
		m0.setLevel(100);
		m0.setXp(200);
		m0.setResourceCost(50);
		m0.setName("Assassination");
		m0.setAbilities(as0);
		
		Mission m1 = new Mission();
		m1.setReward(this.getRewards().get(1));
		m1.setDescription("Travel to the top of the mountain and slay Ember, Bone Warlock, and Sven");
		m1.setLevel(100);
		m1.setXp(200);
		m1.setResourceCost(50);
		m1.setName("The Broken Blade");
		m1.setAbilities(as1);
		
		Mission m2 = new Mission();
		m2.setReward(this.getRewards().get(2));
		m2.setDescription("Rescue Deckard Cain from the hands of Iron Juggernaut and The Watcher");
		m2.setLevel(105);
		m2.setXp(200);
		m2.setResourceCost(50);
		m2.setName("The Legacy of Cain");
		m2.setAbilities(as2);
		
		Mission m3 = new Mission();
		m3.setReward(this.getRewards().get(3));
		m3.setDescription("Protect the king near the Old Cathedral.");
		m3.setLevel(109);
		m3.setXp(200);
		m3.setResourceCost(50);
		m3.setName("Joffery Must Not Fall");
		m3.setAbilities(as3);
		
		Mission m4 = new Mission();
		m4.setReward(this.getRewards().get(4));
		m4.setDescription("Free the Imprisoned Angel and escort him back to town.");
		m4.setLevel(106);
		m4.setXp(200);
		m4.setResourceCost(50);
		m4.setName("Imprisoned Angel");
		m4.setAbilities(as4);
		
		Mission m5 = new Mission();
		m5.setReward(this.getRewards().get(5));
		m5.setDescription("Venture down into the haunted well and free the ghostly spirit.");
		m5.setLevel(102);
		m5.setXp(200);
		m5.setResourceCost(50);
		m5.setName("The Ghost Inside");
		m5.setAbilities(as5);
		
		Mission m6 = new Mission();
		m6.setReward(this.getRewards().get(6));
		m6.setDescription("Search the abandoned town for signs of life.");
		m6.setLevel(104);
		m6.setXp(200);
		m6.setResourceCost(50);
		m6.setName("The Dead Don't Rest");
		m6.setAbilities(as6);
		
		this.missions.add(m0);
		this.missions.add(m1);
		this.missions.add(m2);
		this.missions.add(m3);
		this.missions.add(m4);
		this.missions.add(m5);
		this.missions.add(m6);
		
		
	}
	

	

	

	
}
