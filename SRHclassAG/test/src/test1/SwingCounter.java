package test1;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SwingCounter extends JFrame implements ActionListener{
	
	JPanel p = new JPanel();
	JButton btnInc = new JButton("증가");
	JButton btnDec = new JButton("감소");
	JButton btnCls = new JButton("초기화");
	JButton btnCounter = new JButton("카운트다운");
	JLabel labelNumber = new JLabel("10");
	
	public SwingCounter() {
		
		add(p);
		p.add(btnInc);
		p.add(btnDec);
		p.add(btnCls);
		p.add(btnCounter);
		p.add(labelNumber);
		
		btnInc.addActionListener(this);
		btnDec.addActionListener(this);
		btnCls.addActionListener(this);
		btnCounter.addActionListener(this);
		
		labelNumber.setFont(new Font("Gothic", Font.ITALIC, 80));
		
		
		setTitle("간단 카운터");
		setSize(350, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new SwingCounter(); 
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String temp;
		int count;
		if(e.getSource() == btnInc) {
			count = Integer.parseInt(labelNumber.getText().trim())+1;
			labelNumber.setText(Integer.toString(count));
		}
		else if(e.getSource() == btnDec) {
			count = Integer.parseInt(labelNumber.getText().trim())-1;
			if(count>=0) labelNumber.setText(Integer.toString(count));
		}
		else if(e.getSource() == btnCls) {
			labelNumber.setText("10");
			btnCounter.setEnabled(true);
		}
		else if(e.getSource() == btnCounter) {
			CountDownTimer threadTimer = new CountDownTimer(labelNumber);
			Thread thead = new Thread(threadTimer);
			thead.start();
			btnCounter.setEnabled(false);
		}
	}

}


