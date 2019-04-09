package cn.itcast.chapter06;

import java.util.*;

public class Example16 {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		list.add("String");
		list.add("Collection");
//		list.add(1);
		
		for (Object object : list) {
			
			String str = (String) object;
			System.out.println(str);
			
		}
		
	}

}
