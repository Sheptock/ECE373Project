

public class Driver {
	public static void main(String[] args) {
		Account account1 = new Account();
		Mission mission1 = new Mission();
		
		mission1.setLevel(10);
		mission1.setDescription("this is but a simple test description");
		
		account1.setUsername("username");
		account1.setPassword("password");
		LoginGUI newGUI;
		
//		newGUI = new LoginGUI("Welcome to the Halls of Valor!", account1);
		//if login is correct then proceed
//		SelectScreenGUI selectScreen = new SelectScreenGUI(account1);
//		selectScreen.createGUI();

//		SelectScreenGUI selectScreen = new SelectScreenGUI(account1);
//		selectScreen.createGUI();

		
		MissionGUI missionGUI = new MissionGUI("this is a test", mission1);
//		MissionSelectGUI missionSelGUI = new MissionSelectGUI(account1);
//		missionSelGUI.createGUI();
	}
}