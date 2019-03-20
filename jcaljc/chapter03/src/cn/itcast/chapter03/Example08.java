package cn.itcast.chapter03;

public class Example08 {

	public static void main(String[] args) {
//		Person08 p = new Person08();
		Person08 p = new Person08(16);
	}

}

class Person08 {
	int age;
	
	public Person08(int x) {
		age = x;
	}
}