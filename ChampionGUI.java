//Nick did all of this
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;

public class ChampionGUI extends JPanel implements ActionListener {
	
	private static JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, setEquip, setUnequip1, setUnequip2;
	private static JLabel champName, abilities, ability1, ability2, equipped, equipped1, equipped2;
	private static JLabel availStash, stash0, stash1, stash2, stash3, stash4;
	public ArrayList<Champion> champs = new ArrayList<Champion>();
	public ArrayList<Equipment> equipment = new ArrayList<Equipment>();
	public ArrayList<Equipment> stash = new ArrayList<Equipment>();
	public Champion selectedChamp = new Champion();
	
	public ChampionGUI(Account a){
		
		champs = a.getChampions();
		equipment = a.getEquipments();
		stash = a.getStash();
		//stash = equipment;
		champs.get(0).addEquipment(this.equipment.get(0));
		champs.get(0).addEquipment(this.equipment.get(1));
		
		//CHAMP INFO
		champName = new JLabel("Champion");
        champName.setLayout(null);
        champName.setBounds(200, 10, 200, 30);
        
		abilities = new JLabel("Abilities: ");
        abilities.setLayout(null);
        abilities.setBounds(200, 50, 200, 30);
        
        ability1 = new JLabel("Ability1");
        ability1.setLayout(null);
        ability1.setBounds(200, 80, 300, 30);
        
        ability2 = new JLabel("Ability2");
        ability2.setLayout(null);
        ability2.setBounds(200, 110, 300, 30);
        
		equipped = new JLabel("Equipped: ");
        equipped.setLayout(null);
        equipped.setBounds(200, 150, 200, 30);
        
        equipped1 = new JLabel("Equipped1");
        equipped1.setLayout(null);
        equipped1.setBounds(200, 180, 300, 30);
        
        equipped2 = new JLabel("Equipped2");
        equipped2.setLayout(null);
        equipped2.setBounds(200, 210, 300, 30);
        
        //STASH
        availStash = new JLabel("Stash: ");
        availStash.setLayout(null);
        availStash.setBounds(500, 10, 200, 30);
        
        stash0 = new JLabel(equipment.get(0).getName());
        stash0.setLayout(null);
        stash0.setBounds(500, 50, 200, 30);
        
        stash1 = new JLabel(equipment.get(1).getName());  
        stash1.setLayout(null);
        stash1.setBounds(500, 80, 200, 30);
        
        stash2 = new JLabel(equipment.get(2).getName());
        stash2.setLayout(null);
        stash2.setBounds(500, 110, 200, 30);
        
        stash3 = new JLabel(equipment.get(3).getName());
        stash3.setLayout(null);
        stash3.setBounds(500, 140, 200, 30);
        
        stash4 = new JLabel(equipment.get(4).getName());
        stash4.setLayout(null);
        stash4.setBounds(500, 170, 200, 30);
		
        //EQUIP BUTTONS
        setEquip = new JButton("Equip");
        setEquip.setActionCommand("Equip");
        setEquip.setLayout(null);
        setEquip.setBounds(500, 300, 150, 30);
        setEquip.setVisible(false);
        
        setUnequip1 = new JButton("Unequip Slot 1");
        setUnequip1.setActionCommand("UnequipSlot1");
        setUnequip1.setLayout(null);
        setUnequip1.setBounds(400, 350, 150, 30);
        setUnequip1.setVisible(false);
        
        setUnequip2 = new JButton("Unequip Slot 2");
        setUnequip2.setActionCommand("UnequipSlot2");
        setUnequip2.setLayout(null);
        setUnequip2.setBounds(550, 350, 150, 30);
        setUnequip2.setVisible(false);
        
        //CHAMP BUTTONS
		b0 = new JButton(champs.get(0).getName());
        b0.setActionCommand("Warrior");
        b0.setLayout(null);
        b0.setBounds(10, 10, 100, 30);

        b1 = new JButton(champs.get(1).getName());
        b1.setActionCommand("Paladin");
        b1.setLayout(null);
        b1.setBounds(10, 50, 100, 30);
        
        b2 = new JButton(champs.get(2).getName());
        b2.setActionCommand("Hunter");
        b2.setLayout(null);
        b2.setBounds(10, 90, 100, 30);
        
        b3 = new JButton(champs.get(3).getName());
        b3.setActionCommand("Rogue");
        b3.setLayout(null);
        b3.setBounds(10, 130, 100, 30);
        
        b4 = new JButton(champs.get(4).getName());
        b4.setActionCommand("Priest");
        b4.setLayout(null);
        b4.setBounds(10, 170, 100, 30);
        
        b5 = new JButton(champs.get(5).getName());
        b5.setActionCommand("Shaman");
        b5.setLayout(null);
        b5.setBounds(10, 210, 100, 30);
        
        b6 = new JButton(champs.get(6).getName());
        b6.setActionCommand("Mage");
        b6.setLayout(null);
        b6.setBounds(10, 250, 100, 30);
        
        b7 = new JButton(champs.get(7).getName());
        b7.setActionCommand("Warlock");
        b7.setLayout(null);
        b7.setBounds(10, 290, 100, 30);
        
        b8 = new JButton(champs.get(8).getName());
        b8.setActionCommand("Monk");
        b8.setLayout(null);
        b8.setBounds(10, 330, 100, 30);
        
        b9 = new JButton(champs.get(9).getName());
        b9.setActionCommand("Druid");
        b9.setLayout(null);
        b9.setBounds(10, 370, 100, 30);
        
        b0.addActionListener(this); b1.addActionListener(this); b2.addActionListener(this); b3.addActionListener(this); b4.addActionListener(this);
        b5.addActionListener(this); b6.addActionListener(this); b7.addActionListener(this); b8.addActionListener(this); b9.addActionListener(this);
        setEquip.addActionListener(this); setUnequip1.addActionListener(this); setUnequip2.addActionListener(this);
	}


