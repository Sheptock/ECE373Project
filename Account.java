import java.util.ArrayList;

//Testing Commit

public class Account {
	private Champion champions;
	private Troop troops;
	private String username;
	private String password;
	private Mission missions;
	private Mission availableMissions;
	private Boss bosses;
	private int experience;
	private int level;
	private Equipment equipments;
	private Equipment stash;
	private ArrayList<Reward> rewards;
	private int resources;

	public Champion getChampions() {
		return this.champions;
	}

	public Troop getTroops() {
		return this.troops;
	}

	public String getUsername() {
		return this.username;
	}

	public String getPassword() {
		return this.password;
	}

	public Mission getMissions() {
		return this.missions;
	}

	public Mission getAvailableMissions() {
		return this.availableMissions;
	}

	public Boss getBosses() {
		return this.bosses;
	}

	public int getExperience() {
		return this.experience;
	}

	public int getLevel() {
		return this.level;
	}

	public Equipment getEquipments() {
		return this.equipments;
	}

	public Equipment getStash() {
		return this.stash;
	}
	
	public ArrayList<Reward> getRewards(){
		return this.rewards;
	}
	
	public int getResources(){
		return this.resources;
	}

	public void setChampions(Champion champions) {
		this.champions = champions;
	}

	public void setTroops(Troop troops) {
		this.troops = troops;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setMissions(Mission missions) {
		this.missions = missions;
	}

	public void setAvailableMissions(Mission availableMissions) {
		this.availableMissions = availableMissions;
	}

	public void setBosses(Boss bosses) {
		this.bosses = bosses;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public void setEquipments(Equipment equipments) {
		this.equipments = equipments;
	}

	public void setStash(Equipment stash) {
		this.stash = stash;
	}
	
	public void setRewards(ArrayList<Reward> rewards){
		this.rewards = rewards;
	}
	
	public void setResources(int res){
		this.resources = res;
	}

	public boolean login(String name, String pw  ) {
		return false;

		// TODO should be implemented
	}

	public void addXP(int xp) {
		// TODO should be implemented
	}

	public boolean checkLvlUp(int exp) {
		return false;
		// TODO should be implemented
	}
}
