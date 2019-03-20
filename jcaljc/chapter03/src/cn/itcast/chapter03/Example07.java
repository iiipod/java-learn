package cn.itcast.chapter03;

public class Example07 {

	public static void main(String[] args) {
		Person07 p1 = new Person07("韩强");
		Person07 p2 = new Person07("晓英", 27);
		p1.speak();
		p2.speak();
	}

}

class Person07 {
	String name;
	int age;
	
	public Person07(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Person07(String name) {
		this.name = name;
	}
	
	public void speak() {
		System.out.println("大家好,我叫" + name + ",我今年" + age + "岁了!");
	}
}