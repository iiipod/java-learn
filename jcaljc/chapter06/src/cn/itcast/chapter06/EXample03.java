package cn.itcast.chapter06;

import java.util.*;

public class EXample03 {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		list.add("data_1");
		list.add("data_2");
		list.add("data_3");
		list.add("data_4");
		Iterator it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
//			Object obj = it.next();
//			System.out.println(obj);
		}
	}

}
