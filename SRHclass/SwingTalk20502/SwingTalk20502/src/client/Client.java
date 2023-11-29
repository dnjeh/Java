package client;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

import server.ServerReceiver;

public class Client extends JFrame implements ActionListener {
	
	String userID;
	JPanel jp_top, jp_chat, jp_bottom;
	
	JLabel userLabel;
	
	JTextArea txtSend;
	JButton btn_imo;
	
	JTextArea chatArea;
	JScrollPane chatScroll;
	
	JMenuBar menuBar;
	JMenu menu;
	JMenuItem[] menuItem;
	
	public Client(String userID) {
		
		this.userID = userID;
		
		setLayout(null);
		
		createMenu();
		draw_top_panel();
		draw_chat_panel();
		draw_bottom_panel();
		
		setTitle("Robot Chat");
		setSize(300, 620);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		Listener listener = new Listener(userID, chatArea, chatScroll);
		Thread thread = new Thread(listener);
		thread.start();
		
	}

	private void createMenu() {
		menuBar = new JMenuBar();
		menu = new JMenu("설정");
		
		menuItem = new JMenuItem[5];
		String[] menuTitle = {"이름번경", "배경변경", "폰트번경", "서버주소번경", "종료"};
		int i;
		
		for(i=0;i<menuItem.length;i++) {
			menuItem[i] = new JMenuItem(menuTitle[i]);
			menuItem[i].addActionListener(this);
			menu.add(menuItem[i]);
		}
		
		menuBar.add(menu);
		setJMenuBar(menuBar);
		
	}

	private void draw_top_panel() {
		jp_top = new JPanel();
		jp_top.setBounds(0, 0, 300, 40);
		jp_top.setBackground(Color.yellow);
		
		userLabel = new JLabel();
		userLabel.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		userLabel.setText(userID);
		
		add(jp_top);
		jp_top.add(userLabel);
	}

	private void draw_chat_panel() {
		jp_chat = new JPanel();
		jp_chat.setBounds(0, 40, 300, 440);
		jp_chat.setBackground(Color.gray);
		jp_chat.setLayout(new GridLayout(0, 1));
		
		chatArea = new JTextArea();
		chatArea.setBackground(Color.pink);
		
		chatScroll = new JScrollPane(chatArea);
		chatScroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		add(jp_chat);
		jp_chat.add(chatScroll);
		
	}

	private void draw_bottom_panel() {
		jp_bottom = new JPanel();
		jp_bottom.setBounds(0, 480, 300, 100);
		jp_bottom.setBackground(Color.gray);
		jp_bottom.setLayout(null);
		
		txtSend = new JTextArea();
		txtSend.setBounds(4, 4, 200, 85);
		txtSend.setLineWrap(true);
		
		btn_imo = new JButton("♥");
		btn_imo.setBounds(220, 4, 60, 30);
		
		add(jp_bottom);
		jp_bottom.add(txtSend);
		jp_bottom.add(btn_imo);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==menuItem[0]) {
			userID = JOptionPane.showInputDialog("새 이름을 입력해주세요");
			if(userID.trim().length()!=0) {
				userLabel.setText(userID);	
			}
			else {
				JOptionPane.showMessageDialog(null, "이름를 입력하세요");
			}
		}
		else if(e.getSource()==menuItem[1]) {
			SelectRGB rgbDia = new SelectRGB(chatArea);
		}
		else if(e.getSource()==menuItem[2]) {
			SelectFont fontDlg = new SelectFont(userLabel);
		}
		else if(e.getSource()==menuItem[3]) {
			
		}
		else if(e.getSource()==menuItem[4]) {
	
		}
	}
}
