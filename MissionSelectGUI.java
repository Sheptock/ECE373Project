
import java.util.concurrent.ThreadLocalRandom;

import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
	
public class MissionSelectGUI extends JPanel implements ActionListener {
		Account account;
	//Populate Missions
	public MissionSelectGUI(Account a ){
		ArrayList<Mission> tempMissions = a.getMissions();
		this.account = a;
		int rand0 = 0;
		int rand1 = 0;
		int rand2 = 0;
		
		while(rand0 == rand2 || rand0 == rand1 || rand2 == rand1){
		
			rand0 = ThreadLocalRandom.current().nextInt(0, tempMissions.size() );
			rand1 = ThreadLocalRandom.current().nextInt(0, tempMissions.size() );
			rand2 = ThreadLocalRandom.current().nextInt(0, tempMissions.size() );
			
		}
		
		
		//Generate 3 random missions for the Mission Select Screen,
		//There will always only be 3 missions available at a time.
		
		
		
		JButton mission0 = new JButton(tempMissions.get(rand0).getName() + " \n" + "Level: " + String.valueOf(tempMissions.get(rand0).getLevel()));
		mission0.setActionCommand("mission0");
		add(mission0);
		
		ImageIcon image0 = new ImageIcon("src\\reward-icon.PNG");
		JLabel mission0_label = new JLabel(image0);
		if(tempMissions.get(rand0).getReward().getBonusEquipment()!= null){
			mission0_label.setToolTipText("XP:" + String.valueOf(tempMissions.get(rand0).getReward().getBonusXP())+
							  "\n Resources:" + String.valueOf(tempMissions.get(rand0).getReward().getBonusResources())+
							 "\n Equipment:" + tempMissions.get(rand0).getReward().getBonusEquipment().getName());
		}
		
		else {
			mission0_label.setToolTipText("XP:" + String.valueOf(tempMissions.get(rand0).getReward().getBonusXP())+
					  "\n Resources:" + String.valueOf(tempMissions.get(rand0).getReward().getBonusResources())+
					 "\n Equipment: None");
		}
		add(mission0_label);
		
		JButton mission1 = new JButton(tempMissions.get(rand1).getName()+ " \n" + "Level: " + String.valueOf(tempMissions.get(rand1).getLevel()));
		mission1.setActionCommand("mission1");
		add(mission1);
		
		ImageIcon image1 = new ImageIcon("src\\reward-icon.PNG");
		JLabel mission1_label = new JLabel(image1);
		if(tempMissions.get(rand1).getReward().getBonusEquipment()!= null){
			mission1_label.setToolTipText("XP:" + String.valueOf(tempMissions.get(rand1).getReward().getBonusXP())+
							  "\n Resources:" + String.valueOf(tempMissions.get(rand1).getReward().getBonusResources())+
							  "\n Equipment:" + tempMissions.get(rand1).getReward().getBonusEquipment().getName());
		}
		
		else {
			mission1_label.setToolTipText("XP:" + String.valueOf(tempMissions.get(rand1).getReward().getBonusXP())+
					  "\n Resources:" + String.valueOf(tempMissions.get(rand1).getReward().getBonusResources())+
					 "\n Equipment: None");
		}
		add(mission1_label);
		
		JButton mission2 = new JButton(tempMissions.get(rand2).getName()+ " \n" + "Level: " + String.valueOf(tempMissions.get(rand2).getLevel()));
		mission2.setActionCommand("mission2");
		add(mission2);
		
		ImageIcon image2 = new ImageIcon("src\\reward-icon.PNG");
		JLabel mission2_label = new JLabel(image2);
		if(tempMissions.get(rand2).getReward().getBonusEquipment()!= null){
			mission2_label.setToolTipText("XP:" + String.valueOf(tempMissions.get(rand2).getReward().getBonusXP())+
				 "\n Resources:" + String.valueOf(tempMissions.get(rand2).getReward().getBonusResources())+
				 "\n Equipment:" + tempMissions.get(rand2).getReward().getBonusEquipment().getName());
		}
		
		else {
			mission2_label.setToolTipText("XP:" + String.valueOf(tempMissions.get(rand2).getReward().getBonusXP())+
					  "\n Resources:" + String.valueOf(tempMissions.get(rand2).getReward().getBonusResources())+
					 "\n Equipment: None");
		}
		
		add(mission2_label);
		
		
	}



	public void createGUI() {
 
        //Create and set up the window.
        JFrame frame = new JFrame("Mission Select");
      
 
        //Create and set up the content pane.
        MissionSelectGUI newContentPane = new MissionSelectGUI(this.account);
        newContentPane.setOpaque(true); //content panes must be opaque
        frame.setContentPane(newContentPane);
 
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
 


 	public void actionPerformed(ActionEvent e){
	//Load a specific Mission Page Depending on what is selected.
 	
 		if("mission0".equals(e.getActionCommand())) {
 			//JACOB/NICK WHOEVER IS WRITING SPECIFIC MISSION GUI CALL THAT CODE HERE
 		}
 		
 		else if("mission1".equals(e.getActionCommand())) {
 			//JACOB/NICK WHOEVER IS WRITING SPECIFIC MISSION GUI CALL THAT CODE HERE
 		}
 		
 		else if("mission2".equals(e.getActionCommand())) {
 			//JACOB/NICK WHOEVER IS WRITING SPECIFIC MISSION GUI CALL THAT CODE HERE
 		}
 	
 		
 	}

}