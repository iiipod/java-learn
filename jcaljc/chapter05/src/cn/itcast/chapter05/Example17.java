package cn.itcast.chapter05;

import java.util.Random;
public class Example17 {

	public static void main(String[] args) {
		Random r = new Random(13);
		for (int i = 0; i < 10; i++) {
			System.out.println(r.nextInt(100));
//			System.out.println(r.nextFloat());
//			System.out.println(r.nextDouble());
		}
	}

}