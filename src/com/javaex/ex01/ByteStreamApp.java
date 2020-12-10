package com.javaex.ex01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ByteStreamApp {
	
		public static void main(String[] args) throws IOException{
			//복사
			InputStream in = new FileInputStream("C:\\javaStudy\\img.jpg");
			OutputStream out = new FileOutputStream("C:\\javaStudy\\buffimg.jpg");
			//속도 향상을 위해 배열로 답아준다
			
			byte[] buff = new byte[1024];
			System.out.println("복사시작(쟁반)");
			while(true) {
				int bData = in.read(buff); //()안에 쟁반을 담아주면 거기에 최대한 담아서 반환해준다
				
				if(bData == -1) {
				System.out.println("복사끝(쟁반)");
					break;
				}
				out.write(buff); // bData가 아니라 데이터가 담겨진 쟁반째로 준다
			}
			
			
			
//			InputStream in = new FileInputStream("C:\\javaStudy\\img.jpg");
//			
//			OutputStream out = new FileOutputStream("C:\\javaStudy\\byteimg.jpg");
//			System.out.println("복사시작");
//			while(true) {
//				int bData = in.read();
//				
//				//in.read()는 데이터를 읽는데 알수없는 숫자들을 보낸다 하지만 마지막에 작업이 끝나면 -1을 송출한다
//				if(bData == -1) {//데이터의 마지막 인지 체크
//					System.out.println("복사끝 ");
//					break;		//마지막이면 탈출
//				}
//				out.write(bData);//데이터가 있으면 쓴다.
//			}
//			
//			//일이 끝나면 끝내준다
//			out.close();
//			in.close();
				}
}
