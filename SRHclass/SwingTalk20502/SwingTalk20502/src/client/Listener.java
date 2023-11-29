package client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Listener implements Runnable {
	
	String userId;
	JTextArea clientTextArea;
	JScrollPane clientScrollPane;
	
	//소켓 통신을 위한 변수
	Socket socket;
	BufferedReader br;
	BufferedWriter bw;
	
	public Listener(String userId, JTextArea clientTextArea, JScrollPane clientScrollPane) {
		this.userId = userId;
		this.clientTextArea = clientTextArea;
		this.clientScrollPane = clientScrollPane;
		
		try {
			socket = new Socket("localhost", 2023);
			
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void run() {

		try {
			bw.write("hello Java\n");
			bw.flush();
			
			//기다리기
			
			clientTextArea.append(br.readLine()+"\n");
			clientTextArea.append(br.readLine()+"\n");
			clientTextArea.append(br.readLine()+"\n");

			br.close();
			bw.close();
			socket.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
