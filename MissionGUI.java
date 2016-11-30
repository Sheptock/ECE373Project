import javax.swing.*;
import java.awt.*;

public class MissionGUI extends JFrame {

	Mission mission;
	ImageIcon image;
	JLabel imageLabel;
	
	public MissionGUI(String windowTitle, Mission aMission) {
		super(windowTitle);
		
		mission = aMission;
		setSize(500,500);
		
		add(new JLabel("<HTML><center>Mission</center></HTML>"));
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//		image = new ImageIcon("src\\XP-icon.png");
//		imageLabel = new JLabel(image);
//		imageLabel.setBounds(10, 10, 10, 10);
//		imageLabel.setVisible(true);
		
//		add(imageLabel);
		
		buildGUI();
	}
	public MissionGUI(String windowTitle) {
		super(windowTitle);
		
		setSize(500,500);
		
		add(new JLabel("<HTML><center>Mission</center></HTML>"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		image = new ImageIcon("C:\\Users\\Owner\\Desktop\\halls_of_valor\\images\\reward-icon.png");
		imageLabel = new JLabel(image);
		imageLabel.setBounds(10, 10, 10, 10);
		imageLabel.setVisible(true);
		
		add(imageLabel);

		
		setVisible(true);
		
	}
	
	public void buildGUI() {
		JPanel missionLevel = new JPanel();
		missionLevel.setBounds(100, 100, 100, 100);
		
		missionLevel.add(new JLabel(String.valueOf(mission.getLevel())));
		missionLevel.setVisible(true);
		
		add(missionLevel);
		
		
	}
	

}