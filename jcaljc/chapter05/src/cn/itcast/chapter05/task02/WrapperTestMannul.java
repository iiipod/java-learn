package cn.itcast.chapter05.task02;

import java.util.Arrays;
public class WrapperTestMannul {
// 实现方法与教材不同
	public static void main(String[] args) {
		String str = "20 78 9 -7 88 36 29";
		System.out.println(str);
		String [] arr = str.split(" ");
		
		int [] intarr = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			intarr[i] = Integer.parseInt(arr[i]);
		}
		
		Arrays.sort(intarr);
		
		for (int i = 0; i < intarr.length; i++) {
			System.out.print(Integer.toString(intarr[i]) + " ");
		}
	}

}
