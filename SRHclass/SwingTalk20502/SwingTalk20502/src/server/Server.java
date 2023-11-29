package server;

import java.awt.Color;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

public class Server extends JFrame {
	
	JTextArea serverText;
	JScrollPane serverScroll;
	
	ServerSocket serverSocket;
	Socket socket;
	
	Server() {
		
		init();
		ready();
		
	}
	
	private void init() {
		
		JPanel p = new JPanel();
		
		serverText = new JTextArea(20, 34);
		serverText.setBackground(Color.yellow);
		
		serverScroll = new JScrollPane(serverText);
		serverScroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		add(p);
		p.add(serverScroll);
		
		setTitle("Chat server");
		setSize(400, 410);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
	private void ready() {
		
		try {
			Log("Server", "서버소켓생성요청");
			serverSocket = new ServerSocket(2023);
			for(;;) {
				Log("Server", "클라이언트 요청 대기중");
				socket = serverSocket.accept(); //클라이언트가 요청하지 않으면 accept 내부에서 무한 대기
				
			//소켓 생성댐
				Log("Server", "클라이언트 요청 수락됨");
					
				ServerReceiver serverReceiver = new ServerReceiver(socket, serverText);
				Thread thread = new Thread(serverReceiver);
				thread.start();
				
				Log("Server", "클라이언트 소켓 시작됨");
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void Log(String tag, String log) {
		serverText.append("[" + tag + "]" + log + "\n");
	}

	public static void main(String[] args) {
		new Server();
	}
}
