package cn.itcast.chapter02;

public class Example20 {

	public static void main(String[] args) {
		printRectangle(3, 5);
		printRectangle(2, 4);
		printRectangle(6, 10);
	}

	public static void printRectangle(int x, int y) {
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		System.out.print("\n");
	}
}
