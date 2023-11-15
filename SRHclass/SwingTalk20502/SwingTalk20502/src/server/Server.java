package server;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

public class Server extends JFrame {
	
	JTextArea serverText;
	JScrollPane serverScroll;
	
	
	Server() {
		
		init();
		ready();
		
	}
	
	private void init() {
		
		JPanel p = new JPanel();
		
		serverText = new JTextArea(20, 34);
		serverText.setBackground(Color.yellow);
		
		serverScroll = new JScrollPane(serverText);
		serverScroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		add(p);
		p.add(serverScroll);
		
		setTitle("Chat server");
		setSize(400, 410);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
	private void ready() {
		// TODO Auto-generated method stub
		
	}


	public static void main(String[] args) {
		new Server();
	}
}
