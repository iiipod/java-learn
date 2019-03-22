package cn.itcast.chapter04;

class Animal03 {
	String name = "动物";
	
	void shout() {
		System.out.println("动物发出叫声");
	}
	
}

class Dog03 extends Animal03 {
	String name = "犬类";
	
	void shout() {
		super.shout();
	}
	
	public void pringName() {
		System.out.println("name = " + super.name);
	}
	
}

public class Example03 {

	public static void main(String[] args) {
		Dog03 dog = new Dog03();
		dog.shout();
		dog.pringName();
	}
	
}
