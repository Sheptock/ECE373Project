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
	private int resources;

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
}
