package cn.itcast.chapter07;

import java.io.*;

public class Example05 {

	public static void main(String[] args) throws Exception {
		
		InputStream in = new FileInputStream("source/sample.log");
		OutputStream out = new FileOutputStream("target/sample.log");
		byte[] buffer = new byte[1024];
		int len;
		long begintime =System.currentTimeMillis();
		
		while ((len = in.read(buffer)) != -1) {
		
			out.write(buffer, 0, len);
		
		}
		
		long endtime = System.currentTimeMillis();
		System.out.println("拷贝文件所消耗的时间是: " + (endtime - begintime) + "毫秒");
		in.close();
		out.close();
		
 	}

}

