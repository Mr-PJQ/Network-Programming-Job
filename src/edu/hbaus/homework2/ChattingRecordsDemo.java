package edu.hbaus.homework2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class ChattingRecordsDemo {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new FileWriter("file/Records.txt"));

		
		for (int i = 0; i < 10; i++) {
		
				bw.write(br.readLine());
				bw.flush();
				bw.newLine();
		}
	
		br.close();
		bw.close();

	}

}
