


public class Ability {
	private String Name;
	private String Icon;

	public Ability () {
		Name = "Blank";
		Icon = "Blank";
	}
	
	public String getName() {
		return this.Name;
	}

	public String getIcon() {
		return this.Icon;
	}

	public void setName(String Name) {
		this.Name = Name;
	}

	public void setIcon(String Icon) {
		this.Icon = Icon;
	}

}
