package edu.hbaus.homework2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ObjectStreamDemo {

	public static void main(String[] args) throws Exception{
	
		Date date= new Date();
		SimpleDateFormat time = new SimpleDateFormat();
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("file/1.txt"));
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("file/1.txt"));
		
		User user = new User();
		user.username = "admin";
		user.password = "123456";
		user.regTime = time.format(date);
		
		out.writeObject(user);
		
		User readuser = (User)in.readObject();
		
		System.out.println(readuser);

		out.close();
		in.close();
		
	}

}
