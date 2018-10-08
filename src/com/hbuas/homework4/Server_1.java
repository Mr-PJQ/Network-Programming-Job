package com.hbuas.homework4;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server_1 {
	public static void main(String[] args) throws Exception{
		ServerSocket s = new ServerSocket(5555);
		Socket c = s.accept();
		System.out.println("有组织接入");
		
		OutputStream out = c.getOutputStream();
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(out));
		writer.write("你好，这里是三体。");
		
		writer.close();
		
	}
}
