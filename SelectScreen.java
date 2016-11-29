import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

public class SelectScreen extends JPanel implements ActionListener {
		
	JButton missionSelect = new JButton("Missions");
	missionSelect.setVerticalTextPosition(AbstractButton.CENTER);
	missionSelect.setActionCommand("missionScreen");
	
	JButton championSelect = new JButton("Champions");
	championSelect.setVerticalTextPosition(AbstractButton.CENTER);
	championSelect.setActionCommand("championScreen");
	
	missonSelect.addActionListener(this);
	championSelect.addActionListener(this);
	add(missionSelect);
	add(championSelect);

}

 private static void createAndShowGUI() {
 
        //Create and set up the window.
        JFrame frame = new JFrame("ButtonDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        //Create and set up the content pane.
        ButtonDemo newContentPane = new ButtonDemo();
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
