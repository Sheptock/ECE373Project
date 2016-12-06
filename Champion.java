

import java.util.ArrayList;


public class Champion {
	private int experience;
	private String name;
	private int level;
	private ArrayList <Equipment> equipment;
	private ArrayList<Ability> abilities;
	private Mission currentMission;
	
	public Champion(){
		experience = 0;
		name = "name";
		level = 100;
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
	
	public void addEquipment(Equipment equipment) {
		this.equipment.add(equipment);
	}
	
	public void unequip(int slot){
		if (slot == 1){
			this.equipment.remove(this.getEquipment().get(0));
		}
		else if (slot == 2){
			this.equipment.remove(this.getEquipment().get(1));
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
	
	public String toString() {
		return name;
	}
}
