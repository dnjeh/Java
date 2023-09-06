package eventExam;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

//JFrame 상속
public class ButtonExam extends JFrame implements ActionListener{
	JPanel p = new JPanel();
	JButton btn1 = new JButton("노란색");
	JButton btn2 = new JButton("핑크색");
	public ButtonExam() {
		
		add(p);
		p.add(btn1);
		p.add(btn2);
		
		btn1.setBackground(Color.yellow);
		btn2.setBackground(Color.pink);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		
		setTitle("패널 색 바꾸기");
		setSize(700, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new ButtonExam();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btn1) {
			p.setBackground(Color.yellow);
		}
		else if(e.getSource()==btn2) {
			p.setBackground(Color.pink);
		}
	}
}




