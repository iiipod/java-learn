package cn.itcast.chapter06.task02;

import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;

public class UserRegister {

	public static HashSet<User> USER_DATA = new HashSet<User>();
	private static Scanner scan;
	
	public static void main(String[] args) {
		
		initData();
		
		scan = new Scanner(System.in);
		System.out.print("请输入用户名: ");
		String userName = scan.nextLine();
		System.out.print("请输入密码: ");
		String password = scan.nextLine();
		System.out.print("请重复密码: ");
		String repassword = scan.nextLine();
		System.out.print("出生日期: ");
		String birthday = scan.nextLine();
		System.out.print("手机号码: ");
		String telNumber = scan.nextLine();
		System.out.print("电子邮箱: ");
		String email = scan.nextLine();
		
		CheckInfo checkInfo = new CheckInfo(USER_DATA);
		String result = checkInfo.checkAction(userName,password,repassword,birthday,telNumber,email);
		System.out.println("注册结果:" + result);
		
	}

	private static void initData() {
		
		User user = new User("张正", "zz, 123", new Date(), "18810319240", "zhangzheng@itcast.cn");
		User user2 = new User("周琦", "zq, 123", new Date(), "18618121193", "zhouqi@itcast.cn");

		USER_DATA.add(user);
		USER_DATA.add(user2);
		
	}
	
}
