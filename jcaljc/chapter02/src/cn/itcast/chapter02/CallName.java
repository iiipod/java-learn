package cn.itcast.chapter02;

import java.util.Scanner;
import java.util.Random;

public class CallName {

	private static Scanner sc;

	public static void main(String[] args) {
		String [] st = new String[3];
		shuRu(st);
		xianShi(st);
		dianMing(st);
	}

	public static void shuRu(String[] st) {
		System.out.println("--------随机点名器--------");
		for (int i = 0; i < st.length; i++) {
			sc = new Scanner(System.in);
			System.out.println("存储第" + (i + 1) + "个姓名");
			st[i] = sc.next();
		}
	}
	public static void xianShi(String[] st) {
		for (int i = 0; i < st.length; i++) {
			System.out.println("第" + (i + 1) + "个学生姓名:" + st[i]);		
		}
	}
	
	public static void dianMing(String[] st) {
		int random =new  Random().nextInt(st.length);
		System.out.println("被点到名的同学是:" + st[random]);
	}
}
