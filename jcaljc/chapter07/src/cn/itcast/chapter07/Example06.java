package cn.itcast.chapter07;

import java.io.*;

public class Example06 {

	public static void main(String[] args) throws Exception {
		
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("src.txt"));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("des.txt"));
		int len;
		long begintime =System.currentTimeMillis();
		
		while ((len = bis.read()) != -1) {
		
			bos.write(len);
		
		}
		
		long endtime = System.currentTimeMillis();
		System.out.println("拷贝文件所消耗的时间是: " + (endtime - begintime) + "毫秒");
		bis.close();
		bos.close();
		
 	}

}

