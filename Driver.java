

public class Driver {
	public static void main(String[] args) {
		Account account1 = new Account();
		Mission mission1 = new Mission();
		
		mission1.setLevel(10);
		
		account1.setUsername("username");
		account1.setPassword("password");
		LoginGUI newGUI;
		
		newGUI = new LoginGUI("Welcome to the Halls of Valor!", account1);
		
		SelectScreenGUI selectScreen = new SelectScreenGUI(account1);
		selectScreen.createGUI();
		
		MissionGUI missionGUI = new MissionGUI("this is a test", mission1);
	}
}