	public static void createGUI(Account a) {
		
        JFrame frame = new JFrame("Champions");

        frame.setVisible(true);
        frame.setSize(750, 470);
        frame.setLayout(null);
        
        frame.add(b0); frame.add(b1); frame.add(b2); frame.add(b3); frame.add(b4);
        frame.add(b5); frame.add(b6); frame.add(b7); frame.add(b8); frame.add(b9);
        
        frame.add(champName);
        frame.add(abilities); frame.add(ability1); frame.add(ability2);
        frame.add(equipped); frame.add(equipped1); frame.add(equipped2);
        frame.add(availStash); frame.add(stash0); frame.add(stash1); frame.add(stash2); frame.add(stash3); frame.add(stash4);
        frame.add(setEquip); frame.add(setUnequip1); frame.add(setUnequip2);
    }

    public void actionPerformed(ActionEvent e) {
    	
    	if("Warrior".equals(e.getActionCommand())) {
    		selectedChamp = champs.get(0);
    		b0.setEnabled(false); b1.setEnabled(true); b2.setEnabled(true); b3.setEnabled(true); b4.setEnabled(true);
    		b5.setEnabled(true); b6.setEnabled(true); b7.setEnabled(true); b8.setEnabled(true); b9.setEnabled(true);
    		changeDisplayInfo(0);
 		}
    	else if("Paladin".equals(e.getActionCommand())){
    		selectedChamp = champs.get(1);
    		b0.setEnabled(true); b1.setEnabled(false); b2.setEnabled(true); b3.setEnabled(true); b4.setEnabled(true);
    		b5.setEnabled(true); b6.setEnabled(true); b7.setEnabled(true); b8.setEnabled(true); b9.setEnabled(true);
    		changeDisplayInfo(1);
    	}
    	else if("Hunter".equals(e.getActionCommand())){
    		selectedChamp = champs.get(2);
    		b0.setEnabled(true); b1.setEnabled(true); b2.setEnabled(false); b3.setEnabled(true); b4.setEnabled(true);
    		b5.setEnabled(true); b6.setEnabled(true); b7.setEnabled(true); b8.setEnabled(true); b9.setEnabled(true);
    		changeDisplayInfo(2);
    	}
    	else if("Rogue".equals(e.getActionCommand())){
    		selectedChamp = champs.get(3);
    		b0.setEnabled(true); b1.setEnabled(true); b2.setEnabled(true); b3.setEnabled(false); b4.setEnabled(true);
    		b5.setEnabled(true); b6.setEnabled(true); b7.setEnabled(true); b8.setEnabled(true); b9.setEnabled(true);
    		changeDisplayInfo(3);
    	}
    	else if("Priest".equals(e.getActionCommand())){
    		selectedChamp = champs.get(4);
    		b0.setEnabled(true); b1.setEnabled(true); b2.setEnabled(true); b3.setEnabled(true); b4.setEnabled(false);
    		b5.setEnabled(true); b6.setEnabled(true); b7.setEnabled(true); b8.setEnabled(true); b9.setEnabled(true);
    		changeDisplayInfo(4);
    	}
    	else if("Shaman".equals(e.getActionCommand())){
    		selectedChamp = champs.get(5);
    		b0.setEnabled(true); b1.setEnabled(true); b2.setEnabled(true); b3.setEnabled(true); b4.setEnabled(true);
    		b5.setEnabled(false); b6.setEnabled(true); b7.setEnabled(true); b8.setEnabled(true); b9.setEnabled(true);
    		changeDisplayInfo(5);
    	}
    	else if("Mage".equals(e.getActionCommand())){
    		selectedChamp = champs.get(6);
    		b0.setEnabled(true); b1.setEnabled(true); b2.setEnabled(true); b3.setEnabled(true); b4.setEnabled(true);
    		b5.setEnabled(true); b6.setEnabled(false); b7.setEnabled(true); b8.setEnabled(true); b9.setEnabled(true);
    		changeDisplayInfo(6);
    	}
    	else if("Warlock".equals(e.getActionCommand())){
    		selectedChamp = champs.get(7);
    		b0.setEnabled(true); b1.setEnabled(true); b2.setEnabled(true); b3.setEnabled(true); b4.setEnabled(true);
    		b5.setEnabled(true); b6.setEnabled(true); b7.setEnabled(false); b8.setEnabled(true); b9.setEnabled(true);
    		changeDisplayInfo(7);
    	}
    	else if("Monk".equals(e.getActionCommand())){
    		selectedChamp = champs.get(8);
    		b0.setEnabled(true); b1.setEnabled(true); b2.setEnabled(true); b3.setEnabled(true); b4.setEnabled(true);
    		b5.setEnabled(true); b6.setEnabled(true); b7.setEnabled(true); b8.setEnabled(false); b9.setEnabled(true);
    		changeDisplayInfo(8);
    	}
    	else if("Druid".equals(e.getActionCommand())){
    		selectedChamp = champs.get(9);
    		b0.setEnabled(true); b1.setEnabled(true); b2.setEnabled(true); b3.setEnabled(true); b4.setEnabled(true);
    		b5.setEnabled(true); b6.setEnabled(true); b7.setEnabled(true); b8.setEnabled(true); b9.setEnabled(false);
    		changeDisplayInfo(9);
    	}
    	else if("Equip".equals(e.getActionCommand())){
    		
    	}
    	else if("UnequipSlot1".equals(e.getActionCommand())){
    		
    	}
    	else if("UnequipSlot2".equals(e.getActionCommand())){
    		
    	}
    	
    }

    public void changeDisplayInfo(int index){
    	champName.setText(champs.get(index).getName());
		ability1.setText(champs.get(index).getAbilities().get(0).getName());
		ability2.setText(champs.get(index).getAbilities().get(1).getName());
		if (champs.get(index).getEquipment().size() == 0){
			equipped1.setText("Slot 1: Empty");
			equipped2.setText("Slot 2: Empty");
	        setEquip.setVisible(true);
	        setUnequip1.setVisible(false);
	        setUnequip2.setVisible(false);
		}
		else if(champs.get(index).getEquipment().size() == 1){
			equipped1.setText("Slot 1: " + champs.get(index).getEquipment().get(0).getName());
			equipped2.setText("Slot 2: Empty");
			setEquip.setVisible(true);
	        setUnequip1.setVisible(true);
	        setUnequip2.setVisible(false);
		}
		else if(champs.get(index).getEquipment().size() == 2){
			equipped1.setText("Slot 1: " + champs.get(index).getEquipment().get(0).getName());
			equipped2.setText("Slot 2: " + champs.get(index).getEquipment().get(1).getName());
			setEquip.setVisible(false);
	        setUnequip1.setVisible(true);
	        setUnequip2.setVisible(true);
		}
    }
    
    
}