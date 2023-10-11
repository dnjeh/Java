package test2;

import javax.swing.JLabel;

public class cntdw implements Runnable {
	JLabel asdfg;
	String ttt;
	cntdw (JLabel asdfg) {
		this.asdfg = asdfg;
	}
	
	@Override
	public void run() {
		asdfg.getText().trim()
	}
	
}
