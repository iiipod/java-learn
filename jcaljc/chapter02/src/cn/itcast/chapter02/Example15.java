package cn.itcast.chapter02;

public class Example15 {
	public static void main(String[] args) {
		int i, j;
		for ( i = 1; i <=9; i++) {
			for (j =1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("\n");
		}
	}
}
