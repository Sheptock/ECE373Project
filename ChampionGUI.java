//Nick did all of this
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;

public class ChampionGUI extends JPanel implements ActionListener {
	
	private static JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, setEquip, setUnequip1, setUnequip2;
	private static JLabel champName, abilities, ability1, ability2, equipped, equipped1, equipped2;
	private static JLabel availStash;
	private static JButton stash0, stash1, stash2, stash3, stash4;
	public ArrayList<Champion> champs = new ArrayList<Champion>();
	public ArrayList<Equipment> equipment = new ArrayList<Equipment>();
	public ArrayList<Equipment> champEquipment = new ArrayList<Equipment>();
	public ArrayList<Equipment> stash = new ArrayList<Equipment>();
	public Champion selectedChamp = new Champion();
	public Equipment selectedEquip = new Equipment();
	public int index;
	public Account account;
	
	public ChampionGUI(Account a){
		
		account = a;
		champs = a.getChampions();
		equipment = a.getEquipments();
		stash = a.getStash();
		stash = equipment;
		
		//CHAMP INFO
		champName = new JLabel("Champion");
        champName.setLayout(null);
        champName.setBounds(200, 10, 200, 30);
        
		abilities = new JLabel("Abilities: ");
        abilities.setLayout(null);
        abilities.setBounds(200, 50, 200, 30);
        
        ability1 = new JLabel("Ability1");
        ability1.setLayout(null);
        ability1.setBounds(200, 80, 300, 50);
        
        ability2 = new JLabel("Ability2");
        ability2.setLayout(null);
        ability2.setBounds(200, 130, 300, 50);
        
		equipped = new JLabel("Equipped: ");
        equipped.setLayout(null);
        equipped.setBounds(200, 180, 200, 30);
        
        equipped1 = new JLabel("Equipped1");
        equipped1.setLayout(null);
        equipped1.setBounds(200, 220, 300, 50);
        
        equipped2 = new JLabel("Equipped2");
        equipped2.setLayout(null);
        equipped2.setBounds(200, 260, 300, 50);
        
        //STASH
        availStash = new JLabel("Stash: ");
        availStash.setLayout(null);
        availStash.setBounds(500, 10, 200, 30);
        
        stash0 = new JButton();
        stash0.setActionCommand("stash0");
        stash0.setLayout(null);
        stash0.setBounds(500, 50, 100, 30);
        
        stash1 = new JButton(); 
        stash1.setActionCommand("stash1");
        stash1.setLayout(null);
        stash1.setBounds(500, 90, 100, 30);
        
        stash2 = new JButton();
        stash2.setActionCommand("stash2");
        stash2.setLayout(null);
        stash2.setBounds(500, 130, 100, 30);
        
        stash3 = new JButton();
        stash3.setActionCommand("stash3");
        stash3.setLayout(null);
        stash3.setBounds(500, 170, 100, 30);
        
        stash4 = new JButton();
        stash4.setActionCommand("stash4");
        stash4.setLayout(null);
        stash4.setBounds(500, 210, 100, 30);
        
        refreshStash();
		
        //EQUIP BUTTONS
        setEquip = new JButton("Equip");
        setEquip.setActionCommand("Equip");
        setEquip.setLayout(null);
        setEquip.setBounds(475, 300, 150, 30);
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
        stash0.addActionListener(this); stash1.addActionListener(this); stash2.addActionListener(this);
        stash3.addActionListener(this); stash4.addActionListener(this);
	}


