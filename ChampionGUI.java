//Nick did all of this
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;

public class ChampionGUI extends JPanel implements ActionListener {
	
	private static JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9;
	public ArrayList<Champion> champs = new ArrayList<Champion>();
	public ArrayList<Equipment> stash = new ArrayList<Equipment>();
	
	public ChampionGUI(Account a){
		
		champs = a.getChampions();
		stash = a.getStash();
		
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
        
	}


	public static void createGUI(Account a) {
		
        JFrame frame = new JFrame("Champions");

        frame.setVisible(true);
        frame.setSize(750, 470);
        frame.setLayout(null);
        
        frame.add(b0);
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);
        frame.add(b5);
        frame.add(b6);
        frame.add(b7);
        frame.add(b8);
        frame.add(b9);
        
    }

    public void actionPerformed(ActionEvent e) {
    	
    	if("Warrior".equals(e.getActionCommand())) {
    		b0.setEnabled(false); b1.setEnabled(true); b2.setEnabled(true); b3.setEnabled(true); b4.setEnabled(true);
    		b5.setEnabled(true); b6.setEnabled(true); b7.setEnabled(true); b8.setEnabled(true); b9.setEnabled(true);
 		}
    	else if("Paladin".equals(e.getActionCommand())){
    		b0.setEnabled(true); b1.setEnabled(false); b2.setEnabled(true); b3.setEnabled(true); b4.setEnabled(true);
    		b5.setEnabled(true); b6.setEnabled(true); b7.setEnabled(true); b8.setEnabled(true); b9.setEnabled(true);
    	}
    	else if("Hunter".equals(e.getActionCommand())){
    		b0.setEnabled(true); b1.setEnabled(true); b2.setEnabled(false); b3.setEnabled(true); b4.setEnabled(true);
    		b5.setEnabled(true); b6.setEnabled(true); b7.setEnabled(true); b8.setEnabled(true); b9.setEnabled(true);
    	}
    	else if("Rogue".equals(e.getActionCommand())){
    		b0.setEnabled(true); b1.setEnabled(true); b2.setEnabled(true); b3.setEnabled(false); b4.setEnabled(true);
    		b5.setEnabled(true); b6.setEnabled(true); b7.setEnabled(true); b8.setEnabled(true); b9.setEnabled(true);
    	}
    	else if("Priest".equals(e.getActionCommand())){
    		b0.setEnabled(true); b1.setEnabled(true); b2.setEnabled(true); b3.setEnabled(true); b4.setEnabled(false);
    		b5.setEnabled(true); b6.setEnabled(true); b7.setEnabled(true); b8.setEnabled(true); b9.setEnabled(true);
    	}
    	else if("Shaman".equals(e.getActionCommand())){
    		b0.setEnabled(true); b1.setEnabled(true); b2.setEnabled(true); b3.setEnabled(true); b4.setEnabled(true);
    		b5.setEnabled(false); b6.setEnabled(true); b7.setEnabled(true); b8.setEnabled(true); b9.setEnabled(true);
    	}
    	else if("Mage".equals(e.getActionCommand())){
    		b0.setEnabled(true); b1.setEnabled(true); b2.setEnabled(true); b3.setEnabled(true); b4.setEnabled(true);
    		b5.setEnabled(true); b6.setEnabled(false); b7.setEnabled(true); b8.setEnabled(true); b9.setEnabled(true);
    	}
    	else if("Warlock".equals(e.getActionCommand())){
    		b0.setEnabled(true); b1.setEnabled(true); b2.setEnabled(true); b3.setEnabled(true); b4.setEnabled(true);
    		b5.setEnabled(true); b6.setEnabled(true); b7.setEnabled(false); b8.setEnabled(true); b9.setEnabled(true);
    	}
    	else if("Monk".equals(e.getActionCommand())){
    		b0.setEnabled(true); b1.setEnabled(true); b2.setEnabled(true); b3.setEnabled(true); b4.setEnabled(true);
    		b5.setEnabled(true); b6.setEnabled(true); b7.setEnabled(true); b8.setEnabled(false); b9.setEnabled(true);
    	}
    	else if("Druid".equals(e.getActionCommand())){
    		b0.setEnabled(true); b1.setEnabled(true); b2.setEnabled(true); b3.setEnabled(true); b4.setEnabled(true);
    		b5.setEnabled(true); b6.setEnabled(true); b7.setEnabled(true); b8.setEnabled(true); b9.setEnabled(false);
    	}
    	
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