package cn.itcast.chapter04;

class Animal16 {
	void shout() {
		System.out.println("动物叫!");
	}
}
public class Example16 {

	public static void main(String[] args) {
		Animal16 an = new Animal16();
		System.out.println(an.toString());
		System.out.println(an.getClass());
		System.out.println(an.hashCode());
	}

}
