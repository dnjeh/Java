package client;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class Client extends JFrame {
	
	String userID;
	
	public Client(String userID) {
		this.userID = userID;
		
		setTitle("Robot Chat");
		setSize(300, 620);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}
}
