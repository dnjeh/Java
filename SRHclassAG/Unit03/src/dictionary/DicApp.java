package dictionary;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class DicApp extends JFrame implements ActionListener{
	
	JPanel p = new JPanel();
	JButton saveBtn = new JButton("저장");
	JButton searchBtn = new JButton("찾기");
	
	JLabel engLb = new JLabel("영어");
	JLabel korLb = new JLabel("한글");
	JLabel cntLb = new JLabel("0");
	
	JTextField engTf = new JTextField(9);
	JTextField korTf = new JTextField(9);
	
	JTextArea ta = new JTextArea(7, 25);
	JScrollPane sp = new JScrollPane(ta);
	
	HashMap<String, String> dic = new HashMap<>();
	
	public DicApp() {
		add(p);
		p.add(engLb);
		p.add(engTf);
		p.add(korLb);
		p.add(korTf);
		p.add(saveBtn);
		p.add(searchBtn);
		p.add(cntLb);
		p.add(sp);
		
		saveBtn.addActionListener(this);
		searchBtn.addActionListener(this);
		
		setTitle("단어 사전 만들기");
		setSize(300, 250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	public static void main(String[] args) {
		new DicApp();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==saveBtn) {
			String eng = engTf.getText().trim();
			String kor = korTf.getText().trim();
			String temp = new String();
			if(eng.length()==0||kor.length()==0) {
				temp = "삽입 실패";
			}
			else {
				if(dic.containsKey(eng)) {
					temp = "번경";
				}
				else {
					temp = "삽입 성공";
					String str = cntLb.getText().trim();
					int count = Integer.parseInt(str) + 1;
					str = Integer.toString(count);
					cntLb.setText(str);
				}
				dic.put(eng, kor);
			}
			ta.append(temp+" (" + eng + "," + kor + ")\n");
		}
		else if(e.getSource()==searchBtn) {
			String eng = engTf.getText().trim();
			String temp = new String();
			if(eng.length()==0||!dic.containsKey(eng)) {
				temp = "검색 실패\n";
			}
			else {
				String kor = dic.get(eng);
				korTf.setText(kor);
				temp = "검색 성공"+" (" + eng + "," + kor + ")\n";
				String str = cntLb.getText().trim();
				int count = Integer.parseInt(str) + 1;
				str = Integer.toString(count);
				cntLb.setText(str);
			}
			ta.append(temp);
		}
	}
	
}
