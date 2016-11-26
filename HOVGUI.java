package org.game.software;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HOVGUI extends JFrame {
	private JMenuBar menuBar;
	private Account account;
	
	public HOVGUI(String windowTitle, Account userAccount) {
		super(windowTitle);
		
		account = userAccount;
		
		setSize(500,500);
		
		add(new JLabel("<HTML><center>Welcome to the Halls of Valor!</center></HTML>", SwingConstants.CENTER));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//		buildGUI();
		
		
		
		setVisible(true);
		
		String temp = JOptionPane.showInputDialog(null, "Enter Password for jptomanibarra:", "Login", JOptionPane.PLAIN_MESSAGE);
		
		if (account.login("jptomanibarra", temp)) {
			JOptionPane.showMessageDialog(null, "Success");
		} else {
			JOptionPane.showMessageDialog(null, "Failure");
		}
	}
	
	public void buildGUI() {
		menuBar = new JMenuBar();
		
		setJMenuBar(menuBar);
	}
}