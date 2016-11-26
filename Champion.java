import java.util.ArrayList;

public class Champion extends Person {
	private int experience;
	private ArrayList <Equipment> equipment;
	private ArrayList<Ability> abilities;
	private Mission currentMission;
	public Person person;

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


	public Person getPerson() {
		return this.person;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}
	
	public void setEquipment(ArrayList<Equipment> equipment) {
		this.equipment = equipment;
	}

	public void setAbilities(Ability abilities) {
		this.abilities = abilities;
	}

	public void setCurrentMission(Mission currentMission) {
		this.currentMission = currentMission;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public void assignMission(Mission mission  ) {
		// TODO should be implemented
	}

	public void addEquipment(Equipment equipment  ) {
		if(this.getEquipment.size() != 2){
			this.equipment.add(equipment);
		}
	}

	//returns true if slot is available, max of 2 slots.
	public boolean checkSlotAvailable( ) {
		if(this.getEquipment.size() == 2){
			return false;
		}
		
		else {
			return true;
		}
		// TODO should be implemented
	}
}
