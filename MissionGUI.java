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
		
//		add(new JLabel("<HTML><center>Mission</center></HTML>"));
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//		image = new ImageIcon("src\\XP-icon.png");
//		imageLabel = new JLabel(image);
//		imageLabel.setBounds(10, 10, 10, 10);
//		imageLabel.setVisible(true);
		
//		add(imageLabel);
		
		setVisible(true);
		
		buildGUI();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void buildGUI() {
		JPanel missionLevel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		missionLevel.setBounds(100, 100, 100, 100);
		
		missionLevel.add(new JLabel("Mission Level: "));
		missionLevel.add(new JLabel(String.valueOf(mission.getLevel())));
		missionLevel.setAlignmentX(LEFT_ALIGNMENT);
		missionLevel.setAlignmentY(LEFT_ALIGNMENT);
		missionLevel.setVisible(true);
		
		JPanel missionDescription = new JPanel();
		
		missionDescription.setLayout(new FlowLayout(FlowLayout.LEADING));
		missionDescription.setBounds(10,10,10,10);
		
		missionDescription.add(new JLabel(mission.getDescription()));
		missionDescription.setVisible(true);
		
		
		add(missionLevel);
		add(missionDescription);
		
		
	}
	

}