
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

public class SelectScreen extends JPanel implements ActionListener {
	
	public SelectScreen() {
		
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

	private static void createAndShowGUI() {
 
        //Create and set up the window.
        JFrame frame = new JFrame("Select Screen");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        //Create and set up the content pane.
        SelectScreen newContentPane = new SelectScreen();
        newContentPane.setOpaque(true); //content panes must be opaque
        frame.setContentPane(newContentPane);
 
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
 


	public void actionPerformed(ActionEvent e){
		if("missonScreen".equals(e.getActionCommand())){
			
		}
	}
}
