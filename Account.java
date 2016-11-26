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
	private Boss bosses;
	private ArrayList<Equipment> equipments;
	private ArrayList<Equipment> stash;
	private ArrayList<Reward> rewards;
	private ArrayList<Ability> abilities;
	private int resources;

	public Account() {
		//Create all of the things used in the game
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

	public Boss getBosses() {
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

	public void setBosses(Boss bosses) {
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
		Ability a0 = new Ability();
		a0.setName("Slam");
		Ability a1 = new Ability();
		a1.setName("Cleave");
		Ability a2 = new Ability();
		a2.setName("Slash");
		Ability a3 = new Ability();
		a3.setName("Wild Strike");
		Ability a4 = new Ability();
		a4.setName("Execute");
		Ability a5 = new Ability();
		a5.setName("Stormstrike");
		Ability a6 = new Ability();
		a6.setName("Lava Lash");
		Ability a7 = new Ability();
		a7.setName("Windfury");
		Ability a8 = new Ability();
		a8.setName("Earthshock");
		Ability a9 = new Ability();
		a9.setName("Rampage");
		
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
		
	}
	
	public void createChampions(){
		Champion c0 = new Champion();
		c0.setName("Barbarian");
		c0.setLevel(100);
		c0.setAbilities(this.getAbilities().get(0),this.getAbilities.get(1));
		
	}
}
