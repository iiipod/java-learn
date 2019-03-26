package cn.itcast.chapter04;

interface Animal12 {
	String ANIMAL_BEHAVIOR = "动物的行为";
	
	void breathe();
	
	void run();
}

interface LandAnimal extends Animal12 {
	void liveOnLand();
}

class Dog12 implements LandAnimal {
	
	public void breathe() {
		System.out.println(ANIMAL_BEHAVIOR + ":狗在呼吸");
	}
	
	public void run() { 
		System.out.println(ANIMAL_BEHAVIOR + ":狗在奔跑");
	}
	
	public void liveOnLand() {
		System.out.println("狗是陆地上的动物...");
	}
	
}

public class Example12 {

	public static void main(String[] args) {
		Dog12 dog = new Dog12();
		dog.breathe();
		dog.run();
		dog.liveOnLand();
	}
	
}

