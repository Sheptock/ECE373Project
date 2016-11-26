package org.game.software;

import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MissionSelectGUI extends JPanel implements ActionListener {
		
	//Populate Missons



 private static void createGUI() {
 
        //Create and set up the window.
        JFrame frame = new JFrame("Mission Select");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        //Create and set up the content pane.
        MissionSelectGUI newContentPane = new MissionSelectGUI();
        newContentPane.setOpaque(true); //content panes must be opaque
        frame.setContentPane(newContentPane);
 
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
 


public void actionPerformed(ActionEvent e){
	
	
	//Load a specific Misson Page Depending on what is selected.
}

}