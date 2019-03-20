package cn.itcast.chapter03;

class Person10 {
	public Person10() {
		System.out.println("无参的构造方法被调用了...");
	}
	
	public Person10 (String name) {
		this();
		System.out.println("有参的构造方法被调用了...");
	}
}

public class Example10 {

	public static void main(String[] args) {
		Person10 p = new Person10("itcast");
	}

}
