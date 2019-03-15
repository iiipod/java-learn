package cn.itcast.chapter02;

public class Example21 {

	public static void main(String[] args) {
		int area = getArea(3, 5);
		System.out.println("The area is " + area);
	}

	public static int getArea(int x, int y) {
		return x * y;
	}
}
