package cn.itcast.chapter06;

import java.util.ArrayList;

public class Example01 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("stu1");
		list.add("stu2");
		list.add("stu3");
		list.add("stu4");
		System.out.println("集合的长度: " + list.size());
		System.out.println("第2个元素是: " + list.get(1));
	}

}
