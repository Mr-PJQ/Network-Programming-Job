package com.hbuas.homework4;

import java.io.*;
import java.net.Socket;

public class Client_2 {


	public static void main(String[] args) throws Exception{
		Socket c = new Socket("localhost",5555);
		
		InputStream in = c.getInputStream();
		BufferedReader reader = new BufferedReader(new InputStreamReader(in));
		
		String message = reader.readLine();
		
		reader.close();
		
		System.out.println("从服务端接收信息为：" + message);

	}

}
