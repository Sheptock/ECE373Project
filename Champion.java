

import java.util.ArrayList;


public class Champion {
	private int experience;
	private String name;
	private int level;
	private ArrayList <Equipment> equipment;
	private ArrayList<Ability> abilities;
	private Mission currentMission;
	// public Person person; <----- This doesn't make sense, I commented out the getter/setter for this
	
	public Champion(){
		experience = 0;
		equipment = new ArrayList <Equipment>();
		abilities = new ArrayList<Ability>();
		currentMission = new Mission();
	}

	public int getExperience() {
		return this.experience;
	}

	public ArrayList<Equipment> getEquipment() {
		return this.equipment;
	}

	public ArrayList<Ability> getAbilities() {
		return this.abilities;
	}

	public Mission getCurrentMission() {
		return this.currentMission;
	}
	
	/*
	public Person getPerson() {
		return this.person;
	}
	*/
	
	public void setExperience(int experience) {
		this.experience = experience;
	}
	
	public void setEquipment(ArrayList<Equipment> equipment) {
		this.equipment = equipment;
	}

	public void setAbilities(Ability ability0, Ability ability1) {
		this.abilities.add(0, ability0);
		this.abilities.add(1, ability1);
	}

	public void setCurrentMission(Mission currentMission) {
		this.currentMission = currentMission;
	}
	
	/*
	public void setPerson(Person person) {
		this.person = person;
	}
	*/
	
	public void addEquipment(Equipment equipment) {
		if(this.getEquipment().size() != 2){
			this.equipment.add(equipment);
		}
		else{
			//SOME KIND OF ERROR MESSAGE TO THE USER TELLING THEM NO
		}
	}

	//returns true if slot is available, max of 2 slots.
	public boolean checkSlotAvailable( ) {
		if(this.getEquipment().size() == 2){
			return false;
		}
		
		else {
			return true;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
	
	public void checkLevelGain(){
		if(experience >= 100*level){
			experience = experience - 100*level;
			++level;
			checkLevelGain();
		}
		else{
			return;
		}
	}
}
