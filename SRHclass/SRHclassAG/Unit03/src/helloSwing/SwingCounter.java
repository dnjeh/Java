package helloSwing;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SwingCounter extends JFrame implements ActionListener{
	int cnt=0;
	JPanel p = new JPanel();
	JButton btnInc = new JButton("증가");
	JButton btnDec = new JButton("감소");
	JButton btnCls = new JButton("초기화");
	JLabel lb = new JLabel("카운터값", JLabel.CENTER);
	JTextField tfCounter = new JTextField(Integer.toString(cnt), 5);
	SwingCounter() {
		
		p.add(lb);
		p.add(tfCounter);
		p.add(btnInc);
		p.add(btnDec);
		p.add(btnCls);
		add(p);
		
		btnInc.addActionListener(this);
		btnDec.addActionListener(this);
		btnCls.addActionListener(this);
		
		setTitle("간단-카운터");
		setSize(400, 150);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnInc) {
			/*
			String str = tfCounter.getText().trim();
			int count = Interger.parseInt(str) + 1;
			str = Integer.toString(count);
			tfCounter.setText(str);
			 */
			//tfCounter.setText(Integer.toString(Integer.parseInt(tfCounter.getText().trim()) + 1));
			cnt++;
			tfCounter.setText(Integer.toString(cnt));
		}
		else if(e.getSource() == btnDec){
			//tfCounter.setText(Integer.toString(Integer.parseInt(tfCounter.getText().trim()) - 1));
			cnt--;
			tfCounter.setText(Integer.toString(cnt));
		}
		else {
			//tfCounter.setText("0");
			cnt=0;
			tfCounter.setText(Integer.toString(cnt));
		}
	}
	public static void main(String[] args) {
		new SwingCounter();
	}

}
