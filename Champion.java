import java.util.ArrayList;

public class Champion extends Person {
	private int experience;
	private String rarity;
	private ArrayList <Equipment> equipment;
	private ArrayList<Ability> abilities;
	private Mission currentMission;
	private boolean unlocked;
	public Person person;

	public int getExperience() {
		return this.experience;
	}

	public String getRarity() {
		return this.rarity;
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

	public boolean getUnlocked() {
		return this.unlocked;
	}

	public Person getPerson() {
		return this.person;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public void setRarity(String rarity) {
		this.rarity = rarity;
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

	public void setUnlocked(boolean unlocked) {
		this.unlocked = unlocked;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public void assignMission(Mission mission  ) {
		// TODO should be implemented
	}

	public void addEquipment(Equipment equipment  ) {
		this.equipment.add(equipment);
	}

	public boolean checkSlotAvailable( ) {
		return unlocked;
		// TODO should be implemented
	}
}
