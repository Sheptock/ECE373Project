
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LoginGUI extends JFrame {
//	private JMenuBar menuBar;
	private Account account;
	private JButton loginButton;
	private JButton quitButton;
	private JPanel buttonPanel;
	
	public LoginGUI(String windowTitle, Account userAccount) {
		super(windowTitle);
		
		account = userAccount;
		
//		setSize(500,500);
		
		add(new JLabel("<HTML><center>Welcome to the Halls of Valor!</center></HTML>", SwingConstants.CENTER));
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new BorderLayout());
	    setContentPane(new JLabel(new ImageIcon("C:\\Users\\Owner\\Desktop\\halls_of_valor\\images\\login-background.jpg")));
	    setLayout(new BorderLayout());

	    // Just for refresh :) Not optional!
	    setSize(399,399);
	    setSize(400,400);
		
		buildGUI();
		
		// this line centers the window on the screen when it is created
		setLocationRelativeTo(null);
		
		setVisible(true);
		

	}
	
	public void buildGUI() {
		GridLayout buttonLayout = new GridLayout(1,2);
		
		loginButton = new JButton("Login");
		buttonPanel = new JPanel();
		quitButton = new JButton("Quit");
		
		loginButton.addActionListener(new ButtonListener());
		quitButton.addActionListener(new ButtonListener());
		
//		buttonLayout.setHgap();
		buttonPanel.setLayout(buttonLayout);
		
		buttonPanel.add(loginButton);
		buttonPanel.add(quitButton);
		add(buttonPanel, BorderLayout.SOUTH);
		add(new JLabel("<HTML><center><b><font color = white>Welcome to the Halls of Valor!</font></b></center></HTML>", SwingConstants.CENTER));
	}
	
	private class ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton source = (JButton)(e.getSource());
			
			if(source.equals(loginButton)) {
				handleLogin();
			} else if(source.equals(quitButton)) {
				handleQuit();
			}
		}
		private void handleLogin() {
			JTextField usernameField = new JTextField(10);
			JTextField passwordField = new JTextField(10);
			JPanel myPanel = new JPanel();
			
			myPanel.add(new JLabel("Username: "));
			myPanel.add(usernameField);
			myPanel.add(Box.createVerticalStrut(15));
			myPanel.add(new JLabel("Password: "));
			myPanel.add(passwordField);
			
			JOptionPane.showConfirmDialog(null, myPanel, "Login", JOptionPane.OK_CANCEL_OPTION);
			
			if(account.login(usernameField.getText(), passwordField.getText())) {
				JOptionPane.showMessageDialog(null, "Logging in...");
//				setVisible(false);
				SelectScreenGUI selectScreen = new SelectScreenGUI(account);
				selectScreen.createGUI();
				dispose();
			} else {
				JOptionPane.showMessageDialog(null, "Please Try Again");
			}			
		}
		private void handleQuit() {
//			JOptionPane.showMessageDialog(null, "Goodbye");
			System.exit(0);
		}
	}
}