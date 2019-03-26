package cn.itcast.chapter04;

interface Animal13 {
	void shout();
}

class Cat13 implements Animal13 {
	public void shout() {
		System.out.println("喵喵...");
	}
}

class Dog13 implements Animal13 {
	public void shout() {
		System.out.println("汪汪...");
	}
}

public class Example13 {

	public static void main(String[] args) {
		Animal13 an1 = new Cat13();
		Animal13 an2 = new Dog13();
		animalShout(an1);
		animalShout(an2);
	}
	
	public static void animalShout(Animal13 an) {
		an.shout();
	}

}
