import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MissionGUI extends JFrame {

	private Mission mission;
	private Account userAccount;
	private ImageIcon image;
	private JLabel imageLabel;
	private JComboBox champSel1, champSel2, champSel3;
	private JPanel champSelPanel;
	private JPanel abilityPanel;
	private JPanel successChancePanel;
	private JPanel buttonPanel;
	private JPanel resourceCostPanel;
	
	private JButton backButton, startButton;
	
	private JLabel successChanceLabel;
	
	private GridLayout windowLayout, champSelPanelLayout;
	
	public MissionGUI(Mission aMission, Account userAccount) {
//		super(windowTitle);
		
		champSel1 = new JComboBox(userAccount.getChampions().toArray());
		champSel2 = new JComboBox(userAccount.getChampions().toArray());
		champSel3 = new JComboBox(userAccount.getChampions().toArray());
		
		champSelPanel = new JPanel();
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(0,0,screenSize.width,screenSize.height);
		
//		windowLayout = new GridLayout(2,3);
//		windowLayout.setHgap(10);
//		windowLayout.setVgap(20);
		
//		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mission = aMission;
//		setSize(500,500);
		
//		add(imageLabel);
		
//		setLayout(new BorderLayout());
		buildGUI();
		pack();
		
		setLocationRelativeTo(null);	// making window appear on center of screen
		
		setVisible(true);
	}
	
	public void buildGUI() {
		champSelPanelLayout = new GridLayout(2,3);
		champSelPanelLayout.setHgap(10);
		
		champSel1.addActionListener(new DropDownListener());
		champSel2.addActionListener(new DropDownListener());
		champSel3.addActionListener(new DropDownListener());
		
		champSelPanel.setLayout(champSelPanelLayout);
		champSelPanel.add(new JLabel("Champions:"));
		champSelPanel.add(new JLabel());
		champSelPanel.add(new JLabel());
		champSelPanel.add(champSel1);
		champSelPanel.add(champSel2);
		champSelPanel.add(champSel3);
		
		JPanel missionLevel = new JPanel(new GridLayout(1,3));
//		missionLevel.setBounds(100, 100, 100, 100);
		
		missionLevel.add(new JLabel("Mission Level: "));
		missionLevel.add(new JLabel(String.valueOf(mission.getLevel())));
		missionLevel.add(new JLabel(mission.getName()));
//		missionLevel.setAlignmentX(LEFT_ALIGNMENT);
//		missionLevel.setAlignmentY(LEFT_ALIGNMENT);
//		missionLevel.setVisible(true);
		
		JPanel missionDescription = new JPanel();
		
//		missionDescription.setBounds(10,10,10,10);
		
		missionDescription.add(new JLabel(mission.getDescription()));
//		missionDescription.setBorder(BorderFactory.createRaisedBevelBorder());
		
//		missionDescription.setVisible(true);
		
		abilityPanel = new JPanel(new GridLayout(1,3,5,5));
		abilityPanel.add(new JLabel("Boss abilities:"));
		abilityPanel.add(new JLabel(mission.getAbilities().get(0).toString()));
		abilityPanel.add(new JLabel(mission.getAbilities().get(1).toString()));
//		abilityPanel.add(new JLabel(mission.getAbilities().get(2).toString()));
		
		successChanceLabel = new JLabel("You must select three unique champions.");
		successChanceLabel.setHorizontalAlignment(JLabel.CENTER);
		
		successChancePanel = new JPanel(new GridLayout(1,2));
		successChancePanel.add(new JLabel("Mission Success Chance: "));
		successChancePanel.add(successChanceLabel);
		
		startButton = new JButton("Start");
		backButton = new JButton("Back");
		
		startButton.addActionListener(new ButtonListener());
		backButton.addActionListener(new ButtonListener());
		
		buttonPanel = new JPanel(new GridLayout(1,2,5,5));
		buttonPanel.add(startButton);
		buttonPanel.add(backButton);
		
		resourceCostPanel = new JPanel();
		resourceCostPanel.add(new JLabel("Resource Cost: " + String.valueOf(mission.getResourceCost())));
		
		setLayout(new GridLayout(7,1,10,10));
		add(missionLevel);
		add(missionDescription);
		add(abilityPanel);
		add(champSelPanel);
		add(successChancePanel);
		add(resourceCostPanel);
		add(buttonPanel);
		
		
	}
	private class DropDownListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JComboBox source = (JComboBox)(e.getSource());
			
			if(source.equals(champSel1) || source.equals(champSel2) || source.equals(champSel3)) {
				if(champSel1.getSelectedItem().equals(champSel2.getSelectedItem()) || champSel1.getSelectedItem().equals(champSel3.getSelectedItem())
						|| champSel2.getSelectedItem().equals(champSel3.getSelectedItem())){

					successChanceLabel.setText("You must select three unique champions.");
				} else {
					successChanceLabel.setText(String.valueOf(mission.calculateMissionSuccessChance((Champion)champSel1.getSelectedItem(), (Champion)champSel2.getSelectedItem(), (Champion)champSel3.getSelectedItem())) + "%");					
				}
			}
		}
	}
	private class ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton source = (JButton)(e.getSource());
			
			if(source.equals(startButton)) {
				handleStart();
			} else if(source.equals(backButton)) {
				handleBack();
			}
		}
		public void handleStart() {
			userAccount.addResources(-mission.getResourceCost());
			JOptionPane.showMessageDialog(null, String.valueOf(userAccount.getResources()));
			if(mission.missionOutcome() == true) {
//				JOptionPane.showMessageDialog(null, "You won! You receive: " + mission.getReward().getBonusEquipment().getName() + String.valueOf(mission.getReward().getBonusResources()) + String.valueOf(mission.getReward().getBonusXP()));
				JOptionPane.showMessageDialog(null, "You Won!");
			} else {
				JOptionPane.showMessageDialog(null, "You Failed!");
			}
		}
		public void handleBack() {
			dispose();
		}
	}

}