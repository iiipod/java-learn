package cn.itcast.chapter04;

interface Animal15 {
	void shout();
}

class Cat15 implements Animal15 {
	public void shout() {
		System.out.println("喵喵...");
	}
	
	void sleep() {
		System.out.println("猫睡觉...");
	}
}

class Dog15 implements Animal15 {
	public void shout() {
		System.out.println("汪汪...");
	}
}

public class Example15 {

	public static void main(String[] args) {
		Dog15 dog = new Dog15();
		animalShout(dog);		
	}

	public static void animalShout(Animal15 animal) {
		if (animal instanceof Cat15) {
		Cat15 cat = (Cat15) animal;
		cat.sleep();
		cat.shout();
		} else {
			System.out.println("this animal is not a cat");
		}
	}
}
