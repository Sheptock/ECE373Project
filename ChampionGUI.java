
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;

public class ChampionGUI extends JPanel implements ActionListener {
		
	public ChampionGUI(Account a){
		ArrayList<Champion> tempChampions = a.getChampions();	
		//Populate Champions 6 total
		JLabel champion0 = new JLabel(tempChampions.get(0).getName());
		JLabel champion1 = new JLabel(tempChampions.get(1).getName());
		JLabel champion2 = new JLabel(tempChampions.get(2).getName());
		JLabel champion3 = new JLabel(tempChampions.get(3).getName());
		JLabel champion4 = new JLabel(tempChampions.get(4).getName());
		JLabel champion5 = new JLabel(tempChampions.get(5).getName());
		JLabel champion6 = new JLabel(tempChampions.get(6).getName());
		JLabel champion7 = new JLabel(tempChampions.get(7).getName());
		JLabel champion8 = new JLabel(tempChampions.get(8).getName());
		JLabel champion9 = new JLabel(tempChampions.get(9).getName());
	
		add(champion0);
		add(champion1);
		add(champion2);
		add(champion3);
		add(champion4);
		add(champion5);
		add(champion6);
		add(champion7);
		add(champion8);
		add(champion9);
		
		
	
		//Populate Equipment
		ArrayList<Equipment> tempStash = a.getStash();
		ArrayList<JLabel> tempStashJLabel = new ArrayList<JLabel>();
		
		for(int i = 0; i < tempStash.size(); i++){
			tempStashJLabel.add(createEquipmentJLabel(tempStash.get(i)));
		}
		
		for(int i = 0; i < tempStash.size(); i++){
			add(tempStashJLabel.get(i));
		}
		
		
	
	}
	



	public static void createGUI(Account a) {
 
        //Create and set up the window.
        JFrame frame = new JFrame("Champions");

 
       frame.add(new ChampionGUI(a));
 
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
 


	public void actionPerformed(ActionEvent e){
		
	//Equip items onto champions.
	//Call the function equipItemOnChampion
	}

	public boolean equipItemOnChampion (Champion c, Equipment e){
	
		if(c.checkSlotAvailable() == true) {
			c.addEquipment(e);
			e.setChampion(c);
			return true;
		}
	
		else {
			return false;
		}
	
	}
	
	public JLabel createEquipmentJLabel(Equipment e) {
		JLabel tempEquipment = new JLabel(e.getName());
		return tempEquipment;
	}
}