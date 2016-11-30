
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LoginGUI extends JFrame {
//	private JMenuBar menuBar;
	private Account account;
	private JButton loginButton;
	private JPanel panelButton;
	
	public LoginGUI(String windowTitle, Account userAccount) {
		super(windowTitle);
		
		account = userAccount;
		
		setSize(500,500);
		
		add(new JLabel("<HTML><center>Welcome to the Halls of Valor!</center></HTML>", SwingConstants.CENTER));
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		buildGUI();
		
		
		
		setVisible(true);
		

	}
	
	public void buildGUI() {
		loginButton = new JButton("Login");
		panelButton = new JPanel();
		
//		panelButton.setBounds();
		panelButton.setLayout(null);
		panelButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		loginButton.setBounds(200,200, 220, 30);
		
		
		
		loginButton.addActionListener(new ButtonListener());
		panelButton.add(loginButton);
		add(panelButton);
//		setJMenuBar(menuBar);
	}
	
	private class ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton source = (JButton)(e.getSource());
			
			if(source.equals(loginButton)) {
				handleLogin();
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
				dispose();
			} else {
				JOptionPane.showMessageDialog(null, "Failure");
			}
			
//			String temp = JOptionPane.showInputDialog(null, "Enter Password for " + account.getUsername() + ":", "Login", JOptionPane.PLAIN_MESSAGE);
//			
//			if (account.login("username", temp)) {
//				JOptionPane.showMessageDialog(null, "Success");
//			} else {
//				JOptionPane.showMessageDialog(null, "Password not correct.");
//			}
		}
	}
}