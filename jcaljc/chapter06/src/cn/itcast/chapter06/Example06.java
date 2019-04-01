package cn.itcast.chapter06;

import java.util.*;

public class Example06 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("Jack");
		list.add("Annie");
		list.add("Rose");
		list.add("Tom");
		Iterator it = list.iterator();
		while (it.hasNext()) {
			Object obj = it.next();
			if ("Annie".equals(obj)) {
//				break;
//				list.remove(obj);
				it.remove();
			}
		}
		
		System.out.println(list);
	}

}
