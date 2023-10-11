package test1;

import javax.swing.JLabel;

//1초마다 숫자의 값을 1씩 줄여주는 스레드를 생성하는 test 프로젝트의 test1 패키지에 소속된 클래스
public class CountDownTimer implements Runnable {
	
	JLabel timerNumber;
	public CountDownTimer(JLabel timerNumber) {
		this.timerNumber = timerNumber;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		String temp;
		while(true) {
			temp = timerNumber.getText().trim();
			if(temp.equals("0")) {
				return;
			}
			timerNumber.setText(Integer.toString(Integer.parseInt(temp)-1));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				return;
			}
		}
	}

}
