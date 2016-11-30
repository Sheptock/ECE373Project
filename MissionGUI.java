import javax.swing.*;
import java.awt.*;

public class MissionGUI extends JFrame {
	
	ImageIcon image;
	JLabel imageLabel;
	
	public MissionGUI(String windowTitle) {
		super(windowTitle);
		
		setSize(500,500);
		
		add(new JLabel("<HTML><center>Mission</center></HTML>"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		image = new ImageIcon("C:\\Users\\Owner\\Desktop\\halls_of_valor\\images\\reward-icon.png");
		imageLabel = new JLabel(image);
		imageLabel.setBounds(10, 10, 10, 10);
		imageLabel.setVisible(true);
		
		add(imageLabel);
		
		setVisible(true);
		
	}
	
}