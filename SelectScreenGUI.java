import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SelectScreenGUI extends JPanel implements ActionListener {
	Account account;
	
	public SelectScreenGUI(Account a) {
		this.account = a;
		JButton missonSelect = new JButton("Missons");
		missonSelect.setVerticalTextPosition(AbstractButton.CENTER);
		missonSelect.setActionCommand("missonScreen");
		
		JButton championSelect = new JButton("Champions");
		championSelect.setVerticalTextPosition(AbstractButton.CENTER);
		championSelect.setActionCommand("championScreen");
		
		missonSelect.addActionListener(this);
		championSelect.addActionListener(this);
		add(missonSelect);
		add(championSelect);

	}

	 public void createGUI() {
	 
	        //Create and set up the window.
	        JFrame frame = new JFrame("Select Screen");
	    
	 
	        //Create and set up the content pane.
	        SelectScreenGUI newContentPane = new SelectScreenGUI(this.account);
	        newContentPane.setOpaque(true); //content panes must be opaque
	        frame.setContentPane(newContentPane);
	        
	        //Display the window.
	        frame.pack();
	        frame.setLocationRelativeTo(null);	// making window appear on center of screen
	        frame.setVisible(true);
	        
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    }
	 
	
	
	public void actionPerformed(ActionEvent e){
		if("missonScreen".equals(e.getActionCommand())){
			MissionSelectGUI missionSelect = new MissionSelectGUI(this.account);
			missionSelect.createGUI();
		}
		else{
			ChampionGUI championGUI = new ChampionGUI(this.account);
			championGUI.createGUI(this.account);
			
		}
	}
}