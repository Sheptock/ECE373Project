import java.util.ArrayList;

public class Driver {
	public static void main(String[] args) {
		Account account1 = new Account();
		Mission mission1 = new Mission();
		
		mission1.setLevel(10);
		mission1.setDescription("this is but a simple test description");
		
		account1.setUsername("username");
		account1.setPassword("password");
		
		ArrayList champions = new ArrayList<Champion>();
		
		Champion c1 = new Champion("Arthas");
		Champion c2 = new Champion("Illidan Stormrage");
		Champion c3 = new Champion("Brann Bronzebeard");
		Champion c4 = new Champion("Kael'thas Sunstrider");
		Champion c5 = new Champion("Sylvanas Windrunner");
		Champion c6 = new Champion("Uther the Lightbringer");
		Champion c7 = new Champion("Ryan from Accounting");
		Champion c8 = new Champion("Jake from State Farm");
		Champion c9 = new Champion("Billy the Kidd");
		Champion c10 = new Champion("Out of Ideas");
		
		champions.add(c1);
		champions.add(c2);
		champions.add(c3);
		champions.add(c4);
		champions.add(c5);
		champions.add(c6);
		champions.add(c7);
		champions.add(c8);
		champions.add(c9);
		champions.add(c10);
		
		account1.setChampions(champions);
		
		
		LoginGUI newGUI;
		
//		ChampionGUI champGUI = new ChampionGUI(account1);
		
		newGUI = new LoginGUI("Welcome to the Halls of Valor!", account1);
		
//		SelectScreenGUI selectScreen = new SelectScreenGUI(account1);
//		selectScreen.createGUI();
		
//		MissionGUI missionGUI = new MissionGUI("this is a test", mission1);
	}
}