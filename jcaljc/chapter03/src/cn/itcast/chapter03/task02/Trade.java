package cn.itcast.chapter03.task02;

public class Trade {

	public static void main(String[] args) {
		Bank.bankName = "招商银行";
		Bank.welcome();
		Bank bank = new Bank("小梦", "654321", 100.0);
		bank.addMoney(500.0);
		bank.subMoney("123456", 200.0);
		bank.subMoney("654321", 1000.0);
		bank.subMoney("654321", 200.0);
		Bank.leave();
	}

}
