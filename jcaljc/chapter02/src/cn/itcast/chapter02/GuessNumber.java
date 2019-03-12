package cn.itcast.chapter02;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int num = new  Random().nextInt(10);
		System.out.println("随机数已生成!");
		System.out.println("----请输入您猜的数字:----");
		Scanner sc = new Scanner(System.in);
		int inputNumber = sc.nextInt();
		
		while (num != inputNumber) {
		    if (num > inputNumber) {
				System.out.println("<<<");

			} else if (num < inputNumber) {
				System.out.println(">>>");
			}
		    
		     inputNumber = sc.nextInt();
		    
		}
		System.out.println("VVVVVVVVVVVV");
	}
}
