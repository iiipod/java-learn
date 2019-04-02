package cn.itcast.chapter06;

import java.util.*;

public class Example07 {

	public static void main(String[] args) {
		
		HashSet set = new HashSet();
		set.add("Jack");
		set.add("Eve");
		set.add("Rose");
		set.add("Rose");
		
		Iterator it = set.iterator();
		
		while (it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
	}

}
