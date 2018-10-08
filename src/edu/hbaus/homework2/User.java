package edu.hbaus.homework2;

import java.io.Serializable;

public class User implements Serializable{

	String username;
	String password;
	String regTime;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRegTime() {
		return regTime;
	}
	public void setRegTime(String regTime) {
		this.regTime = regTime;
	}
	@Override
	public String toString() {
		return "username = " + username + "\n" +
		       "password = " + password + "\n" +
		       "regTime = " + regTime;
	}
	
	
}
