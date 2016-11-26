package org.game.software;

import org.game.*;

public class Driver {
	public static void main(String[] args) {
		Account account1 = new Account();
		
		account1.setUsername("username");
		account1.setPassword("password");
		LoginGUI newGUI;
		
		newGUI = new LoginGUI("Welcome to the Halls of Valor!", account1);
	}
}