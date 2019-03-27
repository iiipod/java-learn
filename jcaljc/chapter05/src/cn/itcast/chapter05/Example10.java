package cn.itcast.chapter05;

public class Example10 {

	public static void main(String[] args) {
		
		long startTime = System.currentTimeMillis();
		int sum = 0;
		
		for (int i = 0; i < 10000000; i++) {
			sum += i;
		}
		
		long endTime = System.currentTimeMillis();
		System.out.println("程序运行的时间为: " + (endTime - startTime) + "毫秒");

	}

}
