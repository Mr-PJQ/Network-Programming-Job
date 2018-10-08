package com.hbuas.homework3;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class URLDemo {
	public static void main(String[] args) throws Exception {
		URL url = new URL("https://www.baidu.com/img/bd_logo1.png");
		URLConnection tp = url.openConnection();

		InputStream in = tp.getInputStream();
		FileOutputStream out = new FileOutputStream("file/baidu.jpg");

		byte[] a = new byte[1024];
		int length = 0;

		while ((length = in.read(a)) != -1) {
			out.write(a, 0, length);
		}
		in.close();
		out.close();
	}
}
