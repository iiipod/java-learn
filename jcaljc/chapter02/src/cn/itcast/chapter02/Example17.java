package cn.itcast.chapter02;

public class Example17 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int i, j;
		itcast: for (i = 1; i <=9; i++) {
			for (j = 1; j <=i; j++) {
				if (i > 5) {
					break itcast;
				}
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
