package cn.itcast.chapter07;

import java.io.*;

public class Example04 {

	public static void main(String[] args) throws Exception {
		
		InputStream in = new FileInputStream("source/PlaneGnomeManjaro-1.2.zip");
		OutputStream out = new FileOutputStream("target/PlaneGnomeManjaro-1.2.zip");
		int len;
		long begintime =System.currentTimeMillis();
		
		while ((len = in.read()) != -1) {
		
			out.write(len);
		
		}
		
		long endtime = System.currentTimeMillis();
		System.out.println("拷贝文件所消耗的时间是: " + (endtime - begintime) + "毫秒");
		in.close();
		out.close();
		
 	}

}
