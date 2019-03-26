package cn.itcast.chapter04;

public class Example25 {

	public static void main(String[] args) {
		int result = devide(4, 0);
		System.out.println(result);
	}
	
	public static int devide(int x, int y) throws Exception {
		int result = x / y;
		return result;
	}
}
