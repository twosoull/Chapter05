package com.javaex.ex01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferStreamApp {
	//복사
	public static void main(String[] args) throws IOException {
		InputStream in = new FileInputStream("C:\\javaStudy\\img.jpg");
		BufferedInputStream bin = new BufferedInputStream(in);//버퍼인풋스트림에 in을 업그레이드하듯 끼워줬다 물호수에 펌프를 낀격
		
		OutputStream out = new FileOutputStream("C:\\javaStudy\\img55.jpg");
		BufferedOutputStream bout = new BufferedOutputStream(out);
		
		while(true)	{
			int bData = bin.read();
			if(bData == -1) {
				
				break;
			}
			
			bout.write(bData);
		}
		
		bout.close();
		bin.close();
	}
}
