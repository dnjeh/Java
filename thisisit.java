package test;

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

public class Test extends JFrame implements ActionListener, ListSelectionListener{
	
	String[] y = {"2005","2006","2007","2008","2009"};
	Integer[] m = new Integer[12];
	Integer[] d = new Integer[31];
	
	JList<String> listy = new JList<String>(y);
	JList<Integer> listm = new JList<Integer>(m);
	JList<Integer> listd = new JList<Integer>(d);
	
	JButton yes = new JButton("확인");
	JButton no = new JButton("취소");
	
	JLabel s = new JLabel("20506 김준서");
	
	JRadioButton man = new JRadioButton("남자");
	JRadioButton woman = new JRadioButton("여자");
	
	JCheckBox agree = new JCheckBox("개인정보 제공에 동의합니다.");
	
	JScrollPane scrolld = new JScrollPane(listd);
	JScrollPane scrollm = new JScrollPane(listm);
	
	Font defaultFont = new Font("굴림", Font.BOLD, 20);
	
	
	
	Test(){
		yes.addActionListener(this);
		no.addActionListener(this);
		listy.addListSelectionListener(this);
		listm.addListSelectionListener(this);
		listd.addListSelectionListener(this);
		man.addActionListener(this);
		woman.addActionListener(this);
		for(int i=0; i<m.length; i++) {
			m[i]=i+1;
		}
		for(int i=0; i<d.length; i++) {
			d[i]=i+1;
		}
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(man);
		bg.add(woman);
		
		JPanel p = new JPanel();
		p.setLayout(null);
		add(p);
		
		//리스트 위치 
		listy.setBounds(10, 30, 90, 160);
		scrollm.setBounds(120, 30, 90, 160);
		scrolld.setBounds(220, 30, 90, 160);
		
		//라디오 버튼 위치, 폰트값 설정, 남자가 선택되도록
		man.setBounds(320, 30, 80, 50);
		woman.setBounds(320, 80, 80, 50);
		
		man.setFont(defaultFont);
		woman.setFont(defaultFont);
		
		man.setSelected(true);
		
		
		//라벨위치
		s.setBounds(10, 180, 500, 50);
		s.setFont(defaultFont);
		
		//check box
		agree.setBounds(10, 300, 500, 50);
		agree.setFont(defaultFont);
		
		
		//버튼 2개 위치
		yes.setBounds(100, 360, 80, 20);
		no.setBounds(200, 360, 80, 20);
		
		//패널에 붙이기
		p.add(listy);
		p.add(scrollm);
		p.add(scrolld);
		p.add(woman);
		p.add(man);
		p.add(s);
		p.add(agree);
		p.add(yes);
		p.add(no);
		
		
		//리스트의 첫번째 항목이 강제 선택되도록 설정해주는 코드
		//만약 setSelectedIndex(3);  요렇게 되어 있다면 리스트의 네번째값이 선택되겠지.
		listy.setSelectedIndex(0);
		listm.setSelectedIndex(0);
		listd.setSelectedIndex(0);
		
		changeSample();
		
		//기본세팅
		setTitle("수행평가 연습");
		setSize(450, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	
	private void changeSample() {
		String gender="";
		if(man.isSelected()==true) {
			gender="남자";
		}
		if(woman.isSelected()==true) {
			gender="여자";
		}
		String ye=listy.getSelectedValue();
		int mo = listm.getSelectedValue();
		int da = listd.getSelectedValue();
		s.setText("성별 : "+gender+"생년월일 : "+ye+"년"+Integer.toString(mo)+"월"+Integer.toString(da)+"일");
		
	}


	public static void main(String[] args) {
		
		new Test();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==yes) {
			if(agree.isSelected()==true) {
				JOptionPane.showMessageDialog(null, "감사합니다");
				dispose();
			}
			else {
				JOptionPane.showMessageDialog(null, "개인정보동의해주세요");
				
			}
		}
	}


	@Override
	public void valueChanged(ListSelectionEvent e) {
		if(e.getSource()==man||e.getSource()==woman||e.getSource()==listy||e.getSource()==listm||e.getSource()==listd) {
			changeSample();
		}
		
	}

}
