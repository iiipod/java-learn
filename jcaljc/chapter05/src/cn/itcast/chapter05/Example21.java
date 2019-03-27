package cn.itcast.chapter05;

public class Example21 {

	public static void main(String[] args) {
		int w = Integer.parseInt("20");
		int h = Integer.parseInt("10");
		for (int i = 0; i < h; i++) {
			StringBuffer sb = new StringBuffer()	;
			for (int j = 0; j < w; j++) {
				sb.append("*");
			}
			System.out.println(sb.toString());
		}

	}

}
