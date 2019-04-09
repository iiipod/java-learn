package cn.itcast.chapter06;

import java.util.*;

public class Example11 {

	public static void main(String[] args) {
		
		Map map = new HashMap();
		map.put("1", "Jack");
		map.put(2, "Rose");
		map.put("3", "Lucy");
		
		Set keySet =map.keySet();
		Iterator it = keySet.iterator();
		
		while (it.hasNext()) {
			
			Object key = it.next();
			Object value = map.get(key);
			System.out.println(key + ":" +value);
		
		}

	}

}
