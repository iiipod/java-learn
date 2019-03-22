package cn.itcast.chapter03.task02;

public class Bank {
	static String bankName;
	private String name;
	private String password;
	private double money;
	private double turnover;
	
	public static void welcome() {
		System.out.println("欢迎来到"+ bankName + "银行-----------");
	}
	
	public Bank(String name, String password, double turnover) {
		this.name = name;
		this.password = password;
		this.turnover = turnover;
		this.money = this.turnover - 10;
		System.out.println(name +" 开户成功,账户余额" + this.money);
	}
	
	public void addMoney (double turnover) {
		this.money += turnover;
		System.out.println(name + "您好,您的账户 已存入" + turnover + "元,当前余额" + this.money + "元" );
	}
	
	public void subMoney(String password, double turnover) {
		if (this.password != password ) {
			System.out.println("您输入的密码错误!");
			return;
		}
		
		if (this.money > turnover) {
			this.money -= turnover;
			System.out.println(name + "您好,您的账户 已取出" + turnover + "元,当前余额" + this.money + "元");
		} else {
			System.out.println("对不起,账户余额不足!");
		}
	}
	
	static void leave() {
		System.out.println("请携带好随身物品,欢迎下次光临" + bankName + "----------	");
	}
}
