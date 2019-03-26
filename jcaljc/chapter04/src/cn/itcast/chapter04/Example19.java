package cn.itcast.chapter04;

interface Animal19 {
	void shout();
}

public class Example19 {

	public static void main(String[] args) {
		animalShout(new Animal19() {
			public void shout() {
				System.out.println("喵喵...");
			}
		});
	}
	
	public static void animalShout(Animal19 an) {
		an.shout();
	}
}