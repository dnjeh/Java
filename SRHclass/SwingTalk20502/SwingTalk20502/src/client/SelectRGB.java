package client;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;

public class SelectRGB extends JDialog {
	JTextArea chatArea;
	
	JScrollBar scroll_r, scroll_g, scroll_b;
	JLabel label_r, label_g, label_b;
	JLabel sample;
	JButton btnOk, btnNO;
	
	public SelectRGB(JTextArea chatArea) {
		this.chatArea = chatArea;
		
		setTitle("RGB 값을 조절하여 배경색을 선택하세요");
		setSize(500, 250);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setModal(true);
		setVisible(true);
	}
}
