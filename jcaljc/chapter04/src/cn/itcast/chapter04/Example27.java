package cn.itcast.chapter04;

public class Example27 {

	public static void main(String[] args) {
		try {
			int result = devide(4, -2);
			System.out.println(result);
		} catch (DevideByMinusException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static int devide (int x, int y) throws DevideByMinusException {
		if (y < 0) {
			throw new DevideByMinusException("除数是负数");
		}
		
		int result = x / y;
		return result;
	}
	
}
