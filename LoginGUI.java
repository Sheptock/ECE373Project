
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LoginGUI extends JFrame {
//	private JMenuBar menuBar;
	private Account account;
	private JButton loginButton;
	private JPanel buttonPanel;
	private JPanel dispPanel;
	private JButton quitButton;
	
	public LoginGUI(String windowTitle, Account userAccount) {
		super(windowTitle);
		
		account = userAccount;
		
		setSize(400,250);
		
		add(new JLabel("<HTML><center>Welcome to the Halls of Valor!</center></HTML>", SwingConstants.CENTER));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		buildGUI();
		
		
//		pack();
		setVisible(true);
		

	}
	
	public void buildGUI() {
		GridLayout buttonLayout = new GridLayout(1,2);
		
		loginButton = new JButton("Login");
		quitButton = new JButton("Quit");
		
		dispPanel = new JPanel();
		buttonPanel = new JPanel();
		
		setLayout(new BorderLayout());
		
		buttonLayout.setHgap(5);
		
//		buttonPanel.setBounds();

		buttonPanel.setLayout(buttonLayout);
//		buttonPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
//		loginButton.setBounds(120, 200, 200, 30);

		
		
		
		loginButton.addActionListener(new ButtonListener());
		quitButton.addActionListener(new ButtonListener());
		
		dispPanel.add(new JLabel("Welcome to the Halls of Valor!"));
		
		buttonPanel.add(loginButton);
		buttonPanel.add(quitButton);
		add(dispPanel, BorderLayout.CENTER);
		add(buttonPanel, BorderLayout.SOUTH);
//		setJMenuBar(menuBar);
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
			
			GridLayout layout = new GridLayout(2,1);
//			layout.setHgap(50);
			layout.setVgap(10);
			
			myPanel.setLayout(layout);
			
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
		}
		private void handleQuit() {
			JOptionPane.showMessageDialog(null, "Exiting");
			System.exit(0);
		}
	}
}