package cn.itcast.chapter03;

class Person02 {
	void say() {
		System.out.println("我是一个人!");
	}
}

class Example02 {

	public static void main(String[] args) {
		Person02 p2 = new Person02();
		p2.say();
		p2 = null;
//		p2.say();

	}

}
