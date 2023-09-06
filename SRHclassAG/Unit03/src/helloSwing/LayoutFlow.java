package helloSwing;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

//JFrame 상속
public class LayoutFlow extends JFrame{
	JPanel p = new JPanel();
	JButton btn1 = new JButton("버튼1");
	JButton btn2 = new JButton("버튼2");
	JButton btn3 = new JButton("버튼3");
	JButton btn4 = new JButton("버튼4");
	JButton btn5 = new JButton("버튼5");
	//JButton btn6 = new JButton("버튼6");
	//JButton btn7 = new JButton("버튼7");
	public LayoutFlow() {
		
		add(p);
		//p.setLayout(new FlowLayout());
		//p.setLayout(new GridLayout(0, 5));
		p.setLayout(new BorderLayout());
		
		p.add(btn1, BorderLayout.EAST);
		p.add(btn2, BorderLayout.WEST);
		p.add(btn3, BorderLayout.NORTH);
		p.add(btn4, BorderLayout.SOUTH);
		p.add(btn5, BorderLayout.CENTER);
		//p.add(btn6);
		//p.add(btn7);
		
		setTitle("플로우 레이아웃");
		setSize(350, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new LayoutFlow();
		
	}
}




