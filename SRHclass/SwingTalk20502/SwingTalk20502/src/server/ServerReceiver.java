package server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

import javax.swing.JTextArea;

public class ServerReceiver implements Runnable {
	
	Socket socket;
	JTextArea serverTextArea;
	
	BufferedReader br;
	BufferedWriter bw;
	
	public ServerReceiver(Socket socket, JTextArea serverTextArea) {
		this.socket = socket;
		this.serverTextArea = serverTextArea;

		Log("Server", "ServerReceiver 생성자 안");
		 
		try {
			
			Log("Server", "Stream 생성 전 ");
			
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			Log("Server", "br  완료");
			
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			Log("Server", "Stream 완료");
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	@Override
	public void run() {
		String str;
		
		try {
			str = br.readLine();
			
			bw.write(str + "1\n");
			bw.flush();
			bw.write(str + "2\n");
			bw.flush();
			bw.write(str + "3\n");
			bw.flush();
			
			br.close();
			bw.close();
			socket.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

	public void Log(String tag, String log) {
		serverTextArea.append("[" + tag + "]" + log + "\n");
	}
}
