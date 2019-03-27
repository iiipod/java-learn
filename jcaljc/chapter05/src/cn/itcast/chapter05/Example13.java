package cn.itcast.chapter05;

import java.io.IOException;

public class Example13 {

	public static void main(String[] args) throws IOException{
		Runtime rt = Runtime.getRuntime();
		rt.exec("/usr/bin/ls");
//		rt.exec("notepad.exe");
	}

}
