package com.hbuas.homework4;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server_2 {
	public static void main(String[] args) throws Exception {
		ServerSocket s = new ServerSocket(5555);
		Socket c = s.accept();
		System.out.println("����֯����");
		System.out.println("�����뷢����Ϣ��");

		OutputStream out = c.getOutputStream();
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(out));

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String serverMessage = reader.readLine();

		writer.write(serverMessage);

		writer.close();
		reader.close();
	}
}
