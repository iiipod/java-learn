package cn.itcast.chapter04;

public class Example24 {

	public static void main(String[] args) {
		try {
			int result = devide(4, 2);
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static int devide(int x, int y) throws Exception {
		int result = x / y;
		return result;
	}
	
}
