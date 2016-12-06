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
	private JLabel resourceLabel;
	
	private GridLayout windowLayout, champSelPanelLayout;
	
	public MissionGUI(Mission aMission, Account anAccount) {
//		super(windowTitle);
		
		userAccount = anAccount;
		
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
		
		refreshStart();	//should initially disable the start button
		
		resourceCostPanel = new JPanel(new GridLayout(1,2,5,0));
		resourceCostPanel.add(new JLabel("Resource Cost: " + String.valueOf(mission.getResourceCost())));
		resourceLabel = new JLabel("Available resources: " + String.valueOf(userAccount.getResources()));
		resourceCostPanel.add(resourceLabel);
		
		setLayout(new GridLayout(7,1,0,0));
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
				refreshStart();
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
//			public void addResources(int res) {
			userAccount.addResources(-mission.getResourceCost());
			resourceLabel.setText("Available resources: " + String.valueOf(userAccount.getResources()));
			if(mission.missionOutcome() == true) {
				// Note: maybe add in XP value to this if the account still uses XP in a way that I don't recognize
				
				JPanel rewardPanel = new JPanel(new GridLayout(4,1,0,5));
				rewardPanel.add(new JLabel("You won! You receive: "));
				if(mission.getReward().getBonusEquipment() != null) {
					rewardPanel.add(new JLabel(mission.getReward().getBonusEquipment().getName()));
				} else {
					rewardPanel.add(new JLabel());
				}
				rewardPanel.add(new JLabel(String.valueOf(mission.getReward().getBonusResources() + " resources")));
				rewardPanel.add(new JLabel(String.valueOf(mission.getReward().getBonusXP()) + " XP"));
				
				JOptionPane.showMessageDialog(null, rewardPanel);
				userAccount.getStash().add(mission.getReward().getBonusEquipment());
				userAccount.addResources(mission.getReward().getBonusResources());
				dispose();
//				userAccount.
			} else {
				JOptionPane.showMessageDialog(null, "You Failed!");
			}
		}
		public void handleBack() {
			dispose();
		}
	}
	public void refreshStart() {
		if(champSel1.getSelectedItem().equals(champSel2.getSelectedItem()) || champSel1.getSelectedItem().equals(champSel3.getSelectedItem())
				|| champSel2.getSelectedItem().equals(champSel3.getSelectedItem())){
			startButton.setEnabled(false);
		} else {
			startButton.setEnabled(true);
		}
	}

}