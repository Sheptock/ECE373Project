
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;

public class ChampionGUI extends JPanel implements ActionListener {
		
	public ChampionGUI(Account a){
		//ArrayList<Champion> tempChampions = a.getChampions();	
		//Populate Champions 10 total
		/*JLabel champion0 = new JLabel(tempChampions.get(0).getName());
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
		add(champion9);*/
	
	}


	public static void createGUI(Account a) {
		
		ArrayList<String> champNames = new ArrayList<String>();
		ArrayList<String> equipNames = new ArrayList<String>();
		
		ArrayList<Champion> champs = new ArrayList<Champion>();
		ArrayList<Equipment> equips = new ArrayList<Equipment>();
		
		champs = a.getChampions();
		equips = a.getEquipments();
		
		for (int i = 0; i < champs.size(); ++i){
			champNames.add(champs.get(i).getName());
		}
		for (int j = 0; j < equips.size(); ++j){
			equipNames.add(equips.get(j).getName());
		}
		
		String[] str = {champNames.get(0), champNames.get(1), champNames.get(2), 
						champNames.get(3), champNames.get(4), champNames.get(5), 
						champNames.get(6), champNames.get(7), champNames.get(8), 
						champNames.get(9)};
		
		String[] str2 = {equipNames.get(0), equipNames.get(1), equipNames.get(2), 
						equipNames.get(3), equipNames.get(4)};
		
		JComboBox<String> champList = new JComboBox<String>(str);
		JComboBox<String> equipList = new JComboBox<String>(str2);
		//JComboBox<String> 
		
        JFrame frame = new JFrame("Champions");
        frame.setVisible(true);
        frame.setSize(500, 100);
        frame.setLayout(new FlowLayout());
        
        JLabel champLabel = new JLabel("Champion");
        JLabel equipLabel = new JLabel("Equipment");
        
        frame.add(champLabel);
        frame.add(champList);
        
        frame.add(equipLabel);
        frame.add(equipList);
        
    /*    champList.addActionListener(new ActionListener() {
        	 
            @Override
            public void actionPerformed(ActionEvent event) {
                JComboBox<String> combo = (JComboBox<String>) event.getSource();
                String selectedChamp = (String) combo.getSelectedItem();
         
                if (selectedChamp.equals("Warrior")) {
                    System.out.println("Good choice!");
                } else if (selectedChamp.equals("Paladin")) {
                    System.out.println("Nice pick, too!");
                }
            }
        });*/
        
        
    }

	public void actionPerformed(ActionEvent e){
		
	//Equip items onto champions.
	//Call the function equipItemOnChampion
	}

	public boolean equipItemOnChampion(Champion c, Equipment e){
	
		if(c.checkSlotAvailable() == true) {
			c.addEquipment(e);
			e.setChampion(c);
			return true;
		}
	
		else {
			return false;
		}
	
	}
}