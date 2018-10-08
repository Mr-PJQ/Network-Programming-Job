package com.hbuas.homework4;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server_2 {
	public static void main(String[] args) throws Exception {
		ServerSocket s = new ServerSocket(5555);
		Socket c = s.accept();
		System.out.println("有组织接入");
		System.out.println("请输入发送信息：");

		OutputStream out = c.getOutputStream();
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(out));

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String serverMessage = reader.readLine();

		writer.write(serverMessage);

		writer.close();
		reader.close();
	}
}
