package cn.itcast.chapter07;

import java.io.*;

public class Example03 {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream out = new FileOutputStream("output.txt", true);
		String str = "欢迎你!";
		byte[] b = str.getBytes();
		
		for (int i = 0; i < b.length; i++) {
			
			out.write(b[i]);
		
		}
		
		out.close();
	}

}
