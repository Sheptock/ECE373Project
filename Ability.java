import javax.swing.ImageIcon;


public class Ability {
	private String Name;
	private ImageIcon Icon;

	public Ability () {
		Name = "Blank";
	
	}
	
	public String getName() {
		return this.Name;
	}

	public ImageIcon getIcon() {
		return this.Icon;
	}

	public void setName(String Name) {
		this.Name = Name;
	}

	public void setIcon(ImageIcon Icon) {
		this.Icon = Icon;
	}

}