	public static void createGUI(Account a) {
        JFrame frame = new JFrame("Champions");
        
        frame.setLocationRelativeTo(null);	// making window appear in center of screen
        
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
    		index = 0;
    		selectedChamp = champs.get(0);
    		b0.setEnabled(false); b1.setEnabled(true); b2.setEnabled(true); b3.setEnabled(true); b4.setEnabled(true);
    		b5.setEnabled(true); b6.setEnabled(true); b7.setEnabled(true); b8.setEnabled(true); b9.setEnabled(true);
    		changeDisplayInfo(0);
 		}
    	else if("Paladin".equals(e.getActionCommand())){
    		index = 1;
    		selectedChamp = champs.get(1);
    		b0.setEnabled(true); b1.setEnabled(false); b2.setEnabled(true); b3.setEnabled(true); b4.setEnabled(true);
    		b5.setEnabled(true); b6.setEnabled(true); b7.setEnabled(true); b8.setEnabled(true); b9.setEnabled(true);
    		changeDisplayInfo(1);
    	}
    	else if("Hunter".equals(e.getActionCommand())){
    		index = 2;
    		selectedChamp = champs.get(2);
    		b0.setEnabled(true); b1.setEnabled(true); b2.setEnabled(false); b3.setEnabled(true); b4.setEnabled(true);
    		b5.setEnabled(true); b6.setEnabled(true); b7.setEnabled(true); b8.setEnabled(true); b9.setEnabled(true);
    		changeDisplayInfo(2);
    	}
    	else if("Rogue".equals(e.getActionCommand())){
    		index = 3;
    		selectedChamp = champs.get(3);
    		b0.setEnabled(true); b1.setEnabled(true); b2.setEnabled(true); b3.setEnabled(false); b4.setEnabled(true);
    		b5.setEnabled(true); b6.setEnabled(true); b7.setEnabled(true); b8.setEnabled(true); b9.setEnabled(true);
    		changeDisplayInfo(3);
    	}
    	else if("Priest".equals(e.getActionCommand())){
    		index = 4;
    		selectedChamp = champs.get(4);
    		b0.setEnabled(true); b1.setEnabled(true); b2.setEnabled(true); b3.setEnabled(true); b4.setEnabled(false);
    		b5.setEnabled(true); b6.setEnabled(true); b7.setEnabled(true); b8.setEnabled(true); b9.setEnabled(true);
    		changeDisplayInfo(4);
    	}
    	else if("Shaman".equals(e.getActionCommand())){
    		index = 5;
    		selectedChamp = champs.get(5);
    		b0.setEnabled(true); b1.setEnabled(true); b2.setEnabled(true); b3.setEnabled(true); b4.setEnabled(true);
    		b5.setEnabled(false); b6.setEnabled(true); b7.setEnabled(true); b8.setEnabled(true); b9.setEnabled(true);
    		changeDisplayInfo(5);
    	}
    	else if("Mage".equals(e.getActionCommand())){
    		index = 6;
    		selectedChamp = champs.get(6);
    		b0.setEnabled(true); b1.setEnabled(true); b2.setEnabled(true); b3.setEnabled(true); b4.setEnabled(true);
    		b5.setEnabled(true); b6.setEnabled(false); b7.setEnabled(true); b8.setEnabled(true); b9.setEnabled(true);
    		changeDisplayInfo(6);
    	}
    	else if("Warlock".equals(e.getActionCommand())){
    		index = 7;
    		selectedChamp = champs.get(7);
    		b0.setEnabled(true); b1.setEnabled(true); b2.setEnabled(true); b3.setEnabled(true); b4.setEnabled(true);
    		b5.setEnabled(true); b6.setEnabled(true); b7.setEnabled(false); b8.setEnabled(true); b9.setEnabled(true);
    		changeDisplayInfo(7);
    	}
    	else if("Monk".equals(e.getActionCommand())){
    		index = 8;
    		selectedChamp = champs.get(8);
    		b0.setEnabled(true); b1.setEnabled(true); b2.setEnabled(true); b3.setEnabled(true); b4.setEnabled(true);
    		b5.setEnabled(true); b6.setEnabled(true); b7.setEnabled(true); b8.setEnabled(false); b9.setEnabled(true);
    		changeDisplayInfo(8);
    	}
    	else if("Druid".equals(e.getActionCommand())){
    		index = 9;
    		selectedChamp = champs.get(9);
    		b0.setEnabled(true); b1.setEnabled(true); b2.setEnabled(true); b3.setEnabled(true); b4.setEnabled(true);
    		b5.setEnabled(true); b6.setEnabled(true); b7.setEnabled(true); b8.setEnabled(true); b9.setEnabled(false);
    		changeDisplayInfo(9);
    	}
    	//EQUIP BUTTONS
    	else if("Equip".equals(e.getActionCommand())){
    		selectedChamp.addEquipment(selectedEquip);
    		stash.remove(selectedEquip);
    		refreshStash();
    		changeDisplayInfo(index);
    		updateAccount();
    	}
    	else if("UnequipSlot1".equals(e.getActionCommand())){
    		Equipment temp = new Equipment();
    		champEquipment = selectedChamp.getEquipment();
    		temp = champEquipment.get(0);
    		champEquipment.remove(0);
    		selectedChamp.setEquipment(champEquipment);
    		stash.add(temp);
    		refreshStash();
    		changeDisplayInfo(index);
    		updateAccount();
    	}
    	else if("UnequipSlot2".equals(e.getActionCommand())){
    		Equipment temp1 = new Equipment();
    		champEquipment = selectedChamp.getEquipment();
    		temp1 = champEquipment.get(1);
    		champEquipment.remove(1);
    		selectedChamp.setEquipment(champEquipment);
    		stash.add(temp1);
    		refreshStash();
    		changeDisplayInfo(index);
    		updateAccount();
    	}
    	//STASH BUTTONS
    	else if("stash0".equals(e.getActionCommand())){
    		selectedEquip = stash.get(0);
    		stash0.setEnabled(false); stash1.setEnabled(true); stash2.setEnabled(true); stash3.setEnabled(true); stash4.setEnabled(true);
    	}
    	else if("stash1".equals(e.getActionCommand())){
    		selectedEquip = stash.get(1);
    		stash0.setEnabled(true); stash1.setEnabled(false); stash2.setEnabled(true); stash3.setEnabled(true); stash4.setEnabled(true);
    	}
    	else if("stash2".equals(e.getActionCommand())){
    		selectedEquip = stash.get(2);
    		stash0.setEnabled(true); stash1.setEnabled(true); stash2.setEnabled(false); stash3.setEnabled(true); stash4.setEnabled(true);
    	}
    	else if("stash3".equals(e.getActionCommand())){
    		selectedEquip = stash.get(3);
    		stash0.setEnabled(true); stash1.setEnabled(true); stash2.setEnabled(true); stash3.setEnabled(false); stash4.setEnabled(true);
    	}
    	else if("stash4".equals(e.getActionCommand())){
    		selectedEquip = stash.get(4);
    		stash0.setEnabled(true); stash1.setEnabled(true); stash2.setEnabled(true); stash3.setEnabled(true); stash4.setEnabled(false);
    	}
    	
    }

    public void changeDisplayInfo(int index){
    	champName.setText(champs.get(index).getName());
		ability1.setText(champs.get(index).getAbilities().get(0).getName());
		ability2.setText(champs.get(index).getAbilities().get(1).getName());
		ability1.setIcon(champs.get(index).getAbilities().get(0).getIcon());
		ability2.setIcon(champs.get(index).getAbilities().get(1).getIcon());
		if (champs.get(index).getEquipment().size() == 0){
			equipped1.setText("Slot 1: Empty");
			equipped2.setText("Slot 2: Empty");
			if(stash.size() != 0){
		        setEquip.setVisible(true);
			}
			else{
		        setEquip.setVisible(false);
			}
	        setUnequip1.setVisible(false);
	        setUnequip2.setVisible(false);
		}
		else if(champs.get(index).getEquipment().size() == 1){
			equipped1.setText("Slot 1: " + champs.get(index).getEquipment().get(0).getName());
			equipped2.setText("Slot 2: Empty");
			if(stash.size() != 0){
		        setEquip.setVisible(true);
			}
			else{
		        setEquip.setVisible(false);
			}
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
    
    public void refreshStash(){
    	stash0.setEnabled(true); stash1.setEnabled(true); stash2.setEnabled(true); stash3.setEnabled(true); stash4.setEnabled(true);
    	if(stash.size() == 0){
    		stash0.setVisible(false); stash1.setVisible(false); stash2.setVisible(false); stash3.setVisible(false); stash4.setVisible(false);
    	}
    	else if(stash.size() == 1){
    		stash0.setVisible(true); stash1.setVisible(false); stash2.setVisible(false); stash3.setVisible(false); stash4.setVisible(false);
    		stash0.setText(stash.get(0).getName());
    		stash0.setToolTipText("<html>Bonus XP: " + stash.get(0).getBonusXP() + "<br>" + "Bonus %Chance: " + stash.get(0).getBonusChance()*100 + "%</html>");
    	}
    	else if(stash.size() == 2){
    		stash0.setVisible(true); stash1.setVisible(true); stash2.setVisible(false); stash3.setVisible(false); stash4.setVisible(false);
    		stash0.setText(stash.get(0).getName());
    		stash0.setToolTipText("<html>Bonus XP: " + stash.get(0).getBonusXP() + "<br>" + "Bonus %Chance: " + stash.get(0).getBonusChance()*100 + "%</html>");
    		stash1.setText(stash.get(1).getName());
    		stash1.setToolTipText("<html>Bonus XP: " + stash.get(1).getBonusXP() + "<br>" + "Bonus %Chance: " + stash.get(1).getBonusChance()*100 + "%</html>");
    	}
    	else if(stash.size() == 3){
    		stash0.setVisible(true); stash1.setVisible(true); stash2.setVisible(true); stash3.setVisible(false); stash4.setVisible(false);
    		stash0.setText(stash.get(0).getName());
    		stash0.setToolTipText("<html>Bonus XP: " + stash.get(0).getBonusXP() + "<br>" + "Bonus %Chance: " + stash.get(0).getBonusChance()*100 + "%</html>");
    		stash1.setText(stash.get(1).getName());
    		stash1.setToolTipText("<html>Bonus XP: " + stash.get(1).getBonusXP() + "<br>" + "Bonus %Chance: " + stash.get(1).getBonusChance()*100 + "%</html>");
    		stash2.setText(stash.get(2).getName());
    		stash2.setToolTipText("<html>Bonus XP: " + stash.get(2).getBonusXP() + "<br>" + "Bonus %Chance: " + stash.get(2).getBonusChance()*100 + "%</html>");
    	}
    	else if(stash.size() == 4){
    		stash0.setVisible(true); stash1.setVisible(true); stash2.setVisible(true); stash3.setVisible(true); stash4.setVisible(false);
    		stash0.setText(stash.get(0).getName());
    		stash0.setToolTipText("<html>Bonus XP: " + stash.get(0).getBonusXP() + "<br>" + "Bonus %Chance: " + stash.get(0).getBonusChance()*100 + "%</html>");
    		stash1.setText(stash.get(1).getName());
    		stash1.setToolTipText("<html>Bonus XP: " + stash.get(1).getBonusXP() + "<br>" + "Bonus %Chance: " + stash.get(1).getBonusChance()*100 + "%</html>");
    		stash2.setText(stash.get(2).getName());
    		stash2.setToolTipText("<html>Bonus XP: " + stash.get(2).getBonusXP() + "<br>" + "Bonus %Chance: " + stash.get(2).getBonusChance()*100 + "%</html>");
    		stash3.setText(stash.get(3).getName());
    		stash3.setToolTipText("<html>Bonus XP: " + stash.get(3).getBonusXP() + "<br>" + "Bonus %Chance: " + stash.get(3).getBonusChance()*100 + "%</html>");
    	}
    	else if(stash.size() == 5){
    		stash0.setVisible(true); stash1.setVisible(true); stash2.setVisible(true); stash3.setVisible(true); stash4.setVisible(true);
    		stash0.setText(stash.get(0).getName());
    		stash0.setToolTipText("<html>Bonus XP: " + stash.get(0).getBonusXP() + "<br>" + "Bonus %Chance: " + stash.get(0).getBonusChance()*100 + "%</html>");
    		stash1.setText(stash.get(1).getName());
    		stash1.setToolTipText("<html>Bonus XP: " + stash.get(1).getBonusXP() + "<br>" + "Bonus %Chance: " + stash.get(1).getBonusChance()*100 + "%</html>");
    		stash2.setText(stash.get(2).getName());
    		stash2.setToolTipText("<html>Bonus XP: " + stash.get(2).getBonusXP() + "<br>" + "Bonus %Chance: " + stash.get(2).getBonusChance()*100 + "%</html>");
    		stash3.setText(stash.get(3).getName());
    		stash3.setToolTipText("<html>Bonus XP: " + stash.get(3).getBonusXP() + "<br>" + "Bonus %Chance: " + stash.get(3).getBonusChance()*100 + "%</html>");
    		stash4.setText(stash.get(4).getName());
    		stash4.setToolTipText("<html>Bonus XP: " + stash.get(4).getBonusXP() + "<br>" + "Bonus %Chance: " + stash.get(4).getBonusChance()*100 + "%</html>");
    	}
    }
    
    public void updateAccount(){
    	account.setChampions(champs);
    	account.setStash(stash);
    }
    
    
}