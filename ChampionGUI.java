import java.util.ArrayList;

public class ChampionGUI() extends JPanel implements ActionListener {
		
	//Populate Champions
	
	//Populate Equipment

}

 private static void createGUI() {
 
        //Create and set up the window.
        JFrame frame = new JFrame("Champions");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        //Create and set up the content pane.
        ChampionGUI newContentPane = new ChampionGUI();
        newContentPane.setOpaque(true); //content panes must be opaque
        frame.setContentPane(newContentPane);
 
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
 


public void actionPerformed(ActionEvent e){
		
	//Equip items onto champions.
	//Call the function equipItemOnChampion
}

public boolean equipItemOnChampion (Champion c, Equipment e){
	
	if(c.checkSlotAvailable == true) {
		c.addEquipment(e);
		e.setChampion(c);
		return true;
	}
	
	else {
		return false;
	}
	
}