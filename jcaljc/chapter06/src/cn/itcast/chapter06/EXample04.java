package cn.itcast.chapter06;

import java.util.*;

public class EXample04 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("Jack");
		list.add("Rose");
		list.add("Tom");
		for (Object obj : list) {
			System.out.println(obj);
		}
	}

}
