package org.game.software;

import java.util.ArrayList;
import org.game.people.*;
import org.game.hardware.*;

//Testing Commit

public class Account {
	private ArrayList<Champion> champions;
	private ArrayList<Troop> troops;
	private String username;
	private String password;
	private ArrayList<Mission> missions;
	private ArrayList<Mission> availableMissions;
	private ArrayList<Boss> bosses;
	private ArrayList<Equipment> equipments;
	private ArrayList<Equipment> stash;
	private ArrayList<Reward> rewards;
	private ArrayList<Ability> abilities;
	private int resources;

	public Account() {
		//Create all of the things used in the game
		promptCreateUserPass; //The prompt to create the user name and password?
		createAbilities();
		createChampions();
		createEquipment();
		createMissions();
		createTroops();
		createRewards();
		createBosses();
	}
	
	public ArrayList<Champion> getChampions() {
		return this.champions;
	}

	public ArrayList<Troop> getTroops() {
		return this.troops;
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

	public ArrayList<Boss> getBosses() {
		return this.bosses;
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

	public void setTroops(Troop troops) {
		this.troops.add(troops);
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

	public void setBosses(ArrayList<Boss> bosses) {
		this.bosses = bosses;
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
		c0.setLevel(100);
		c0.setAbilities(abilityList.get(0), abilityList.get(1));
		
		Champion c1 = new Champion();
		c1.setName("Paladin");
		c1.setLevel(100);
		c1.setAbilities(abilityList.get(2), abilityList.get(3));
		
		Champion c2 = new Champion();
		c2.setName("Hunter");
		c2.setLevel(100);
		c2.setAbilities(abilityList.get(4), abilityList.get(5));
		
		Champion c3 = new Champion();
		c3.setName("Rogue");
		c3.setLevel(100);
		c3.setAbilities(abilityList.get(6), abilityList.get(7));
		
		Champion c4 = new Champion();
		c4.setName("Priest");
		c4.setLevel(100);
		c4.setAbilities(abilityList.get(8), abilityList.get(9));
		
		Champion c5 = new Champion();
		c5.setName("Shaman");
		c5.setLevel(100);
		c5.setAbilities(abilityList.get(10), abilityList.get(11));
		
		Champion c6 = new Champion();
		c6.setName("Mage");
		c6.setLevel(100);
		c6.setAbilities(abilityList.get(12), abilityList.get(13));
		
		Champion c7 = new Champion();
		c7.setName("Warlock");
		c7.setLevel(100);
		c7.setAbilities(abilityList.get(14), abilityList.get(15));
		
		Champion c8 = new Champion();
		c8.setName("Monk");
		c8.setLevel(100);
		c8.setAbilities(abilityList.get(16), abilityList.get(17));
		
		Champion c9 = new Champion();
		c9.setName("Druid");
		c9.setLevel(100);
		c9.setAbilities(abilityList.get(18), abilityList.get(19));
		
	}
	
	public void createEquipment(){
		//List of ideas:
		/*
		 * Shield
		 * Swift Boots
		 * Potion
		 */
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
	}
	
	public void createTroops(){
		//List of ideas:
		/*
		 * Soldier
		 * Guardian
		 * Knight
		 * Guard
		 */
	}
	
	public void createRewards(){
		//List of ideas:
		/*
		 * well, just
		 * extra xp, resources, or equipment
		 */
	}
	
	public void createBosses(){
		//List of ideas:
		/*
		 * 
		 */
	}
	
}
