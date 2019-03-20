package cn.itcast.chapter03;

class Person11 {
	public void finalize() {
		System.out.println("对象将被作为垃圾回收...");
	}
}
public class Example11 {

	public static void main(String[] args) {
		Person11 p1 = new Person11();
		Person11 p2 = new Person11();
		p1 = null;
		p2 = null;
		System.gc();
		for (int i = 0; i < 1000000; i++) {
			
		}

	}

}
