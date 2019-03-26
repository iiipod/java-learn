package cn.itcast.chapter04;

public class Example23 {

	public static void main(String[] args) {
		int result = devide(4, 2);
		System.out.println(result);
	}

	public static int devide(int x, int y) throws Exception {
		int result = x / y;
		return result;
	}
	
}
