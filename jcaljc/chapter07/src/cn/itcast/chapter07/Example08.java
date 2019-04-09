package cn.itcast.chapter07;

import java.io.*;

public class Example08 {

	public static void main(String[] args) throws Exception {
		
		FileWriter writer = new FileWriter("writer.txt");
//		FileWriter writer = new FileWriter("writer.txt",true);
		String str = "你好,传智播客";
		writer.write(str);
		writer.write("\r\n");
		writer.close();
		
	}

}
