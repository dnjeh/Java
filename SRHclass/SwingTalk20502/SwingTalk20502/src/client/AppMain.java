package client;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AppMain extends JFrame implements ActionListener {
	
	JTextField txt_login;
	JButton btn_login;
	
	public AppMain() {
		
		JPanel p = new JPanel();
		p.setBackground(Color.green);
		p.setLayout(null);
		
		txt_login = new JTextField("20502 김도원");
		btn_login = new JButton("확인");
		txt_login.setBounds(50, 400, 200, 30);
		btn_login.setBounds(50, 440, 200, 30);
		
		ImageIcon image = new ImageIcon("img/robot.png");
		JLabel profile = new JLabel(image); 
		profile.setBounds(70, 160, 160, 160);
		
		add(p);
		p.add(txt_login);
		p.add(btn_login);
		p.add(profile);
		
		setTitle("RobotChat Login");
		setSize(320, 600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		btn_login.addActionListener(this);
	}
	
	public static void main(String[] args) {
		new AppMain();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btn_login) {
			String userID =txt_login.getText(); 
			if(userID.length()==0) {
				JOptionPane.showMessageDialog(null, "아이디를 입력하세요");
			}
			else {
				new Client(userID);
				dispose();
			}
		}
	}
}
