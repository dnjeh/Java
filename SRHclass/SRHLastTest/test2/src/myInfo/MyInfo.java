package myInfo;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class MyInfo extends JFrame implements ListSelectionListener, ActionListener {
	
	String[] year = {"2005", "2006", "2007", "2008", "2009"};
	Integer[] month = new Integer[12];
	String[] day = new String[31];
	
	JList<String> listYear = new JList<String>(year);
	JList<Integer> listMonth = new JList<Integer>(month);
	JList<String> listDay = new JList<String>(day);
	
	JScrollPane scrollMonth = new JScrollPane(listMonth);
	JScrollPane scrollDay = new JScrollPane(listDay);
	
	JRadioButton radio_male = new JRadioButton("남자");
	JRadioButton radio_female = new JRadioButton("여자");
	
	JLabel sample = new JLabel("20502 김도원");
	
	JCheckBox check_agree = new JCheckBox("개인정보 제공에 동의합니다.");
	
	JButton btnOk = new JButton("확인");
	JButton btnNo = new JButton("취소");
	
	Font defaultFont = new Font("굴림", Font.BOLD, 20);
	
	MyInfo() {
		int i;
		for(i=0;i<month.length;i++) {
			month[i]=i+1;
		}
		for(i=0;i<day.length;i++) {
			day[i]= Integer.toString(i+1);
		}
		
		ButtonGroup buttonGroup = new ButtonGroup();
		
		buttonGroup.add(radio_female);
		buttonGroup.add(radio_male);
		
		initLayout();
		
		listYear.addListSelectionListener(this);
		listMonth.addListSelectionListener(this);
		listDay.addListSelectionListener(this);
		
		radio_male.addActionListener(this);
		radio_female.addActionListener(this);
		
		btnOk.addActionListener(this);
		btnNo.addActionListener(this);
		
	}
	
	private void initLayout() {
		
		JPanel p = new JPanel();
		add(p);
		p.setLayout(null);
		
		listYear.setBounds(10, 30, 90, 160);
		scrollMonth.setBounds(120, 30, 90, 160);
		scrollDay.setBounds(220, 30, 90, 160);
		
		radio_male.setBounds(320, 30, 80, 50);
		radio_female.setBounds(320, 80, 80, 50);
		
		radio_male.setFont(defaultFont);
		radio_female.setFont(defaultFont);
		
		radio_male.setSelected(true);
		
		
		sample.setBounds(10, 180, 500, 50);
		sample.setFont(defaultFont);
		
		check_agree.setBounds(10, 300, 500, 50);
		check_agree.setFont(defaultFont);
		
		btnOk.setBounds(100, 360, 80, 20);
		btnNo.setBounds(200, 360, 80, 20);
		
		p.add(listYear);
		p.add(scrollMonth);
		p.add(scrollDay);
		p.add(radio_male);
		p.add(radio_female);
		p.add(sample);
		p.add(check_agree);
		p.add(btnOk);
		p.add(btnNo);
		
		listYear.setSelectedIndex(0);
		listMonth.setSelectedIndex(0);
		listDay.setSelectedIndex(0);
		
		changeSample();
		
		setTitle("수행평가 연습");
		setSize(450, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new MyInfo();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnOk) {
			if(check_agree.isSelected()) {
				JOptionPane.showMessageDialog(null, "감사합니다.");
				dispose();
			}
			else {
				JOptionPane.showMessageDialog(null, "개인정보 동의 버튼을 클릭해주세요.");
			}
		}
		else if(e.getSource() == btnNo) {
			dispose();
		}
		else if((e.getSource() == radio_male) || (e.getSource() == radio_female)) {
		
			changeSample();	
			
		}
	}	

	private void changeSample() {
		String y = listYear.getSelectedValue();
		int m = listMonth.getSelectedValue();
		String d = listDay.getSelectedValue();
		
		String info = "생년월일 : " + y + "년 " + m + "월 " + d + "일";
		
		if(radio_male.isSelected()) {
			info = "성별 : 남 / " + info;
		}
		else if(radio_female.isSelected()) {
			info = "성별 : 여 / " + info;
		}
		sample.setText(info);
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		if((e.getSource() == listDay) || (e.getSource() == listMonth) || (e.getSource() == listYear)) {
			changeSample();
		}
	}

}

