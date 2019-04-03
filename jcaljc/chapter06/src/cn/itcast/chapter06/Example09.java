package cn.itcast.chapter06;

import java.util.*;

class Student09 {
	
	String id;
	String name;
	
	public Student09(String id, String name) {
		
		this.id = id;
		this.name = name;
		
	}
	
	public String toString() {
		
		return id + ":" + name;
		
	}
	
	public int hashCode() {
		
		return id.hashCode();
	
	}
	
	public boolean equals(Object obj) {
		
		if (this == obj) {
			
			return true;
		
		}
		
		if (!(obj instanceof Student09)) {
			
			return false;
			
		}
		
		Student09 stu = (Student09) obj;
		boolean b = this.id.equals(stu.id);
//		System.out.println(b);
		return b;
		
	}
	
}

public class Example09 {

	public static void main(String[] args) {
		
		HashSet hs = new HashSet();
		Student09 stu1 = new Student09("1", "Jack");
		Student09 stu2 = new Student09("2", "Rose");
		Student09 stu3 = new Student09("2", "Rose");
		hs.add(stu1);
		hs.add(stu2);
		hs.add(stu3);
		System.out.println(hs);
		
	}

}
