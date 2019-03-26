package cn.itcast.chapter04;

interface Animal14 {
	void shout();
}

class Cat14 implements Animal14 {
	public void shout() {
		System.out.println("喵喵...");
	}
	
	void sleep() {
		System.out.println("猫睡觉...");
	}
}


public class Example14 {

	public static void main(String[] args) {
		Cat14 cat = new Cat14();
		animalShout(cat);
	}
	
	public static void animalShout(Animal14 an) {
//		Cat14 cat = (Cat14) an;
		cat.shout();
		cat.sleep();
	}

}
