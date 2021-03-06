package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class PhoneApp {
	public static void main(String[] args) throws IOException {
		Reader phDb = new FileReader("C:\\javaStudy\\PhoneDB.txt");
		BufferedReader bfPhDb = new BufferedReader(phDb);

		List<Person> plist = new ArrayList<Person>();

		while (true) {
			String str = bfPhDb.readLine();

			if (str == null) {
				break;
			}
			String[] sArray = str.split(",");
			Person p01 = new Person(sArray[0], sArray[1], sArray[2]);

			p01.draw();
			plist.add(p01);
		}

		bfPhDb.close();
		
	}
}
