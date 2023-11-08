package helloSwing;

import javax.swing.JFrame;

//프레임을 상속
public class HelloSwing extends JFrame {
	//생성자에서 화면을 만들어주기
	HelloSwing() {
		//화면 세팅
		setTitle("Hello Swing!");
		setSize(300, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	public static void main(String[] args) {
		//생성자를 호출
		new HelloSwing();
	}
}
