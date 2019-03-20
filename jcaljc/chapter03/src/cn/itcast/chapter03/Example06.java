package cn.itcast.chapter03;

public class Example06 {

	public static void main(String[] args) {
		Person06 p1 = new Person06(20);
		p1.speak();
	}

}

class Person06 {
	int age;
	
	public Person06 (int a) {
		age = a;
	}
	
	public void speak () {
		System.out.println("今年我已经" + age + "岁了!");
	}
}