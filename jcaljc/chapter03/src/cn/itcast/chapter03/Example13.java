package cn.itcast.chapter03;

class Person13 {
	public static void sayHello() {
		System.out.println("Hello");
	}
}

public class Example13 {

	public static void main(String[] args) {
		Person13.sayHello();
		
		Person13 p = new Person13();
		p.sayHello();
	}

}
