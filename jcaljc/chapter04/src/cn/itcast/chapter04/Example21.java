package cn.itcast.chapter04;

public class Example21 {

	public static void main(String[] args) {
		try {
			int result = devide(4, 0);
			System.out.println(result);
		} catch (Exception e) {
			System.out.println("捕获的异常信息为: " + e.getMessage());
			e.printStackTrace();

		} 
		System.out.println("程序继续向下执行...");
	}
	
	public static int devide(int x, int y) {
		int result = x / y;
		return result;
	}

}
