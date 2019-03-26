package cn.itcast.chapter04;

public class Example26 {

	public static void main(String[] args) {
		int result = devide(4, -2);
		System.out.println(result);
	}
	
	public static int devide (int x, int y) {
		if (y < 0) {
			throw new DevideByMinusException("除数是负数");
		}
		
		int result = x / y;
		return result;
	}
	
}
