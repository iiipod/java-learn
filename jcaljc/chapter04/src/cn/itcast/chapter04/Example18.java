package cn.itcast.chapter04;

interface Animal18 {
	void shout();
}

public class Example18 {

	public static void main(String[] args) {
		class Cat implements Animal18 {
			public void shout() {
				System.out.println("喵喵...");
			}
		}
		
		animalShout(new Cat());
	}
	
	public static void animalShout(Animal18 an) {
		an.shout();
	}
}
