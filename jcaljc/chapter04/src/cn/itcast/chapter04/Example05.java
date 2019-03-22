package cn.itcast.chapter04;

class Animal05 {
	
	public Animal05() {
		System.out.println("我是一只小动物");
	}
	
	public Animal05(String name) {
		System.out.println("我是一只" + name);
	}
	
}

class Dog05 extends Animal05 {
	public Dog05() {}
}

public class Example05 {

	public static void main(String[] args) {
//		Dog04 dog = new Dog04();
		new Dog05();
	}

}
