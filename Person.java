
public class Person {
	private String name;
	private int level;
	private Mission mission;
	private String icon;

	public String getName() {
		return this.name;
	}

	public int getLevel() {
		return this.level;
	}

	public Mission getMission() {
		return this.mission;
	}

	public String getIcon() {
		return this.icon;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public void setMission(Mission mission) {
		this.mission = mission;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

}
