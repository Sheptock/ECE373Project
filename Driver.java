

public class Driver {
	public static void main(String[] args) {
		Account account1 = new Account();
		
		account1.setUsername("username");
		account1.setPassword("password");
		LoginGUI newGUI;
		
		newGUI = new LoginGUI("Welcome to the Halls of Valor!", account1);
		
		SelectScreenGUI selectScreen = new SelectScreenGUI(account1);
		selectScreen.createGUI();
	}
}