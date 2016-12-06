import javax.swing.*;
import java.awt.*;

public class MissionGUI extends JFrame {

	private Mission mission;
	private ImageIcon image;
	private JLabel imageLabel;
	
	private GridLayout windowLayout;
	
	public MissionGUI(String windowTitle, Mission aMission) {
		super(windowTitle);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(0,0,screenSize.width,screenSize.height);
		
		windowLayout = new GridLayout(2,3);
		windowLayout.setHgap(10);
		windowLayout.setVgap(20);
		
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mission = aMission;
//		setSize(500,500);
		
//		add(imageLabel);
		
		
		buildGUI();
		
		setVisible(true);
	}
	
	public void buildGUI() {
		JPanel missionLevel = new JPanel(new GridLayout(1,2));
//		missionLevel.setBounds(100, 100, 100, 100);
		
		missionLevel.add(new JLabel("Mission Level: "));
		missionLevel.add(new JLabel(String.valueOf(mission.getLevel())));
//		missionLevel.setAlignmentX(LEFT_ALIGNMENT);
//		missionLevel.setAlignmentY(LEFT_ALIGNMENT);
		missionLevel.setVisible(true);
		
		JPanel missionDescription = new JPanel();
		
//		missionDescription.setBounds(10,10,10,10);
		
		missionDescription.add(new JLabel(mission.getDescription()));
		missionDescription.setVisible(true);
		
		setLayout(new GridLayout(2,1));
		add(missionLevel);
		add(missionDescription);
		
		
	}
	

}