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
		Person p02 = new Person("이영훈", "010-5555-7777", "카카오프렌즈");
		plist.add(p02);

		Writer pWriter = new FileWriter("C:\\javaStudy\\NewPhoneDB.txt");
		BufferedWriter bWPerson = new BufferedWriter(pWriter);

		for (int i = 0; i < plist.size(); i++) {
			bWPerson.write(plist.get(i).getName() + "," + plist.get(i).getHp() + "," + plist.get(i).getCompany());
			bWPerson.newLine();
		}
		bWPerson.close();
	}
}
