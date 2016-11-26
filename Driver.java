package org.game.software;

import org.game.*;

public class Driver {
	public static void main(String[] args) {
		Account account1 = new Account();
		
		account1.setUsername("jptomanibarra");
		account1.setPassword("hunter2");
		HOVGUI newGUI;
		
		newGUI = new HOVGUI("HOVGUI", account1);
	}
}