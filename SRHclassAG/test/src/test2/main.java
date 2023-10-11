package test2;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class main extends JFrame implements ActionListener {
	JPanel p = new JPanel();
	JButton btnpp = new JButton("증");
	JButton btnmm = new JButton("감");
	JButton btncls = new JButton("초기화");
	JButton btnpmc = new JButton("카운트다운");
	JLabel asdf = new JLabel("10");
	
	main() {
		asdf.setFont(new Font("Gordic", Font.ITALIC, 100));
		
		add(p);
		p.add(btnpp);
		p.add(btnmm);
		p.add(btncls);
		p.add(btnpmc);
		p.add(asdf);
		
		btnpp.addActionListener(this);
		btnmm.addActionListener(this);
		btncls.addActionListener(this);
		btnpmc.addActionListener(this);
		
		setTitle("asfsdgiofewq");
		setSize(350, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new main();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnpp) {
			asdf.setText(Integer.toString(Integer.parseInt(asdf.getText().trim())+1));
		}
		else if(e.getSource()==btnmm) {
			if(Integer.parseInt(asdf.getText().trim())>0)
				asdf.setText(Integer.toString(Integer.parseInt(asdf.getText().trim())-1));
		}
		else if(e.getSource()==btncls) {
			asdf.setText(Integer.toString(10));
			btnpmc.setEnabled(true);
		}
		else if(e.getSource()==btnpmc) {
			
			btnpmc.setEnabled(false);
		} 
	}
	
}


